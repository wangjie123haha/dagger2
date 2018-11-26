package com.example.lenovo.dagger2.component;

import com.example.lenovo.dagger2.di.Ipresenterimp;
import com.example.lenovo.dagger2.module.Module;
import com.example.lenovo.dagger2.ui.MainActivity;

import javax.inject.Inject;

@dagger.Component(modules = Module.class)
public interface Component {


    public  void  inject(MainActivity mainActivity);

    public  void  inject1(Ipresenterimp ipresenterimp);

}
