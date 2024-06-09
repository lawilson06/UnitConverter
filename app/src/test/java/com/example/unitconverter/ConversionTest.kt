package com.example.unitconverter

import org.junit.Test

import org.junit.jupiter.api.Assertions.*

class ConversionTest {

    val centimeters = 0.01
    val meters = 1.0
    val feet = 0.3048
    val millimeters = 0.001

    val inputValue = "1"
    val conversionFactor = meters
    val oConversionFactor = centimeters


    val obj = Conversion(inputValue, conversionFactor, oConversionFactor)

    @Test
    fun conversion_isCorrect() {
        assertEquals(100.0, obj.convertUnits())
    }

}
