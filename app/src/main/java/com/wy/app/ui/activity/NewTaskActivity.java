package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wildma.pictureselector.PictureSelector;
import com.wy.app.R;
import com.wy.app.adapter.NewTaskAdapter;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;
import com.wy.app.bean.NewTaskBean;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class NewTaskActivity extends BaseActivity {
    @BindView(R.id.acton_title)
    TextView  title;
    @BindView(R.id.rv)
    RecyclerView mrv;
    private ArrayList<NewTaskBean> newTaskBeans;
    private NewTaskAdapter newTaskAdapter;

    @Override
    public int setViewId() {
        return R.layout.activity_new_task;
    }

    @Override
    public BasePresenter getPresenter() {
        return null;
    }

    @Override
    public void showLoading() {

    }
      @OnClick({R.id.add_buzou})
    public  void onClick(View view){
        switch (view.getId()){
            case R.id.add_buzou:
                ArrayList<String> strings = new ArrayList<>();
                strings.add("");
                NewTaskBean newTaskBean = new NewTaskBean("", "", strings, new ArrayList<>());
                newTaskBeans.add(newTaskBean);
                newTaskAdapter.notifyDataSetChanged();
                break;
        }
    }
    @Override
    public void dismissLoading() {

        }

    @Override
    public void init(Bundle savedInstanceState) {
         title.setText("发布任务1/2");
         findViewById(R.id.img_msg).setVisibility(View.GONE);
         findViewById(R.id.img_yuan_dian).setVisibility(View.GONE);

    }
    public  int p;
    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void initData() {
        newTaskBeans = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("");
        NewTaskBean newTaskBean = new NewTaskBean("", "", strings, new ArrayList<>());
        newTaskBeans.add(newTaskBean);
        newTaskAdapter = new NewTaskAdapter(R.layout.item_new_task, newTaskBeans);
        mrv.setLayoutManager(new LinearLayoutManager(this));
        mrv.setAdapter(newTaskAdapter);
        newTaskAdapter.setOpenPhotoListener(new NewTaskAdapter.OpenPhotoListener() {
            @Override
            public void onClick(int position) {
                  p=position;
                PictureSelector
                        .create(NewTaskActivity.this,10)
                       .selectPicture();

            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        /*结果回调*/
        if (requestCode == 10) {
            if (data != null) {
                String picturePath = data.getStringExtra(PictureSelector.PICTURE_PATH);
                NewTaskBean newTaskBean = newTaskBeans.get(p);
                newTaskBean.getImgs().add(0,picturePath);
                newTaskAdapter.notifyDataSetChanged();
            }
        }
    }



}
