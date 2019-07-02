package android.terminology.Adapter;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.terminology.Activity.StackCardActivity;
import android.terminology.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

import static android.content.Context.MODE_PRIVATE;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private ArrayList<String> list1;
    private ArrayList<String> list2;
    private Context context;
    public RecyclerAdapter(ArrayList list1, ArrayList list2, Context context) {
        this.list1 = list1;
        this.list2 = list2;
        this.context = context;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
         View v=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
         return new MyViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder viewHolder, final int i) {
          viewHolder.days.setText(list1.get(i));
          viewHolder.des.setText(list2.get(i));
          viewHolder.gifImageView.setImageResource(R.drawable.gif+(i%5));
          Animation animation=AnimationUtils.loadAnimation(context,R.anim.main_animation);
          viewHolder.linearLayout.startAnimation(animation);
          viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  int index=context.getSharedPreferences("index",MODE_PRIVATE).getInt("color",0);
                  context.startActivity(new Intent(context,StackCardActivity.class).putExtra("index",index).putExtra("des",list2.get(i)).putExtra("num",i));
              }
          });
    }
    @Override
    public int getItemCount() {
        return list1.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView days;
        private TextView des;
        private LinearLayout linearLayout;
        private CardView cardView;
        private GifImageView gifImageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            days=itemView.findViewById(R.id.text1);
            des=itemView.findViewById(R.id.text2);
            linearLayout=itemView.findViewById(R.id.layout);
            cardView=itemView.findViewById(R.id.card);
            gifImageView=itemView.findViewById(R.id.gif);
        }
    }
}