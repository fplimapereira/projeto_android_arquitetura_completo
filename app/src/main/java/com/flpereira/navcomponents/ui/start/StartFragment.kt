package com.flpereira.navcomponents.ui.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.flpereira.navcomponents.R
import com.flpereira.navcomponents.extensions.navigateWithAnimations
import kotlinx.android.synthetic.main.fragment_start.*


class StartFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonNext.setOnClickListener {
            findNavController().navigateWithAnimations(R.id.action_startFragment_to_profileFragment)
        }
    }
}