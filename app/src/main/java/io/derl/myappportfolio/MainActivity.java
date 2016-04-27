package io.derl.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spotifyStreamer(View view) {
        showToast("spotifyStreamer");
    }

    public void superDuo1(View view) {
        showToast("superDuo1");
    }

    public void superDuo2(View view) {
        showToast("superDuo2");
    }

    public void buildItBigger(View view) {
        showToast("buildItBigger");
    }

    public void xyzReader(View view) {
        showToast("xyzReader");
    }

    public void capstone(View view) {
        showToast("capstone");
    }

    private void showToast(String text){
        Toast.makeText(this, "This button will launch " + text + " app!", Toast.LENGTH_SHORT).show();
    }
}
