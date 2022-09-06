package com.example.cosmic_1.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.cosmic_1.R;
import com.example.cosmic_1.WebViewController;

import java.util.ArrayList;


public class affirmation_fragment extends Fragment {

    public static final datamodel OBJ_1 = new datamodel(R.drawable.breathe_2, "sonu hy fsd fsd bhfd fdwf", "web nd fvdd");

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView ;
        ArrayList<datamodel>  dataholder;
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_affirmation, container, false);
     recyclerView = view.findViewById(R.id.recviw);
     recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
     dataholder = new ArrayList<>();

        datamodel ob1 = new datamodel(R.drawable.ic_heart, "Success comes from experience and experience comes from bad experiences",".............");
        dataholder.add(ob1);

        datamodel ob2 = new datamodel(R.drawable.ic_heart, "I love myself just as I am today",".............");
        dataholder.add(ob2);


        datamodel ob3 = new datamodel(R.drawable.ic_heart, "I choose to be kind to myself.",".............");
        dataholder.add(ob3);

        datamodel ob4 = new datamodel(R.drawable.ic_heart, "I am my own best friend.",".............");
        dataholder.add(ob4);

        datamodel ob5 = new datamodel(R.drawable.ic_heart, "It is natural for me to love myself.",".............");
        dataholder.add(ob5);

        datamodel ob6 = new datamodel(R.drawable.ic_heart, "I am grateful to be the person I am",".............");
        dataholder.add(ob6);

        datamodel ob7 = new datamodel(R.drawable.ic_heart, "I love each part of myself.",".............");
        dataholder.add(ob7);

        datamodel ob8 = new datamodel(R.drawable.ic_heart, "I appreciate all the ways that I am unique",".............");
        dataholder.add(ob8);

        datamodel ob9 = new datamodel(R.drawable.ic_heart, "I am calm and relaxed in all situations.",".............");
        dataholder.add(ob9);

        datamodel ob10 = new datamodel(R.drawable.ic_heart, "My tension is melting away.",".............");
        dataholder.add(ob10);

        datamodel ob11 = new datamodel(R.drawable.ic_heart, "I am comfortable around other people.",".............");
        dataholder.add(ob11);

        datamodel ob12 = new datamodel(R.drawable.ic_heart, "I am thankful and grateful for the good in my life",".............");
        dataholder.add(ob12);

        datamodel ob13 = new datamodel(R.drawable.ic_heart, "Calmness washes over me with every deep breath I take",".............");
        dataholder.add(ob13);

        datamodel ob14 = new datamodel(R.drawable.ic_heart, "I am releasing all negative emotions from my system",".............");
        dataholder.add(ob14);

        datamodel ob15 = new datamodel(R.drawable.ic_heart, "I deserve a peaceful and loving life",".............");
        dataholder.add(ob15);

        datamodel ob16 = new datamodel(R.drawable.ic_heart, "I am breathing slowly and deeply, filling myself with calmness",".............");
        dataholder.add(ob16);

        datamodel ob17 = new datamodel(R.drawable.ic_heart, "I am letting go of all my worries and fears",".............");
        dataholder.add(ob17);

        datamodel ob18 = new datamodel(R.drawable.ic_heart, "I surround myself with peace and pleasant emotions",".............");
        dataholder.add(ob18);

        datamodel ob19 = new datamodel(R.drawable.ic_heart, "I choose to move my focus on happy experiences",".............");
        dataholder.add(ob19);

        datamodel ob20 = new datamodel(R.drawable.ic_heart, "Despite how I feel, I understand this feeling and situation are temporary.",".............");
        dataholder.add(ob20);

        datamodel ob21 = new datamodel(R.drawable.ic_heart, "Serenity, tranquillity, and other pleasurable emotions engulf my being.",".............");
        dataholder.add(ob21);

        datamodel ob22 = new datamodel(R.drawable.ic_heart, "My thoughts are slowing down",".............");
        dataholder.add(ob22);

        datamodel ob23 = new datamodel(R.drawable.ic_heart, "My breathing is anchored from within my core and this breathing is relaxing to my body and mind",".............");
        dataholder.add(ob23);

        datamodel ob24 = new datamodel(R.drawable.ic_heart, "My breathing is anchored from within my core and this breathing is relaxing to my body and mind",".............");
        dataholder.add(ob24);

        datamodel ob25 = new datamodel(R.drawable.ic_heart, "As my body and mind become more relaxed, I can problem-solve more effectively.",".............");
        dataholder.add(ob25);

        datamodel ob26 = new datamodel(R.drawable.ic_heart, "I am a positive person who attracts positive things into my life",".............");
        dataholder.add(ob26);

        datamodel ob27 = new datamodel(R.drawable.ic_heart, "I am equipped to handle this situation effectively",".............");
        dataholder.add(ob27);

        datamodel ob28 = new datamodel(R.drawable.ic_heart, "This situation will pass, so I choose to deal with it calmly",".............");
        dataholder.add(ob28);

        datamodel ob29 = new datamodel(R.drawable.ic_heart, "I trust my intuition and I am always guided to make wise decisions",".............");
        dataholder.add(ob29);

        datamodel ob30 = new datamodel(R.drawable.ic_heart, "Today, and every day, I choose joy",".............");
        dataholder.add(ob30);

        datamodel ob31 = new datamodel(R.drawable.ic_heart, "I trust the Universe is looking out for my higher good",".............");
        dataholder.add(ob31);

        datamodel ob32 = new datamodel(R.drawable.ic_heart, "Everything is going to be okay",".............");
        dataholder.add(ob32);

        datamodel ob33 = new datamodel(R.drawable.ic_heart, "One day at a time, one step at a time",".............");
        dataholder.add(ob33);

        datamodel ob34 = new datamodel(R.drawable.ic_heart, "I am in harmony and balance with life",".............");
        dataholder.add(ob34);

        datamodel ob35 = new datamodel(R.drawable.ic_heart, "I am a good person who deserves happiness, health, and peace",".............");
        dataholder.add(ob35);

        datamodel ob36 = new datamodel(R.drawable.ic_heart, "There are some things I can’t change, and I’m OKAY with that.",".............");
        dataholder.add(ob36);

        datamodel ob37 = new datamodel(R.drawable.ic_heart, "Good things continually happen to me",".............");
        dataholder.add(ob37);

        datamodel ob38 = new datamodel(R.drawable.ic_heart, "Feeling relaxed is my normal state",".............");
        dataholder.add(ob38);

        datamodel ob39 = new datamodel(R.drawable.ic_heart, "I am inhaling confidence and exhaling fear",".............");
        dataholder.add(ob39);

        datamodel ob40 = new datamodel(R.drawable.ic_heart, "I am accepting myself unconditionally",".............");
        dataholder.add(ob40);

        datamodel ob41 = new datamodel(R.drawable.ic_heart, "Everything is easy for me to handle",".............");
        dataholder.add(ob41);

        datamodel ob42 = new datamodel(R.drawable.ic_heart, "I am learning to support my best self",".............");
        dataholder.add(ob42);

        datamodel ob43 = new datamodel(R.drawable.ic_heart, "I am capable of handling my responsibilities",".............");
        dataholder.add(ob43);

        datamodel ob44 = new datamodel(R.drawable.ic_heart, "I allow myself time to heal",".............");
        dataholder.add(ob44);

        datamodel ob45 = new datamodel(R.drawable.ic_heart, "I appreciate my life with all of my heart",".............");
        dataholder.add(ob45);

        datamodel ob46 = new datamodel(R.drawable.ic_heart, "All is well in my world. I am calm, happy, and content.",".............");
        dataholder.add(ob46);

        datamodel ob47 = new datamodel(R.drawable.ic_heart, "I listen with love to my body’s messages",".............");
        dataholder.add(ob47);

        datamodel ob48 = new datamodel(R.drawable.ic_heart, "I deserve all that is good",".............");
        dataholder.add(ob48);

        datamodel ob49 = new datamodel(R.drawable.ic_heart, "My happy thoughts help create my healthy body",".............");
        dataholder.add(ob49);

        datamodel ob50 = new datamodel(R.drawable.ic_heart, "Everything is working out for my highest good",".............");
        dataholder.add(ob50);

        datamodel ob51 = new datamodel(R.drawable.ic_heart, "I make the decisions for myself.",".............");
        dataholder.add(ob51);

        datamodel ob52 = new datamodel(R.drawable.ic_heart, "I am independent and in control of my life",".............");
        dataholder.add(ob52);

        datamodel ob53 = new datamodel(R.drawable.ic_heart, "I am worthy of good experiences",".............");
        dataholder.add(ob53);

        datamodel ob54 = new datamodel(R.drawable.ic_heart, "I am becoming calm with every breath I take",".............");
        dataholder.add(ob54);

        datamodel ob55 = new datamodel(R.drawable.ic_heart, "I accept all of me unconditionally",".............");
        dataholder.add(ob55);

        datamodel ob56 = new datamodel(R.drawable.ic_heart, "Every situation is easy for me to handle",".............");
        dataholder.add(ob56);

        datamodel ob57 = new datamodel(R.drawable.ic_heart, "My life is a blessing",".............");
        dataholder.add(ob57);

        datamodel ob58 = new datamodel(R.drawable.ic_heart, "I am strong and confident",".............");
        dataholder.add(ob58);

        datamodel ob59 = new datamodel(R.drawable.ic_heart, "I allow myself to be who I truly am",".............");
        dataholder.add(ob59);

        datamodel ob60 = new datamodel(R.drawable.ic_heart, "I am feeling light and at ease",".............");
        dataholder.add(ob60);

        datamodel ob61 = new datamodel(R.drawable.ic_heart, "I am attracting positive healing energy to myself",".............");
        dataholder.add(ob61);

        datamodel ob62 = new datamodel(R.drawable.ic_heart, "I have all that I need to get through this day",".............");
        dataholder.add(ob62);

        datamodel ob63 = new datamodel(R.drawable.ic_heart, "I take time to nourish my whole self",".............");
        dataholder.add(ob63);

        datamodel ob64 = new datamodel(R.drawable.ic_heart, "I am a priority in my own life",".............");
        dataholder.add(ob64);

        datamodel ob65 = new datamodel(R.drawable.ic_heart, "I choose to live in the moment and take things one day at a time",".............");
        dataholder.add(ob65);

        datamodel ob66 = new datamodel(R.drawable.ic_heart, "My self-care is worth making time for every day",".............");
        dataholder.add(ob66);

        datamodel ob67 = new datamodel(R.drawable.ic_heart, "I take great care of my body, for it is a temple and I treat it with respect",".............");
        dataholder.add(ob67);

        datamodel ob68 = new datamodel(R.drawable.ic_heart, "I have the right to complete all my needs",".............");
        dataholder.add(ob68);

        datamodel ob69 = new datamodel(R.drawable.ic_heart, "I am responsible for taking care of myself",".............");
        dataholder.add(ob69);

        datamodel ob70 = new datamodel(R.drawable.ic_heart, "Self-care is important to me",".............");
        dataholder.add(ob70);

        datamodel ob71 = new datamodel(R.drawable.ic_heart, "I always make time to nourish my body, mind, and soul",".............");
        dataholder.add(ob71);

        datamodel ob72 = new datamodel(R.drawable.ic_heart, "Every day, I put focus on caring for myself as I care for others",".............");
        dataholder.add(ob72);

        datamodel ob73 = new datamodel(R.drawable.ic_heart, "I am safe at this very moment",".............");
        dataholder.add(ob73);

        datamodel ob74 = new datamodel(R.drawable.ic_heart, "I am becoming stronger every second",".............");
        dataholder.add(ob74);

        datamodel ob75 = new datamodel(R.drawable.ic_heart, "I am gradually opening up to feel inner peace",".............");
        dataholder.add(ob75);

        datamodel ob76 = new datamodel(R.drawable.ic_heart, "The truth is I am blessed, loved, and supported",".............");
        dataholder.add(ob76);

        datamodel ob77 = new datamodel(R.drawable.ic_heart, "I am stronger than I think I am",".............");
        dataholder.add(ob77);

        datamodel ob78 = new datamodel(R.drawable.ic_heart, "I trust the process of life",".............");
        dataholder.add(ob78);

        datamodel ob79 = new datamodel(R.drawable.ic_heart, "I appreciate my life and find things to be grateful for",".............");
        dataholder.add(ob79);

        datamodel ob80 = new datamodel(R.drawable.ic_heart, "I have the ability to overcome setbacks",".............");
        dataholder.add(ob80);

        datamodel ob81 = new datamodel(R.drawable.ic_heart, "I believe in my ability to get through tough times",".............");
        dataholder.add(ob81);

        datamodel ob82 = new datamodel(R.drawable.ic_heart, "I accept myself and bring peace to my mind and heart",".............");
        dataholder.add(ob82);

        datamodel ob83 = new datamodel(R.drawable.ic_heart, "I believe in myself here and now!",".............");
        dataholder.add(ob83);

        datamodel ob84 = new datamodel(R.drawable.ic_heart, "I am healing",".............");
        dataholder.add(ob84);

        datamodel ob85 = new datamodel(R.drawable.ic_heart, "I love myself",".............");
        dataholder.add(ob85);

        datamodel ob86 = new datamodel(R.drawable.ic_heart, "I am worthy of good things",".............");
        dataholder.add(ob86);

        datamodel ob87 = new datamodel(R.drawable.ic_heart, "I respect myself and treat myself with kindness and love",".............");
        dataholder.add(ob87);

        datamodel ob88 = new datamodel(R.drawable.ic_heart, "I forgive myself.",".............");
        dataholder.add(ob88);

        datamodel ob89 = new datamodel(R.drawable.ic_heart, "I am at peace with my past",".............");
        dataholder.add(ob89);

        datamodel ob90 = new datamodel(R.drawable.ic_heart, "I am proud of who I am becoming",".............");
        dataholder.add(ob90);

        datamodel ob91 = new datamodel(R.drawable.ic_heart, "I am beautiful inside and out",".............");
        dataholder.add(ob91);

        datamodel ob92 = new datamodel(R.drawable.ic_heart, "I am doing the best I can",".............");
        dataholder.add(ob92);

        datamodel ob93 = new datamodel(R.drawable.ic_heart, "I am learning to love myself more every day",".............");
        dataholder.add(ob93);

        datamodel ob94 = new datamodel(R.drawable.ic_heart, "I am a constant work in progress",".............");
        dataholder.add(ob94);


        datamodel ob95 = new datamodel(R.drawable.ic_heart, "I am open to seeing myself in a new light",".............");
        dataholder.add(ob95);

        datamodel ob96 = new datamodel(R.drawable.ic_heart,"I let go of my past beliefs that no longer serve me" ,".............");
        dataholder.add(ob96);

        datamodel ob97 = new datamodel(R.drawable.ic_heart, "I am beautiful/gorgeous/unique/special",".............");
        dataholder.add(ob97);

        datamodel ob98 = new datamodel(R.drawable.ic_heart, "I am worthy of celebrating myself",".............");
        dataholder.add(ob98);

        datamodel ob99 = new datamodel(R.drawable.ic_heart, "Love is always flowing to me",".............");
        dataholder.add(ob99);

        datamodel ob100 = new datamodel(R.drawable.ic_heart, "My struggles are opportunities",".............");
        dataholder.add(ob100);

        recyclerView.setAdapter(new myadapter(dataholder));
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webView.loadUrl("https://theeverygirl.com/50-positive-affirmations-you-should-tell-yourself/");
//        webView.setWebViewClient(new WebViewController());
        return view;

          }
    }

