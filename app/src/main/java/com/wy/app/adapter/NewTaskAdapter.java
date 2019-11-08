package com.wy.app.adapter;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.wy.app.R;
import com.wy.app.bean.NewTaskBean;

import java.util.ArrayList;
import java.util.List;

public class NewTaskAdapter extends BaseQuickAdapter<NewTaskBean,BaseViewHolder> {
    public NewTaskAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }
    @Override
    protected void convert(BaseViewHolder helper, NewTaskBean item) {
          EditText edContent= helper.getView(R.id.ed_content);
          edContent.addTextChangedListener(new TextWatcher() {
              @Override
              public void beforeTextChanged(CharSequence s, int start, int count, int after) {

              }

              @Override
              public void onTextChanged(CharSequence s, int start, int before, int count) {

              }

              @Override
              public void afterTextChanged(Editable s) {
                         item.setContent(s.toString());
              }
          });

        RecyclerView mrv=helper.getView(R.id.rv);
        mrv.setLayoutManager(new GridLayoutManager(mContext,3));
        AddImgAdapter addImgAdapter = new AddImgAdapter(R.layout.rv_img_item, item.getImgs());
        mrv.setAdapter(addImgAdapter);
        addImgAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String s = addImgAdapter.getData().get(position);
                if (TextUtils.isEmpty(s)){
                     openPhotoListener.onClick(position);

                }
            }
        });
    }

    public void setOpenPhotoListener(OpenPhotoListener openPhotoListener) {
        this.openPhotoListener = openPhotoListener;
    }

    OpenPhotoListener openPhotoListener;
 public interface OpenPhotoListener{
            void onClick(int p);
  }

    public class AddImgAdapter extends BaseQuickAdapter<String,BaseViewHolder>{

        public AddImgAdapter(int layoutResId, @Nullable List<String> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, String item) {
                  if (TextUtils.isEmpty(item)){
                      helper.setImageResource(R.id.img_header,R.mipmap.add_img);
                  }else {

                  }
        }
    }
}
