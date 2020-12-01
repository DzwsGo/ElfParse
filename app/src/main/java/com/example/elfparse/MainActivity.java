package com.example.elfparse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        byte[] header = Utils.readInputStream(getResources().openRawResource(R.raw.libmain));
        ElfHeader elfHeader = Elf32Parse.parseElfHeader(header);
        Log.d("MainActivity","elfHeader : " + elfHeader);
    }
}