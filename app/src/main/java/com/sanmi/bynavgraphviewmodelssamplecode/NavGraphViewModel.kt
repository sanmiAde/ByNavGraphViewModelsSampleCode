package com.sanmi.bynavgraphviewmodelssamplecode

import androidx.lifecycle.ViewModel
import java.util.*

class NavGraphViewModel : ViewModel() {

    val sharedData =  (1..12).shuffled().first().toString()
}