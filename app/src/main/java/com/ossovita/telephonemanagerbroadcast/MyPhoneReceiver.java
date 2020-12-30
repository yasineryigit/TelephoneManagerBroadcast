package com.ossovita.telephonemanagerbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

public class MyPhoneReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //gelen numaraları almak için
        //TelephonyManager: Telefondaki telefon servisi ile ilgili bilgi sunav
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        telephonyManager.listen(new PhoneStateListener(){
            //dinlenince ne olacağını buraya yazıyoruz

            @Override
            public void onCallStateChanged(int state, String phoneNumber) {
                super.onCallStateChanged(state, phoneNumber);
                //burada phonenumber = arayan numara
                System.out.println("Arayan numara: " + phoneNumber);
            }
        },PhoneStateListener.LISTEN_CALL_STATE);//virgülden sonra hangi eventi dinleyeceğimizi yazdık
    }
}
