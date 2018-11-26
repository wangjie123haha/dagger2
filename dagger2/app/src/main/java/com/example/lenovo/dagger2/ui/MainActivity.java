package com.example.lenovo.dagger2.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.dagger2.R;
import com.example.lenovo.dagger2.component.DaggerComponent;
import com.example.lenovo.dagger2.di.IContract;
import com.example.lenovo.dagger2.di.Ipresenterimp;
import com.example.lenovo.dagger2.module.Module;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity  implements IContract.Iview {

   // private Ipresenterimp ipresenterimp;
     //注入
   @Inject
    Ipresenterimp ipresenterimp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ipresenterimp = new Ipresenterimp();
        //依赖注入
        DaggerComponent
                .builder()
                .module(new Module())
                .build()
                .inject(this);

        //调用
        ipresenterimp.attachview(this);
    }

    @Override
    public void showview() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ipresenterimp.detachview(this);
    }
}
