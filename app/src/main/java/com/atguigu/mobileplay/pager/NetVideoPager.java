package com.atguigu.mobileplay.pager;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.atguigu.mobileplay.fragment.BaseFragment;

/**
 * Created by My on 2017/5/19.
 */

public class NetVideoPager extends BaseFragment {

    private TextView textView;
    @Override
    public View initView() {
        textView = new TextView(context);
        textView.setTextSize(30);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        textView.setText("网络视频的内容");
    }
}
