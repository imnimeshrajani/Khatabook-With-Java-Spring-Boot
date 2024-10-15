package com.example.khatabook.parties.activity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.appcompat.app.AppCompatActivity;

import com.example.khatabook.databinding.ActivityEditProfileBinding;
import com.example.khatabook.databinding.DialogUpdateDetailBinding;

public class EditProfileActivity extends AppCompatActivity {

    private ActivityEditProfileBinding binding;
    private String newDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.fieldName.setOnClickListener(view -> {
            binding.tvPartyName.setText(updateDetailDialog("Name"));
        });

        binding.fieldMobileNumber.setOnClickListener(view -> {
            binding.tvPartyName.setText(updateDetailDialog("MobileNumber"));
        });

        binding.fieldAddress.setOnClickListener(view -> {
            binding.tvPartyName.setText(updateDetailDialog("Address"));
        });

        binding.fieldChangePartyType.setOnClickListener(view -> {
        });

    }

    private String updateDetailDialog(String field) {
        Dialog dialog = new Dialog(this);
        DialogUpdateDetailBinding dialogBinding = DialogUpdateDetailBinding.inflate(LayoutInflater.from(this));
        dialog.setContentView(dialogBinding.getRoot());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);

        dialogBinding.tvTitle.setText(String.format("Enter a New %s", field));
        dialogBinding.edtNewDetail.setHint(field);

        dialogBinding.btnYes.setOnClickListener(view -> {
            newDetail = dialogBinding.edtNewDetail.getText().toString();
            dialog.dismiss();
        });
        dialogBinding.btnNo.setOnClickListener(view -> {
            dialogBinding.edtNewDetail.clearComposingText();
            newDetail = "";
            dialog.dismiss();
        });
        dialog.show();
        return newDetail;
    }
}