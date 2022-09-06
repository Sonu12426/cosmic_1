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

public class headSpace extends Fragment {


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_head_space, container, false);

        WebView webView = view.findViewById(R.id.webView_headspace);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        webView.loadUrl("https://pixabay.com/music/search/mood/relaxing/");
        webView.setWebViewClient(new WebViewController());
        return view;
    }
}