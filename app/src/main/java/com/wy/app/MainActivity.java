package com.wy.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;

import com.jaeger.library.StatusBarUtil;
import com.wy.app.adapter.MainAdapter;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;
import com.wy.app.imvp.MainContract;
import com.wy.app.presenter.MainPresenter;
import com.wy.app.ui.fragement.HomeFragment;
import com.wy.app.ui.fragement.MessageFragment;
import com.wy.app.ui.fragement.MyFragment;
import com.wy.app.ui.fragement.TaskFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.view, ViewPager.OnPageChangeListener{

    private ArrayList<Fragment> fragments;
    @BindView(R.id.vp)
    ViewPager viewPager;
    @BindView(R.id.tabs_rg)
    RadioGroup radioGroup;
    @Override
    public int setViewId() {
        return R.layout.activity_main;
    }
    @Override
    public void init(Bundle savedInstanceState) {
        StatusBarUtil.setColorNoTranslucent(this,0xffff);
             mPresenter.main();
             fragments = new ArrayList<>();
             fragments.add(new HomeFragment());
             fragments.add(new TaskFragment());
             fragments.add(new MessageFragment());
             fragments.add(new MyFragment());
             viewPager.addOnPageChangeListener(this);
             viewPager.setAdapter(new MainAdapter(getSupportFragmentManager(),fragments));
             viewPager.setOffscreenPageLimit(4);
    }
    @Override
    public MainPresenter getPresenter() {
        return new MainPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
    @OnClick({R.id.tab_shouye,R.id.tab_renwu,R.id.tab_xiaoxi,R.id.tab_wode})
    public  void  onClick(View view){
        switch (view.getId()){
            case R.id.tab_shouye:
                viewPager.setCurrentItem(0,true);
                break;
            case R.id.tab_renwu:
                viewPager.setCurrentItem(1,true);
                break;
            case R.id.tab_xiaoxi:
                viewPager.setCurrentItem(2,true);
                break;
            case R.id.tab_wode:
                viewPager.setCurrentItem(3,true);
                break;
        }

    }
    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }
    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void initData() {

    }

    @Override
    public void show() {
        toast("我接到数据了");
    }




    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                radioGroup.check(R.id.tab_shouye);
                break;
            case 1:
                radioGroup.check(R.id.tab_renwu);
                break;
            case 2:
                radioGroup.check(R.id.tab_xiaoxi);
                break;
            case 3:
                radioGroup.check(R.id.tab_wode);
                break;
            default:
                break;
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
