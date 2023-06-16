package com.blueaitech.bottomnavigationtojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //變數宣告
    TextView tvHello;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xml 和程式關聯
        tvHello = findViewById(R.id.textHello);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);

        //bottomNavigationView 設定
        bottomNavigationView.getMenu().setGroupCheckable(0, false, false);
        bottomNavigationView.getMenu().getItem(1).setEnabled(false);

        bottomNavigationView.setOnItemSelectedListener((item) -> {
            switch (item.getItemId()) {
                case R.id.nav1:
                    tvHello.setText("點選相機");
                    break;
                case R.id.nav2:
                    tvHello.setText("點選下載");
                    break;
                case R.id.nav3:
                    tvHello.setText("點選音樂");
                    break;
                case R.id.nav4:
                    tvHello.setText("點選設定");
                    break;
            }
            return true;
        });
    }
}