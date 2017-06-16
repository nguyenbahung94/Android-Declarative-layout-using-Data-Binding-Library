package com.example.nbhung.androiddeclarativelayoutusingdatabindinglibrary;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.nbhung.androiddeclarativelayoutusingdatabindinglibrary.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        User user=new User("hung","nguyen");
        binding.setUser(user);
    }
}
