package com.example.app;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewpager.widget.PagerAdapter;

public class SlideViewAdapter extends PagerAdapter {

    Context context;

    public SlideViewAdapter(Context ctx){
        this.context = ctx;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_screen, container, false);

        ImageView imagem = view.findViewById(R.id.image_intro);
        TextView titulo = view.findViewById(R.id.title_intro);
        ImageView ind1 = view.findViewById(R.id.indicador_intro_1);
        ImageView ind2 = view.findViewById(R.id.indicador_intro_2);
        ImageView ind3 = view.findViewById(R.id.indicador_intro_3);
        AppCompatButton btnNavegacao = view.findViewById(R.id.btn_navegacao_intro);
        TextView pularIntro = view.findViewById(R.id.pular_intro);

        switch (position)
        {
            case 0:
                imagem.setImageResource(R.drawable.image1);
                ind1.setImageResource(R.drawable.ic_indicador_selecionado);
                ind2.setImageResource(R.drawable.ic_indicador);
                ind3.setImageResource(R.drawable.ic_indicador);
                titulo.setText(R.string.intro1);
                break;
            case 1:
                imagem.setImageResource(R.drawable.image2);
                ind1.setImageResource(R.drawable.ic_indicador);
                ind2.setImageResource(R.drawable.ic_indicador_selecionado);
                ind3.setImageResource(R.drawable.ic_indicador);
                titulo.setText(R.string.intro2);
                break;
            case 2:
                imagem.setImageResource(R.drawable.image3);
                ind1.setImageResource(R.drawable.ic_indicador);
                ind2.setImageResource(R.drawable.ic_indicador);
                ind3.setImageResource(R.drawable.ic_indicador_selecionado);
                titulo.setText(R.string.intro3);
                btnNavegacao.setBackgroundResource(R.drawable.button_iniciar);
                pularIntro.setVisibility(View.INVISIBLE);
                break;
        }

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}
