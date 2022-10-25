package com.teamihc.inventas.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.teamihc.inventas.R;
import com.teamihc.inventas.backend.entidades.Tasa;
import com.teamihc.inventas.adapters.HistorialTasaRVAdapter;

import java.util.ArrayList;

public class HistorialTasaActivity extends AppCompatActivity
{
    RecyclerView historico;
    Toolbar toolbar;
    HistorialTasaRVAdapter.HistorialTasaAdapter listaTasasAdapter;
    private ArrayList<Tasa> listaTasas;
    HistorialTasaRVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


    }
}