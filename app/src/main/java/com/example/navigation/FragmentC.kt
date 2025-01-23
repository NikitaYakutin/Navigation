package com.example.navigation
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
class FragmentC : Fragment(R.layout.fragment_c) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_to_a).setOnClickListener {
            (activity as MainActivity).navigateToFragment(FragmentA())
        }
    }
}
