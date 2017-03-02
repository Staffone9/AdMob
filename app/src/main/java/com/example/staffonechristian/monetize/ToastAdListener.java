package com.example.staffonechristian.monetize;

import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;

/**
 * Created by staffonechristian on 2017-03-01.
 */

public class ToastAdListener extends AdListener {

    private Context mContext;
    private String mErrorReason;


    public ToastAdListener(Context context) {
       this.mContext = context;

    }

    @Override
    public void onAdClosed() {
        super.onAdClosed();
        Toast.makeText(mContext,"onAdClosed()",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdFailedToLoad(int i) {
        super.onAdFailedToLoad(i);
        Toast.makeText(mContext,"onAdFailedToLoad()",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdLeftApplication() {
        super.onAdLeftApplication();
        Toast.makeText(mContext,"onAdLeftApplication()",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdOpened() {
        super.onAdOpened();
        Toast.makeText(mContext,"onAdOpened()",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdLoaded() {
        super.onAdLoaded();
        Toast.makeText(mContext,"onAdLoaded()",Toast.LENGTH_SHORT).show();
    }
}
