package com.example.lenovo.dagger2.module;

import com.example.lenovo.dagger2.di.Imoduleimp;
import com.example.lenovo.dagger2.di.Ipresenterimp;

import dagger.Provides;

@dagger.Module
public class Module {

    //p层
    @Provides
    public Ipresenterimp getpresenter(){
        return  new Ipresenterimp();
    }
    //m层
    @Provides
    public Imoduleimp getmodule(){
        return  new Imoduleimp();
    }


}
