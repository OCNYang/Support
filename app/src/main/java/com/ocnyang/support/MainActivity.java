package com.ocnyang.support;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.ocnyang.pushlibrary.IPushOnReceiveListener;
import com.ocnyang.pushlibrary.MIPushMessageReceiver;
import com.ocnyang.pushlibrary.MIPushUser;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MIPushUser.registerPush(this.getApplicationContext(),"2882303761517708507","5351770847507");
        MIPushMessageReceiver.setIPushOnReceiveListener(new IPushOnReceiveListener() {
            @Override
            public void onReceivePassThroughMessage(Context context, MiPushMessage message) {
                Log.e("Push","fuck");
            }

            @Override
            public void onNotificationMessageClicked(Context context, MiPushMessage message) {
                Log.e("Push","fuck");
            }

            @Override
            public void onNotificationMessageArrived(Context context, MiPushMessage message) {
                Log.e("Push","fuck");
            }

            @Override
            public void onCommandResult(Context context, MiPushCommandMessage message) {
                Log.e("Push","fuck");
            }

            @Override
            public void onReceiveRegisterResult(Context context, MiPushCommandMessage message) {
                Log.e("Push","fuck");
            }
        });

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
