package us.dev.custom_broadcaset;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if("com.codinginflow.EXAMPLE_ACTION".equals(intent.getAction()))
        {
            String recivedText = intent.getStringExtra("com.codinginflow.EXTRA_TEXT");

            Toast.makeText(context, recivedText, Toast.LENGTH_SHORT).show();
        }
    }
}
