package android.terminology.Activity;
import androidx.core.app.NavUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import android.terminology.DataTerms.AllAndroidTerms;
import android.terminology.DataTerms.AndroidTerm;
import android.terminology.Fragment.MainFragment;
import android.terminology.Fragment.SelectFragment;
import android.terminology.R;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
public class StackCardActivity extends AppCompatActivity {
    ViewPager viewPager;
    Toolbar toolbar;
    RelativeLayout layout;
    PagerAdapter pagerAdapter;
    AllAndroidTerms allAndroidTerms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stackcard);
        viewPager = findViewById(R.id.selectPager);
        toolbar = findViewById(R.id.toolbar);
        layout = findViewById(R.id.stackLayout);
        allAndroidTerms=new AllAndroidTerms();
        setSupportActionBar(toolbar);
        int cardclick=getIntent().getIntExtra("num", 0);
        getWindow().setStatusBarColor(getResources().getColor(R.color.color + getIntent().getIntExtra("index", 0)));
        layout.setBackgroundColor(getResources().getColor(R.color.color + getIntent().getIntExtra("index", 0)));
        getSupportActionBar().setTitle(getIntent().getStringExtra("des"));
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(),allAndroidTerms.getDay(cardclick));
        viewPager.setAdapter(pagerAdapter);
        viewPager.setPageTransformer(true, new CardStackTransformer());
        viewPager.setOffscreenPageLimit(1);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private class CardStackTransformer implements ViewPager.PageTransformer {
        @Override
        public void transformPage(View page, float position) {
            if (position >= 0) {
                page.setScaleX(1.0f - 0.08f * position);
                page.setScaleY(1.1f);
                page.setTranslationX(-page.getWidth() * position);
                page.setTranslationY(10 * position);
            }
        }
    }
    class PagerAdapter extends FragmentPagerAdapter {
        ArrayList<AndroidTerm> list;
        public PagerAdapter(FragmentManager fm,ArrayList<AndroidTerm> androidTermArrayList) {
            super(fm);
            list=androidTermArrayList;
        }
        @Override
        public Fragment getItem(int i) {
            return new SelectFragment(list.get(i));
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }
}