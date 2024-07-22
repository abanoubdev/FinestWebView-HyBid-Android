package com.thefinestartist.finestwebview.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.thefinestartist.finestwebview.FinestWebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.defaultTheme) {
            new FinestWebView(this).titleDefault("The Finest Artist").show("http://thefinestartist.com");
            ////                    .toolbarScrollFlags(0)
            //                    .webViewJavaScriptEnabled(true)
            //                    .webViewUseWideViewPort(false)
            //                    .show("http://www.youtube.com");
        } else if (view.getId() == R.id.redTheme) {
            new FinestWebView(this).titleDefault("The Finest Artist").injectJavaScript(
                            "javascript: document.getElementById('msg').innerHTML='Hello "
                                    + "TheFinestArtist"
                                    + "!';")
                    .show("http://www.blessthisstuff.com");
        } else if (view.getId() == R.id.blueTheme) {
            new FinestWebView(this)
                    .titleDefault("Vimeo")
                    .showUrl(false)
                    .urlColorRes(R.color.bluePrimaryLight)
                    .showSwipeRefreshLayout(true)
                    .swipeRefreshColorRes(R.color.bluePrimaryDark)
                    .dividerHeight(0)
                    .gradientDivider(false)
                    .show("http://example.com");
        } else if (view.getId() == R.id.blackTheme) {
            new FinestWebView(this)
                    .titleDefault("Dribbble")
                    .urlColorRes(R.color.blackPrimaryLight)
                    .swipeRefreshColorRes(R.color.blackPrimaryDark)
                    .menuTextGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT)
                    .dividerHeight(0)
                    .gradientDivider(false)
                    .disableIconBack(true)
                    .disableIconClose(true)
                    .disableIconForward(true)
                    .disableIconMenu(true)
                    .show("https://dribbble.com");
        }
    }
}
