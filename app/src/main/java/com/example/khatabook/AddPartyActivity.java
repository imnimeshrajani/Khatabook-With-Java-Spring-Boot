package com.example.khatabook;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.khatabook.databinding.ActivityAddPartyBinding;

public class AddPartyActivity extends AppCompatActivity {
    private ActivityAddPartyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddPartyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String partyType = getIntent().getStringExtra("PARTY_TYPE");
        if (partyType.equals("CUSTOMER")) {
            binding.rbCustomer.setSelected(true);
            binding.btnAddParty.setText(getString(R.string.add_customer));
        } else {
            binding.rbCustomer.setSelected(true);
            binding.btnAddParty.setText(getString(R.string.add_supplier));
            binding.btnAddParty.setBackgroundColor(getColor(R.color.purple_500));

        }
    }
}