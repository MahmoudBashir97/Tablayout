
package com.besheer.mahmoud.e_learning;



import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends  AppCompatActivity{

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=(TabLayout)findViewById(R.id.tablay);
        viewPager=(ViewPager)findViewById(R.id.viewpage);

        ViewpageAdapter adapter=new ViewpageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Textbooks(),"Text book");
        adapter.addFragment(new Units(),"Units");
        adapter.addFragment(new Assignment(),"Assignment");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

}
}
