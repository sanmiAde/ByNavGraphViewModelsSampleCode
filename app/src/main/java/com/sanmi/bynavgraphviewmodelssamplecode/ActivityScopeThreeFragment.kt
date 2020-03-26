package com.sanmi.bynavgraphviewmodelssamplecode


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_activity_scope_three.*

/**
 * A simple [Fragment] subclass.
 */
class ActivityScopeThreeFragment : Fragment() {

    private val activityScopedViewModel by lazy {
        ViewModelProviders.of(requireActivity()).get(AcitivtyScopedViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_activity_scope_three, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txt_shared_data.text = activityScopedViewModel.sharedData

        btn_to_main_fragment.setOnClickListener {
            findNavController().popBackStack(R.id.mainFragment, false)
        }
    }
}
