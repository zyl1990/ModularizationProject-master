package app.zyl.modledemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by zhangyongle on 2017/12/22.
 */

public class BaseActivity extends AppCompatActivity{
    
    public static void start(Context context){
        Intent intent = new Intent();
        intent.setClass(context, BaseActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
