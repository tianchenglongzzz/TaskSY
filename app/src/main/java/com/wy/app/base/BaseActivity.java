package com.wy.app.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.jaeger.library.StatusBarUtil;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import com.wy.app.R;
import com.wy.app.app.App;
import com.wy.app.util.ScreenUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity<P extends BasePresenter> extends RxAppCompatActivity implements IBaseView{
    public P mPresenter;
    private Unbinder unbinder;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScreenUtil.resetDensity(this);
        setBar();
        setContentView(setViewId());
        unbinder = ButterKnife.bind(this);
          try {
              findViewById(R.id.goback).setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      finish();
                  }
              });
          }catch (Exception e){

          }
            mPresenter = getPresenter();
        if (mPresenter!=null) {
            mPresenter.attachView(this);
        }
        init(savedInstanceState);
    }
  //加载布局
    public abstract int setViewId();
    //弹土司
    @Override
    public void toast(String toast){
        Toast.makeText(this,toast,Toast.LENGTH_SHORT).show();
    }
//获得p层对象
    public abstract P  getPresenter();
   public void openActivity(Class c){
       startActivity(new Intent(getContext(),c));
   }
    public void openActivity(Class c,Bundle bundle){
        Intent intent = new Intent(getContext(), c);
        intent.putExtra(App.BUNDLE,bundle);
        startActivity(new Intent());

    }

    @Override
    protected void onResume() {
        super.onResume();
      initData();
   }
   //设置状态栏
   public  void setBar(){

   }

    protected void onDestroy() {
        super.onDestroy();
        try {
            mPresenter.detachView();
        }catch (Exception e){

        }

    }
}
