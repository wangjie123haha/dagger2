package com.example.lenovo.dagger2.di;

public interface IContract {

    //iview
    public  interface  Iview{
        void  showview();
    }
    //ipresenter
    public  interface Ipresenter<Iview>{
        void  attachview(Iview iview);
        void  detachview(Iview iview);
        void  requestdata();
    }
    //imoudle
    public  interface  Imodule{
        //接口回调
        interface  Callisten{
            void  responmsg();
        }
        void  responsedata(Callisten callisten);
    }
}
