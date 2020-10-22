package com.tugas.android.tubes01.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.tugas.android.tubes01.R;
import com.tugas.android.tubes01.controller.FragmentListener;

public class MainFragment extends Fragment implements View.OnClickListener {
    protected TextView textView;
    protected FragmentListener listener;
    protected Button btnCari;



    public MainFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceStated) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        this.textView = view.findViewById(R.id.tv_text);
        this.btnCari = view.findViewById(R.id.btn_cari);
        this.btnCari.setOnClickListener(this);
        return view;
    }
//    public static FirstFragment newInstance(){
//        FirstFragment fragment = new FirstFragment();
//        return fragment;
//    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentListener) {
            this.listener = (FragmentListener) context;
        } else {
            throw new ClassCastException(context.toString()
                    + "must implement FragmentListener");
        }
    }


    @Override
    public void onClick(View view) {
//        if (click.getId() == view.getId()) {
//            listener.changePage(2,this.input.getText().toString());
//        }
    }



}
