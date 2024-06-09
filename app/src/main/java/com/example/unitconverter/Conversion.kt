package com.example.unitconverter

import kotlin.math.round

class Conversion(val inputValue: String,
                 val conversionFactor: Double,
                 val oConversionFactor: Double ) {


    fun convertUnits() : Double {
        val inputValueDouble = inputValue.toDoubleOrNull() ?: 0.0
        val result = (((inputValueDouble * conversionFactor * 100.0)/ oConversionFactor)) / 100
        return round(result * 100) / 100
    }

}