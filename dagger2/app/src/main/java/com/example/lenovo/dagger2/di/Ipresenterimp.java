package com.example.lenovo.dagger2.di;

import com.example.lenovo.dagger2.component.DaggerComponent;
import com.example.lenovo.dagger2.module.Module;

import java.lang.ref.WeakReference;

import javax.inject.Inject;

public class Ipresenterimp implements IContract.Ipresenter<IContract.Iview> {
    private  IContract.Iview iview;
    //private Imoduleimp imoduleimp;
    private WeakReference<IContract.Iview> iviewWeakReference;
    private WeakReference<IContract.Imodule> imoduleWeakReference;
    @Inject
    Imoduleimp imoduleimp;
    @Override
    public void attachview(IContract.Iview iview) {
         this.iview=iview;
         DaggerComponent
                 .builder()
                 .module(new Module())
                 .build()
                 .inject1(this);
         //imoduleimp = new Imoduleimp();
          //创建弱引用
        iviewWeakReference = new WeakReference<>(iview);
        imoduleWeakReference = new WeakReference<IContract.Imodule>(imoduleimp);

    }

    @Override
    public void detachview(IContract.Iview iview) {
             //解绑
          iviewWeakReference.clear();
          imoduleWeakReference.clear();
    }

    @Override
    public void requestdata() {
        imoduleimp.responsedata(new IContract.Imodule.Callisten() {
            @Override
            public void responmsg() {
                //回显
                iview.showview();
            }
        });
    }
}
