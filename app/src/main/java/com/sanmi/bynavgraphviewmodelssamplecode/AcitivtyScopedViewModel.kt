package com.sanmi.bynavgraphviewmodelssamplecode

import androidx.lifecycle.ViewModel
import java.util.*
import kotlin.random.Random

class AcitivtyScopedViewModel() : ViewModel() {

    val sharedData = Random(1).nextInt()

}