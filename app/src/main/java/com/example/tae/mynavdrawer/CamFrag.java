package com.example.tae.mynavdrawer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CamFrag extends Fragment
    {

        @Override
        public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
            View myView = inflater.inflate(R.layout.fragcam, container, false);
                    return myView;
        }
    }
