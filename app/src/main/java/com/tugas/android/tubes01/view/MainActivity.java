package com.tugas.android.tubes01.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import com.tugas.android.tubes01.R;
import com.tugas.android.tubes01.controller.FragmentListener;
import com.tugas.android.tubes01.fragment.MainFragment;

public class MainActivity extends AppCompatActivity implements FragmentListener {
    protected MainFragment mainFragment;
    protected FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mainFragment = new MainFragment();
        this.fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        ft.add(R.id.fragment_container,this.mainFragment)
                .addToBackStack(null)
                .commit();



    }
}