package com.example.staffonechristian.monetize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class InterstitialActivity extends AppCompatActivity {
    Button loadButton;
    Button showButton;


    InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial2);

        loadButton = (Button) findViewById(R.id.loadButton);
        showButton = (Button) findViewById(R.id.showButton);
        showButton.setEnabled(false);


    }


    public void LoadInterstitialEvent(View view) {


        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.interstitial_ad_unit_id));
        interstitialAd.setAdListener(new ToastAdListener(this){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
            }

            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);
            }

            @Override
            public void onAdLeftApplication() {
                super.onAdLeftApplication();
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                showButton.setEnabled(true);
                showButton.setText("Interstitial Ready");
            }
        });
        AdRequest adRequest = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest);


    }

    public void ShowAd(View view) {
        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
        }
        showButton.setEnabled(false);
        showButton.setText("Interstitial Not Ready");
    }
}
