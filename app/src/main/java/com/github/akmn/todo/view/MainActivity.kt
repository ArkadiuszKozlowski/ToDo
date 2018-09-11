package com.github.akmn.todo.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.github.akmn.todo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showFragment(OverviewFragment())

        navigation_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.overview -> showFragment(OverviewFragment())
                R.id.history -> showFragment(HistoryFragment())
                R.id.periodic -> showFragment(PeriodicFragment())
            }
            true
        }
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, fragment, null)
                .commit()
    }
}
