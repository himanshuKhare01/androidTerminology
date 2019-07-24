package android.Guide.Adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.Guide.R;
import android.Guide.model.InputModel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class InputRecyclerAdapter extends RecyclerView.Adapter<InputRecyclerAdapter.MyViewHoder> {
    private List<InputModel> modelsl;
    private Context context;
    public InputRecyclerAdapter(Context con,List<InputModel> model){
        context=con;
        modelsl=model;
    }
    @NonNull
    @Override
    public MyViewHoder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View v= LayoutInflater.from(context).inflate(R.layout.list_item2,viewGroup,false);
        return new MyViewHoder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHoder myViewHoder, int i) {
             myViewHoder.title.setText(modelsl.get(i).getTitle());
             myViewHoder.des.setText(modelsl.get(i).getDescription());
    }
    @Override
    public int getItemCount() {
        return modelsl.size();
    }

    public class MyViewHoder extends RecyclerView.ViewHolder {
        TextView title;
        TextView des;
        MyViewHoder(View c){
            super(c);
            title=c.findViewById(R.id.title);
            des=c.findViewById(R.id.description);
        }
    }
}
