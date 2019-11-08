package com.lc.myretrofit.utils;

import android.widget.Toast;

import com.lc.myretrofit.http.BaseData;
import com.lc.myretrofit.rxjava.ProgressUtils;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.trello.rxlifecycle2.android.FragmentEvent;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import com.trello.rxlifecycle2.components.support.RxFragment;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class RxUtil {

    /**
     * 统一线程处理
     *
     * @param <T>
     * @return
     */
    public static <T> ObservableTransformer<T, T>  rxSchedulerHelper(final RxAppCompatActivity activity) {    //compose简化线程
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> observable) {
                return observable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .compose(ProgressUtils.<T>applyProgressBar(activity))
                        .compose(activity.<T>bindUntilEvent(ActivityEvent.DESTROY));
            }
        };
    }


    /**
     * 统一线程处理
     *
     * @param <T>
     * @return
     */
    public static <T> ObservableTransformer<T, T> rxSchedulerHelper(final RxFragment fragment) {    //compose简化线程
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> observable) {
                return observable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .compose(ProgressUtils.<T>applyProgressBar(fragment.getActivity()))
                        .compose(fragment.<T>bindUntilEvent(FragmentEvent.DESTROY_VIEW));
            }
        };
    }



    public  static <T> ObservableTransformer<BaseData<T>,T>rxSchedulerErro(){

        return  new ObservableTransformer<BaseData<T>, T>() {
            @Override
            public ObservableSource<T> apply(Observable<BaseData<T>> upstream) {

                return upstream.flatMap(new Function<BaseData<T>, ObservableSource<T>>() {
                    @Override
                    public ObservableSource<T> apply(final BaseData<T> tBaseData) throws Exception {

                        return new ObservableSource<T>() {

                            @Override
                            public void subscribe(Observer<? super T> observer) {
                                       if (tBaseData.getCode()!=100){
                                           LogUtils.d("onErro",tBaseData.getMessage());
                                           ToastUtils.show(tBaseData.getMessage());
                                       }else {
                                           observer.onNext(tBaseData.getData());
                                       }
                            }
                        };
                    }
                });


            }

        };


    }

    /**
     * 统一线程处理
     *
     * @param <T>
     * @return
     */
    public static <T> ObservableTransformer<T, T> rxSchedulerHelper() {    //compose简化线程
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> observable) {
                return observable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }
}
