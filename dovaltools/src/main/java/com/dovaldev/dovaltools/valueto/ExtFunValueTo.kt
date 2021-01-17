package com.dovaldev.dovaltools.valueto

import android.content.Context

/*
    Convert values to int, double, string without null return
 */

/**
 * Convert a String to Int and if return null the
 * function return cero value or seeted value
 */
fun String.toIntOrValue(value: Int = 0): Int{
    return this.toIntOrNull()?: value
}


/**
 * Convert a String to Double and if return null the
 * function return cero value or seeted value
 */
fun String.toDoubleOrValue(value: Double = 0.0): Double{
    return this.toDoubleOrNull()?: value
}


/**
 * Convert a String to Float and if return null the
 * function return cero value or seeted value
 */
fun String.toFloatOrValue(value: Float = 0F): Float{
    return this.toFloatOrNull()?: value
}


/**
 * Convert a String to Long and if return null the
 * function return cero value or seeted value
 */
fun String.toLongOrValue(value: Long = 0L): Long{
    return this.toLongOrNull()?: value
}
