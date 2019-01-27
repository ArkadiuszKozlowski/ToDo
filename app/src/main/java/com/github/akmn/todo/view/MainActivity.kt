package com.github.akmn.todo.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.github.akmn.todo.R
import com.github.akmn.todo.view.list.OverviewFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val overviewFragment: OverviewFragment = OverviewFragment()
    private val historyFragment: HistoryFragment = HistoryFragment()
    private val periodicFragment: PeriodicFragment = PeriodicFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showFragment(overviewFragment)

        navigation_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.overview -> showFragment(overviewFragment)
                R.id.history -> showFragment(historyFragment)
                R.id.periodic -> showFragment(periodicFragment)
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
