package com.example.navigation
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
class FragmentB : Fragment(R.layout.fragment_b) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_to_c).setOnClickListener {
            (activity as MainActivity).navigateToFragment(FragmentC())
        }
    }
}
