package com.example.khatabook;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.khatabook.databinding.ActivitySearchOrAddPartyBinding;

public class SearchOrAddPartyActivity extends AppCompatActivity {

    private ActivitySearchOrAddPartyBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchOrAddPartyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}