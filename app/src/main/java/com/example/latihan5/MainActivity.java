package com.example.latihan5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.intent.extra.MESSAGE";
    private EditText
            mMessageEditTextNama,
            mMessageEditTextAlamat,
            mMessageEditTextNoHP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditTextNama = (EditText) findViewById(R.id.editText_nama);
        mMessageEditTextAlamat = (EditText) findViewById(R.id.editText_alamat);
        mMessageEditTextNoHP = (EditText) findViewById(R.id.editText_nohp);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button diklik!");
        Intent intent = new Intent(this, SecondActivity.class);
        String message1 = mMessageEditTextNama.getText().toString();
        String message2 = mMessageEditTextAlamat.getText().toString();
        String message3 = mMessageEditTextNoHP.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, "Nama: " + message1 + "\nAlamat: " + message2 + "\nNo. HP: " + message3);
        startActivity(intent);
    }
}
