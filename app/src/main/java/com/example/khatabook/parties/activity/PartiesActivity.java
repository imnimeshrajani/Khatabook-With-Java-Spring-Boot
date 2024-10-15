package com.example.khatabook.parties.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import com.example.khatabook.R;
import com.example.khatabook.databinding.ActivityHomeBinding;
import com.example.khatabook.parties.PartiesFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.example.khatabook.bill.Fragment.BillFragment;
import com.example.khatabook.items.ItemsFragment;
import com.example.khatabook.more.MoreFragment;

public class PartiesActivity extends AppCompatActivity {

    private Fragment partiesFragment, billFragment, itemFragment, moreFragment;

    private ActivityHomeBinding binding;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        partiesFragment = new PartiesFragment();
        billFragment = new BillFragment();
        itemFragment = new ItemsFragment();
        moreFragment = new MoreFragment();

        loadFragment(partiesFragment);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_parties) {
                loadFragment(partiesFragment);
                return true;
            } else if (item.getItemId() == R.id.nav_bill) {
                loadFragment(billFragment);
                return true;
            } else if (item.getItemId() == R.id.nav_items) {
                loadFragment(itemFragment);
                return true;
            } else if (item.getItemId() == R.id.nav_more) {
                loadFragment(moreFragment);
                return true;
            }
            return false;
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentFrameLayout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        finish();
    }
}
