package com.ekahau.prototypes.khtf.libb

import kotlin.test.Test
import kotlin.test.assertEquals

class SummatorTestSimple {

    @Test
    fun testSum() {
        assertEquals(1717, Summator().sum(17, 17))
    }

}