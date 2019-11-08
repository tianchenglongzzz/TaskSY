package com.wy.app.imvp;

import com.wy.app.base.IBaseView;

public interface MainContract {

      interface view extends IBaseView {
          void show();

      }
      interface Presenter{
            void main();

      }
}
