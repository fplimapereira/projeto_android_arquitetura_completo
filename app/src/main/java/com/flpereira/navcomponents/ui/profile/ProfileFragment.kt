package com.flpereira.navcomponents.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.flpereira.navcomponents.R
import com.flpereira.navcomponents.ui.login.LoginViewModel

class ProfileFragment : Fragment() {

    private val loginViewModel: LoginViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginViewModel.authenticationStateEvent.observe(this, Observer {
            when(it){
                is LoginViewModel.AuthenticationState.Authenticated ->{

                }
                is LoginViewModel.AuthenticationState.Unauthenticated ->{
                    findNavController().navigate(R.id.loginFragment)
                }
            }
        })
    }
}