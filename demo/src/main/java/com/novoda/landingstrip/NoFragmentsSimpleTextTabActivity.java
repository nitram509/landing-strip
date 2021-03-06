package com.novoda.landingstrip;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.novoda.landing_strip.R;
import com.novoda.landingstrip.setup.view.DemoViewPagerAdapter;

public class NoFragmentsSimpleTextTabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Demo: " + getClass().getSimpleName());

        setContentView(R.layout.activity_basic_usage);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new DemoViewPagerAdapter(getLayoutInflater()));

        LandingStrip landingStrip = (LandingStrip) findViewById(R.id.landing_strip);
        landingStrip.attach(viewPager);
    }

}
