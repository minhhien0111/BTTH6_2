package com.example.btth6_2;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.Toast;

public class PowerStateChangeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(context == null) return;
        if(intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)){
            Toast.makeText(context, R.string.power_conneted, Toast.LENGTH_LONG).show();
        }
        if(intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED)){
            Toast.makeText(context, R.string.power_disconnected, Toast.LENGTH_LONG).show();
        }

//        int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
//
//        if (status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL) {
//            // Đang sạc pin hoặc pin đã sạc đầy
//            Toast.makeText(context, R.string.power_conneted, Toast.LENGTH_LONG).show();
//        } else {
//            // Không sạc pin
//            Toast.makeText(context, R.string.power_disconnected, Toast.LENGTH_LONG).show();
//        }
    }
}
