package us.dev.costombroadcastsend;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);

    }

    public void sendBroadcast(View view) {
        Intent intent = new Intent("com.codinginflow.EXAMPLE_ACTION");
        intent.putExtra("com.codinginflow.EXTRA_TEXT", textView.getText().toString());
        sendBroadcast(intent);

    }

  /*  BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String receivedText = intent.getStringExtra("com.codinginflow.EXTRA_TEXT");
            textView.setText(receivedText);
        }
    };*/


    /*@Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter("com.codinginflow.EXAMPLE_ACTION");
        registerReceiver(broadcastReceiver, filter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcastReceiver);
    }
*/
}
