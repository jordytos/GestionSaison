package com.example.gestionsaison.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.gestionsaison.MainActivity;
import com.example.gestionsaison.R;

public class NatureFragment extends Fragment {
    // Les champs utilisés par chaque Fragment
    //Ils sont distincts pour chaque NatureFragment instancié
    private String title;
    private int page;
    /**
     * Pour la sauvegarde et la récupération des données
     * dans un Bundle
     */
    private static final String ARG_SECTION_NUMBER = "numero_page";
    private static final String ARG_SECTION_TITLE = "titre_page";

    /**
     * Retourne une nouvelle instance de ce fragment
     * pour le numéro de section donné.
     */
    public static NatureFragment newInstance(int position, String title) {
        NatureFragment fragment = new NatureFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, position);
        args.putString(ARG_SECTION_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    // retrouver les valeurs des champs à partir du bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(ARG_SECTION_NUMBER, 0);
        title = getArguments().getString(ARG_SECTION_TITLE);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.section_label);
        tvLabel.setText(page + " -- " + title);
        ImageView image = (ImageView) view.findViewById(R.id.imageView);

        if (title.equals("été")) {
            image.setImageResource(R.drawable.iete);
        }
        if (title.equals("hiver")) {
            image.setImageResource(R.drawable.ihiver);
        }
        if (title.equals("printemps")) {
            image.setImageResource(R.drawable.iprintemps);
        }
        if (title.equals("automne")) {
            image.setImageResource(R.drawable.iautomne);
        }

        if (title.equals("saison")) {
            view = inflater.inflate(R.layout.fragment_second, container, false);
            image = (ImageView) view.findViewById(R.id.imageSaison1);
            image.setImageDrawable(getResources().getDrawable(R.drawable.ete));
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity activity = (MainActivity) getActivity();
                    activity.viewPager.setCurrentItem(0);
                }
            });

            image = (ImageView) view.findViewById(R.id.imageSaison2);
            image.setImageDrawable(getResources().getDrawable(R.drawable.hiver));
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity activity = (MainActivity) getActivity();
                    activity.viewPager.setCurrentItem(1);
                }
            });

            image = (ImageView) view.findViewById(R.id.imageSaison3);
            image.setImageDrawable(getResources().getDrawable(R.drawable.printemps));
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity activity = (MainActivity) getActivity();
                    activity.viewPager.setCurrentItem(2);
                }
            });

            image = (ImageView) view.findViewById(R.id.imageSaison4);
            image.setImageDrawable(getResources().getDrawable(R.drawable.automne));
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity activity = (MainActivity) getActivity();
                    activity.viewPager.setCurrentItem(3);
                }
            });
    }

        /*if (title.equals("saison")) {
            view = inflater.inflate(R.layout.fragment_second, container, false);
            image = (ImageView) view.findViewById(R.id.imageSaison2);
            image.setImageDrawable(getResources().getDrawable(R.drawable.hiver));
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity activity = (MainActivity) getActivity();
                    activity.viewPager.setCurrentItem(1);
                }
            });
        }

        if (title.equals("saison")) {
            view = inflater.inflate(R.layout.fragment_second, container, false);
            image = (ImageView) view.findViewById(R.id.imageSaison3);
            image.setImageDrawable(getResources().getDrawable(R.drawable.printemps));
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity activity = (MainActivity) getActivity();
                    activity.viewPager.setCurrentItem(2);
                }
            });
        }

        if (title.equals("saison")) {
            view = inflater.inflate(R.layout.fragment_second, container, false);
            image = (ImageView) view.findViewById(R.id.imageSaison4);
            image.setImageDrawable(getResources().getDrawable(R.drawable.automne));
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity activity = (MainActivity) getActivity();
                    activity.viewPager.setCurrentItem(3);
                }
            });
        }*/


        return view;
    }

}