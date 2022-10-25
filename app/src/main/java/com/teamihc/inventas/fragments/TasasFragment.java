package com.teamihc.inventas.fragments;

import android.app.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.teamihc.inventas.R;
import com.teamihc.inventas.backend.Herramientas;
import com.teamihc.inventas.backend.entidades.Tasa;

import java.time.chrono.HijrahEra;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class TasasFragment extends Fragment
{
    private View view;

    
    //aqui se vacia la info de la tasa actual y de la estadistica del cambio de tasas
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_tasas, container, false);

        
        return view;
    }
    
    @Override
    public void onResume()
    {
        super.onResume();

    }


}

