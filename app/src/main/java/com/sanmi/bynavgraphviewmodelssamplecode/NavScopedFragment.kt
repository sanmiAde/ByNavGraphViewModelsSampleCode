package com.sanmi.bynavgraphviewmodelssamplecode


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navGraphViewModels
import kotlinx.android.synthetic.main.fragment_nav_scoped.*

/**
 * A simple [Fragment] subclass.
 */
class NavScopedFragment : Fragment() {

    private val navGraphScopedViewModel by navGraphViewModels<NavGraphViewModel>(R.id.nestes_nav)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav_scoped, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txt_shared_data.text = navGraphScopedViewModel.sharedData

        btn_next.setOnClickListener {
            findNavController().navigate(R.id.action_navScopedFragment_to_navgraphScopedFragmentTwo)
        }
    }
}
