package us.dev.custom_broadcaset;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    AlarmReciver alarmReciver = new AlarmReciver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter("com.codinginflow.EXAMPLE_ACTION");

        registerReceiver(alarmReciver, filter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        unregisterReceiver(alarmReciver);
    }
}
