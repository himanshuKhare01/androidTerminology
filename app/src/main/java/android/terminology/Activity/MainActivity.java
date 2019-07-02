package android.terminology.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.terminology.Fragment.InputFragment;
import android.terminology.Fragment.MainFragment;
import android.terminology.R;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Objects;
public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;
ViewPager viewPager;
FloatingActionButton changeBack;
int mainCount=0,inputCount=0;
int index=0;
private SharedPreferences preferencesColor;
private RelativeLayout layout;
private Window window;
private FragmentRefreshListener fragmentRefreshListener;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tabs);
        viewPager=findViewById(R.id.viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager,true);
        setUpTabsIcon();
        initial();
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
              if(tab.getPosition()==0) {
                  mainCount=preferencesColor.getInt("color",0);
                  setBackground(mainCount,0);
              }else {
                  inputCount=preferencesColor.getInt("color1",0);
                  setBackground(inputCount,1);
              }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    Objects.requireNonNull(tabLayout.getTabAt(0)).getIcon().setTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorBoundary)));
                } else
                    Objects.requireNonNull(tabLayout.getTabAt(1)).getIcon().setTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorBoundary)));
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        changeBack.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(tabLayout.getSelectedTabPosition()==0){
            mainCount =preferencesColor.getInt("color",0);
            mainCount++;
            if(mainCount <11){
                setBackground(mainCount,0);
            }else {
                mainCount =0;
                setBackground(mainCount,0);
            }
        } else{
               inputCount=preferencesColor.getInt("color1",0);
                inputCount++;
                if(inputCount <11){
                    setBackground(inputCount,1);
                }else {
                   inputCount =0;
                    setBackground(inputCount,1);
                }
         }

    }});
}
    public FragmentRefreshListener getFragmentRefershListener(){
        return  fragmentRefreshListener;
    }
    public void setFragmentRefreshListener(FragmentRefreshListener fragmentRefreshListener){
       this.fragmentRefreshListener=fragmentRefreshListener;
    }
    public interface FragmentRefreshListener{
      void onRefresh();
    }
    private void setUpViewPager(ViewPager viewPager) {
    ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
    adapter.addFrag(new MainFragment());
    adapter.addFrag(new InputFragment());
    viewPager.setAdapter(adapter); }
    private void setUpTabsIcon() {
    int[] tabsicon={R.drawable.home, R.drawable.create};
       tabLayout.getTabAt(0).setIcon(tabsicon[0]);
       tabLayout.getTabAt(1).setIcon(tabsicon[1]);
    }
    class ViewPagerAdapter extends FragmentPagerAdapter{
    ArrayList<Fragment> mfragments=new ArrayList<>();
      public ViewPagerAdapter(FragmentManager fm) { super(fm); }
      @Override
      public Fragment getItem(int i) {
          return mfragments.get(i);
      }

      @Override
      public int getCount() {
          return mfragments.size();
      }

      public void addFrag(Fragment fragment) {
          mfragments.add(fragment);
      }
  }
    private void initial() {
        layout=findViewById(R.id.backmain);
        changeBack=findViewById(R.id.changeBackground);
        viewPager=findViewById(R.id.viewPager);
        preferencesColor=getSharedPreferences("index",MODE_PRIVATE);
        index=preferencesColor.getInt("color",0);
        window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        setBackground(index,0);
    }
    public void setBackground(int index,int tab){
    if(index!=0) {
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.color+index));
        Objects.requireNonNull(tabLayout.getTabAt(tab)).getIcon().setTintList(ColorStateList.valueOf(getResources().getColor(R.color.color+index)));
        changeBack.setSupportImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.color+index)));
        layout.setBackgroundColor(getResources().getColor(R.color.color+index));
        window.setStatusBarColor(getResources().getColor(R.color.color+index));
        if(tab==0)
        preferencesColor.edit().putInt("color",index).apply();
        else {
            preferencesColor.edit().putInt("color1", index).apply();
            if(getFragmentRefershListener()!=null){
                getFragmentRefershListener().onRefresh();
            }
        }
    }else {
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.color));
        Objects.requireNonNull(tabLayout.getTabAt(tab)).getIcon().setTintList(ColorStateList.valueOf(getResources().getColor(R.color.color)));
        changeBack.setSupportImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.color)));
        layout.setBackgroundColor(getResources().getColor(R.color.color));
        window.setStatusBarColor(getResources().getColor(R.color.color));
        if(tab==0)
            preferencesColor.edit().putInt("color",index).apply();
        else {
            preferencesColor.edit().putInt("color1", index).apply();
            preferencesColor.edit().putInt("color1", index).apply();
            if(getFragmentRefershListener()!=null){
                getFragmentRefershListener().onRefresh();
            }
        }
    }
   }
}