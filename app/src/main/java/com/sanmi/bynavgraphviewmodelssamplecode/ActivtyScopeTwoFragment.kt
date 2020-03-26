package com.sanmi.bynavgraphviewmodelssamplecode


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_activty_scope_two.*

/**
 * A simple [Fragment] subclass.
 */
class ActivtyScopeTwoFragment : Fragment() {

    private val activityScopedViewModel by lazy {
        ViewModelProviders.of(requireActivity()).get(AcitivtyScopedViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_activty_scope_two, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txt_shared_data.text = activityScopedViewModel.sharedData.toString()

        btn_next.setOnClickListener {
            findNavController().navigate(R.id.action_activtyScopeTwoFragment_to_activityScopeThreeFragment)
        }

    }
}
