package com.example.lastdaangn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lastdaangn.databinding.ActivityMainBinding
import com.example.lastdaangn.ui.dongne.DongneFragment
import com.example.lastdaangn.ui.mycarrot.MycarrotFragment
import com.example.lastdaangn.ui.home.HomeFragment
import com.example.lastdaangn.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction().replace(R.id.main_frm, LoginFragment()).commitAllowingStateLoss()
        binding.mainBtmNav.run{
            setOnItemSelectedListener { item ->
                when(item.itemId){
                    R.id.menu_main_btm_nav_home -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, HomeFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_main_btm_nav_dongne -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, DongneFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_main_btm_nav_chatting -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, MycarrotFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_main_btm_nav_mynearby -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, MycarrotFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_main_btm_nav_my_page -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, MycarrotFragment())
                            .commitAllowingStateLoss()
                    }
                }
                true
            }
            selectedItemId = R.id.menu_main_btm_nav_home
        }
    }
}