package com.igorwojda.integer.reverse

import kotlin.math.sign

private object Solution1 {
    private fun reverseInt(i: Int): Int {
        val reverse = i.toString().removePrefix("-").reversed()
        return reverse.toInt() * i.sign
    }
}
// recursive approach
private object Solution2 {
    private fun reverseInt(num: Int) : Int {
        val numAsStr = num.toString()
        val firstCharOfNum : Char
        val returnedInt : Int

        if(numAsStr.length > 1) {
            firstCharOfNum = numAsStr[0]
            returnedInt = reverseInt(numAsStr.substring(1).toInt())
        } else {
            return num
        }

        return if(firstCharOfNum != '-') {
            (returnedInt.toString() + firstCharOfNum.toString()).toInt()
        } else {
            (firstCharOfNum.toString() + returnedInt.toString()).toInt()
        }
    }
}

private object KtLintWillNotComplain
