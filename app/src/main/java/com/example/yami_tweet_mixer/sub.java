package com.example.yami_tweet_mixer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.SeekBar;

public class sub extends AppCompatActivity {
    private TranslateAnimation translateAnimation;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_layout);

        imageView = findViewById(R.id.saehan);
        startAnimation();


        /*
        final ImageView iv = (ImageView) findViewById(R.id.saehan);
        SeekBar ty = (SeekBar) findViewById(R.id.saehan);
        ty.setMax(800);
        ty.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean flag) {
            iv.setTranslationY(i);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
        });
        */

    }
    /*https://akira-watson.com/android/translate-animation.html
    アニメーションに関する記述
    */
    private void startAnimation() {
        //TransAnimation(移動元ｘ軸、移動元ｙ軸、移動先ｘ軸、移動先ｙ軸
        translateAnimation = new TranslateAnimation(
            Animation.ABSOLUTE,0.0f,
            Animation.ABSOLUTE,500.0f,
            Animation.ABSOLUTE,0.0f,
            Animation.ABSOLUTE,1200.0f
        );
    //アニメーション開始から終わりまでの時間（ミリ秒）
    translateAnimation.setDuration(2000);
    //繰り返し回数
    translateAnimation.setRepeatCount(0);
    //アニメーションが終わった後の表示
    translateAnimation.setFillAfter(true);
    //アニメーション開始
    imageView.startAnimation(translateAnimation);
    }
}