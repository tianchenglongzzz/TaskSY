package com.wy.app.util;

import android.widget.ImageView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.wy.app.R;

/**
 * 项目名称：MyView
 * 创建人：刘
 * 创建时间：2019-08-15 14:26
 * 功能描述：
 */
public class Utils {

    private static RequestOptions options = new RequestOptions()
            .placeholder(R.mipmap.ic_launcher)                //加载成功之前占位图
            .error(R.mipmap.ic_launcher_round)                    //加载错误之后的错误图
            //指定图片的尺寸
            //指定图片的缩放类型为fitCenter （等比例缩放图片，宽或者是高等于ImageView的宽或者是高。）
            .fitCenter()
            //指定图片的缩放类型为centerCrop （等比例缩放图片，直到图片的狂高都大于等于ImageView的宽度，然后截取中间的显示。
            //   .skipMemoryCache(true)                            //跳过内存缓存
            .diskCacheStrategy(DiskCacheStrategy.ALL)        //缓存所有版本的图像
            .diskCacheStrategy(DiskCacheStrategy.NONE)        //跳过磁盘缓存
            .diskCacheStrategy(DiskCacheStrategy.DATA)        //只缓存原来分辨率的图片
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE);    //只缓存最终的图片
   public  static  RequestOptions getOptions(ImageView imageView){

       return  options.override(imageView.getWidth(),imageView.getHeight());

   }
   public  static  int baifenbi(float max,float i){


       return  (int) (i/max*100);
   }
}
