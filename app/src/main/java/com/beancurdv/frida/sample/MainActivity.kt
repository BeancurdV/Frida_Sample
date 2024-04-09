package com.beancurdv.frida.sample

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.beancurdv.frida.sample.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        mBinding.btnUrl.setOnClickListener {
            Toast.makeText(this, Constants.URL, Toast.LENGTH_SHORT).show()
        }

        mBinding.btnAppVersion.setOnClickListener {
            Toast.makeText(this, Constants.getAppVersion(), Toast.LENGTH_SHORT).show()
        }
    }
}