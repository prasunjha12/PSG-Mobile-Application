package com.prasunjava.psgmobileapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AcademicsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AcademicsFragment extends Fragment {



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AcademicsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AcademicsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AcademicsFragment newInstance(String param1, String param2) {
        AcademicsFragment fragment = new AcademicsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_academics,container,false);
        btn1= view.findViewById(R.id.button1);
        btn2=view.findViewById(R.id.button2);
        btn3=view.findViewById(R.id.button3);
        btn4=view.findViewById(R.id.button4);
        btn5=view.findViewById(R.id.button5);
        btn6=view.findViewById(R.id.button6);
        btn7=view.findViewById(R.id.button7);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.psgtech.edu/programme.php"));
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.psgtech.edu/index.php"));
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.psgtech.edu/scholarships.php"));
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.psgtech.edu/placements/index.php"));
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.psgtech.edu/calendar.php"));
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://library.psgtech.ac.in/"));
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://sports.psgtech.ac.in/"));
                startActivity(i);
            }
        });
     //   return inflater.inflate(R.layout.fragment_academics, container, false);
          return view;
    }
}