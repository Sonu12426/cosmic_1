package com.example.cosmic_1.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.cosmic_1.R;
import com.example.cosmic_1.WebViewController;

public class symptoms_fragment extends Fragment {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_symptoms, container, false);
        WebView webView = view.findViewById(R.id.webView_symptoms);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        webView.loadUrl("https://www.healthline.com/health/anxiety-symptoms#causes");
        webView.setWebViewClient(new WebViewController());
        return view;
    }
}