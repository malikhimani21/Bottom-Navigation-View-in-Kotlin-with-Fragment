package com.example.bottomnavact

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_home -> {
//                    Toast.makeText(this, "Home", Toast.LENGTH_LONG).show()
                    val fragment = HomeFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.linear_layout, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_dashboard -> {
//                    Toast.makeText(this, "Dashboard", Toast.LENGTH_LONG).show()
                    val fragment = DashboardFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.linear_layout, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_notifications -> {
//                    Toast.makeText(this, "Notification", Toast.LENGTH_LONG).show()
                    val fragment = NotificationFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.linear_layout, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_info -> {
//                    Toast.makeText(this, "Info", Toast.LENGTH_LONG).show()
                    val fragment = InfoFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.linear_layout, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }
}