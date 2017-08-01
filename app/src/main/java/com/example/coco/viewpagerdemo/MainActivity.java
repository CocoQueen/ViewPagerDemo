package com.example.coco.viewpagerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.itheima.loopviewpager.LoopViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private LoopViewPager loopViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loopViewPager = (LoopViewPager) findViewById(R.id.lvp_pager);
        loopViewPager.setImgData(imgListString());
        loopViewPager.setTitleData(titleListString());
        loopViewPager.start();
    }
    private List<String> imgListString() {
        List<String> imageData = new ArrayList<>();
        imageData.add("http://www.ocn.com.cn/Upload/userfiles/2%284803%29.jpg");
        imageData.add("http://img.mp.itc.cn/upload/20161007/2cee7df1620348dbb49b64a5db2b65f8_th.jpg");
        imageData.add("http://img2.imgtn.bdimg.com/it/u=1452538798,1715135974&fm=26&gp=0.jpg");
        imageData.add("http://img4.imgtn.bdimg.com/it/u=3458490135,1559990291&fm=26&gp=0.jpg");
        imageData.add("http://img0.imgtn.bdimg.com/it/u=341560786,3379695968&fm=26&gp=0.jpg");
        return imageData;
    }

    private List<String> titleListString() {
        List<String> titleData = new ArrayList<>();
        titleData.add("1、李易峰");
        titleData.add("2、杨洋");
        titleData.add("3、张杰");
        titleData.add("4、白敬亭");
        titleData.add("5、TFBoys");
        return titleData;
    }
}
