package com.anningtex.circlewavediverge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author Administrator
 * desc:仿雷达扫描测试类
 */
public class RadarScanTestActivity extends AppCompatActivity implements View.OnClickListener {
    private CircleWaveDivergenceView search_device_view;
    private Button btn_continue, btn_pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar_scan_test);

        init();
    }

    private void init() {
        search_device_view = findViewById(R.id.search_device_view);
        btn_continue = findViewById(R.id.btn_continue);
        btn_pause = findViewById(R.id.btn_pause);
        search_device_view.setWillNotDraw(false);

        btn_pause.setOnClickListener(this);
        btn_continue.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_continue:
                search_device_view.setSearching(true);
                break;
            case R.id.btn_pause:
                search_device_view.setSearching(false);
                break;
            default:
                break;
        }
    }
}
