package android.terminology.Fragment;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.terminology.DataTerms.AndroidTerm;
import android.terminology.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SelectFragment extends Fragment {
    private TextView description;
    private TextView title;
    String title_get ,des_get;
    public SelectFragment(){

    }
    @SuppressLint("ValidFragment")
    public SelectFragment(AndroidTerm term) {
        title_get=term.getTitle();
        des_get=term.getDescription();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.fragment_card,null);
       description=view.findViewById(R.id.textDescription);
       title=view.findViewById(R.id.textTitle);
       description.setText(des_get);
       title.setText(title_get);
       return  view;
    }
}