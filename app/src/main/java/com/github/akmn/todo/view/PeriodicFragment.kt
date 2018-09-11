package com.github.akmn.todo.view


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.akmn.todo.R

/**
 * A simple [Fragment] subclass.
 *
 */
class PeriodicFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_periodic, container, false)
    }
}
