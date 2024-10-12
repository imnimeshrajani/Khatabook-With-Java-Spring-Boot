package com.example.khatabook;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import com.example.khatabook.databinding.ActivityHomeBinding;
import com.example.khatabook.fragment.PartiesFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.example.khatabook.adapter.SectionsPagerAdapter;
import com.example.khatabook.fragment.BillFragment;
import com.example.khatabook.fragment.ItemsFragment;
import com.example.khatabook.fragment.MoreFragment;
import com.example.khatabook.fragment.PurchasesFragment;

public class HomeActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private BottomNavigationView bottomNavigationView;
    private FrameLayout fragmentFrameLayout;
    private Fragment partiesFragment, billFragment, itemFragment, moreFragment;

    private ActivityHomeBinding binding;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        fragmentFrameLayout = findViewById(R.id.fragmentFrameLayout);


        partiesFragment = new PartiesFragment();
        billFragment = new BillFragment();
        itemFragment = new ItemsFragment();
        moreFragment = new MoreFragment();

        loadFragment(partiesFragment);

        bottomNavigationView.setOnItemSelectedListener(item -> {
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
//        tabLayout = findViewById(R.id.tabLayout);
//        viewPager = findViewById(R.id.viewPager);
//
//        // Setup ViewPager with the SectionsPagerAdapter
//        setupViewPager(viewPager);
//        tabLayout.setupWithViewPager(viewPager);
//    }
//
//    private void setupViewPager(ViewPager viewPager) {
//        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
//        adapter.addFragment(new CustomersFragment(), "Customers");
//        adapter.addFragment(new SuppliersFragment(), "Suppliers");
//        viewPager.setAdapter(adapter);
//    }
}
