package com.wy.app.ui.fragement;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.lc.myretrofit.http.Constants;
import com.wy.app.R;
import com.wy.app.adapter.HomeAdapter;
import com.wy.app.base.BaseFragment;
import com.wy.app.base.BasePresenter;
import com.wy.app.bean.LoopIndexBean;
import com.wy.app.bean.TaskReleaseBean;
import com.wy.app.imvp.HomeContract;
import com.wy.app.presenter.HomePresenter;
import com.wy.app.util.Utils;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment<HomePresenter> implements HomeContract.View {
  @BindView(R.id.banner)
    Banner banner;
  @BindView(R.id.rv_2)
  RecyclerView mrv;

    @Override
    public int setViewId() {
        return R.layout.fragment_home;
    }

    @Override
    public HomePresenter getPresenter() {
        return new HomePresenter();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void init(Bundle savedInstanceState) {

    }

    @Override
    public void initData() {
        //获取banner
       mPresenter.getBanner();
       mPresenter.getTaskRelease(page);
    }


    @Override
    public void showBanner(ArrayList<LoopIndexBean.DataBean.BannerBean> loopIndexBean) {
        ArrayList<String> strings = new ArrayList<>();
        for (LoopIndexBean.DataBean.BannerBean b:loopIndexBean) {
            Log.d("TAGPPP",Constants.HOST+b.getImage());
            strings.add(Constants.HOST+b.getImage());
        }
        this.banner.setImages(strings).setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                //设置图片圆角角度
                RoundedCorners roundedCorners = new RoundedCorners(60);
                //通过RequestOptions扩展功能
                RequestOptions options = Utils.getOptions(imageView).bitmapTransform(roundedCorners);
                Glide.with(context).load(path).apply(Utils.getOptions(imageView)).apply(options).into(imageView);

            }
        }).start();
    }

    @Override
    public void shoTask(TaskReleaseBean taskReleaseBean) {
        HomeAdapter homeAdapter = new HomeAdapter(R.layout.rv_home, taskReleaseBean.getData().getData());
        mrv.setLayoutManager(new LinearLayoutManager(getContext()));
        mrv.setAdapter(homeAdapter);
    }
}
