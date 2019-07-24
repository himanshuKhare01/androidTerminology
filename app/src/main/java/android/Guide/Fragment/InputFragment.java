package android.Guide.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.Guide.Activity.MainActivity;
import android.Guide.Adapter.InputRecyclerAdapter;
import android.Guide.Database.InputDatabaseHelper;
import android.Guide.RecyclerTouchListener.MyTouchListener;
import android.Guide.model.InputModel;
import android.text.InputType;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.Guide.R;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class InputFragment extends Fragment{
    private LinearLayout linearLayout;
    private EditText input1;
    private EditText input2;
    private InputDatabaseHelper inputDatabaseHelper;
    private List<InputModel> list=new ArrayList<>();
    private InputRecyclerAdapter inputRecyclerAdapter;
    private TextView textView;
    private RecyclerView recyclerView;
     FloatingActionButton button;
     public InputFragment(){
     }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_input, container, false);
        button = v.findViewById(R.id.floating);
        textView=v.findViewById(R.id.inputText);
        ((MainActivity)getActivity()).setFragmentRefreshListener(new MainActivity.FragmentRefreshListener() {
            @Override
            public void onRefresh() {
                int i=getActivity().getSharedPreferences("index",Context.MODE_PRIVATE).getInt("color1",0);
                 if(i!=0)
                button.setSupportImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.color+i)));
                else
                button.setSupportImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.color)));
            }
        });
        recyclerView = v.findViewById(R.id.recyclerView2);
         setNew();
        list.addAll(inputDatabaseHelper.getAllData());
        setLayout();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linearLayout.getParent()!=null)
                    ((ViewGroup)linearLayout.getParent()).removeView(linearLayout);
                final AlertDialog dialog = new AlertDialog.Builder(new ContextThemeWrapper(getActivity(),R.style.myDialog))
                        .setTitle("Enter new term")
                        .setCancelable(false)
                        .setPositiveButton("Enter", null)
                        .setNegativeButton("Cancel", null)
                        .setView(linearLayout)
                        .show();
                showInputDialog(dialog);
            }
        });
        inputRecyclerAdapter=new InputRecyclerAdapter(getActivity(),list);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(inputRecyclerAdapter);
        if(inputRecyclerAdapter.getItemCount()!=0)
            textView.setVisibility(View.GONE);
        else
            textView.setVisibility(View.VISIBLE);
        recyclerView.addOnItemTouchListener(new MyTouchListener(getActivity(),
                recyclerView, new MyTouchListener.ClickListener(){
            @Override
            public void onClick(View view, final int position) {
            }
            @Override
            public void onLongClick(View view, int position) {
                showActionsDialog(position);
            }
        }));
        return v;
    }
    private void showActionsDialog(final int position) {
        CharSequence choose[]=new CharSequence[]{"Edit","Delete"};
        final AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
        dialog.setTitle("Choose an option");
        dialog.setItems(choose, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(which==0) {
                    InputModel model=list.get(position);
                    String title=model.getTitle();
                    String des=model.getDescription();
                    updateNote(title,des,position);
                }else{
                    deleteNote(position);
                    if(inputRecyclerAdapter.getItemCount()==0){
                        textView.setVisibility(View.VISIBLE);
                    }
                }
            }
        });
        dialog.show();
    }
    private void updateNote(final String title,final String des,final int position) {
        final AlertDialog dialog = new AlertDialog.Builder(getActivity())
                .setTitle("Edit")
                .setCancelable(false)
                .setPositiveButton("Enter", null)
                .setNegativeButton("Cancel", null)
                .setView(linearLayout)
                .show();
        input1.setText(title);
        input2.setText(des);
        Button positive=dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateTitle(input1)&&validateDes(input2)) {
                    InputModel input = list.get(position);
                    input.setTitle(input1.getText().toString());
                    input.setDescription(input2.getText().toString());
                    inputDatabaseHelper.updateTerm(input);
                    list.set(position, input);
                    inputRecyclerAdapter.notifyItemChanged(position);
                    dialog.dismiss();
                }
            }
        });
    }
    private void deleteNote(int position) {
        inputDatabaseHelper.deleteNode(list.get(position));
        list.remove(position);
        inputRecyclerAdapter.notifyItemRemoved(position);
    }
    private void showInputDialog(final AlertDialog dialog) {
        Button positive=dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateTitle(input1)&&validateDes(input2)) {
                    String title=input1.getText().toString();
                    String description=input2.getText().toString();
                    long id= inputDatabaseHelper.insertData(title,description);
                    InputModel inputModel=inputDatabaseHelper.getParticularData(id);
                    if(inputModel!=null){
                        list.add(0,inputModel);
                        textView.setVisibility(View.GONE);
                        inputRecyclerAdapter.notifyDataSetChanged();
                    }
                    dialog.dismiss();
                }
            }
        });
    }
    private boolean validateTitle(EditText textEnter) {
        String emailInput = textEnter.getText().toString().trim();
        if (emailInput.isEmpty()) {
            textEnter.setError("Field can't be empty");
            return false;
        } else {
            textEnter.setError(null);
            return true;
        }
    }
    private boolean validateDes(EditText textEnter ) {
        String usernameInput = textEnter.getText().toString().trim();
        if (usernameInput.isEmpty()) {
            textEnter.setError("Field can't be empty");
            return false;
        } else {
            textEnter.setError(null);
            return true;
        }
    }
    public void setLayout(){
        input1.setHint("Enter title");
        input1.setInputType(InputType.TYPE_CLASS_TEXT);
        input2.setHint("Enter Description");
        input2.setInputType(InputType.TYPE_TEXT_VARIATION_LONG_MESSAGE);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setPadding(10,10,10,0);
        final TextInputLayout layout1 = new TextInputLayout(getActivity());
        layout1.setErrorEnabled(true);
        final TextInputLayout layout2 = new TextInputLayout(getActivity());
        layout2.setErrorEnabled(true);
        if(input1.getParent()!=null)
            ((ViewGroup)input1.getParent()).removeView(input1);
        layout1.addView(input1);
        if(layout1.getParent()!=null)
            ((ViewGroup)layout1.getParent()).removeView(layout1);
        linearLayout.addView(layout1);
        if(input2.getParent()!=null)
            ((ViewGroup)input2.getParent()).removeView(input2);
        layout2.addView(input2);
        if(layout2.getParent()!=null)
            ((ViewGroup)layout2.getParent()).removeView(layout2);
        linearLayout.addView(layout2);
    }
    private void setNew() {
        linearLayout=new LinearLayout(getActivity());
        input1=new EditText(getActivity());
        input2=new EditText(getActivity());
        inputDatabaseHelper=new InputDatabaseHelper(getActivity());
    }
}