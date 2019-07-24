package android.Guide.Fragment;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.Guide.Adapter.RecyclerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.Guide.R;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private RecyclerAdapter adapter;
    ArrayList<String> days;
    ArrayList<String> Description;
    public MainFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        initial(v);
        return v;
    }

    private void initial(View view) {
        //appBarLayout = getActivity().findViewById(R.id.appbar);
        recyclerView = view.findViewById(R.id.recyclerView);
        days = new ArrayList<>(Arrays.asList("Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6", "Day 7", "Day 8", "Day 9", "Day 10", "Day 11", "Day 12", "Day 13", "Day 14", "Day 15"));
        Description = new ArrayList<>(Arrays.asList("Introduction", "Activities", "Testing and Debugging", "User Interaction", "User Experience", "Testing UI", "Background Tasks", "More on background tasks", "Preferences and Settings", "SQLite", "Content Providers", "Loaders", "PSP", "Firebase and Admob", "Publish"));
        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new RecyclerAdapter(days, Description, getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
