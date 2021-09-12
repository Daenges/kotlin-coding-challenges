package com.igorwojda.string.vowels

// Kotlin collection processing
private object Solution1 {
    private fun vowels(str: String): Int {
        val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
        return str.count { it.toLowerCase() in vowels }
    }
}

// Iterative
private object Solution2 {
    private fun vowels(str: String): Int {
        val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
        var counter = 0

        str.forEach {
            if (vowels.contains(it.toLowerCase())) {
                counter++
            }
        }

        return counter
    }
}

// Recursive
private object Solution3 {
    private fun vowels(str: String) : Int {
        return if (str.isNotEmpty()) {
            val firstChar = str[0]
            var containsVowel = 0

            if (listOf('a', 'e', 'i', 'o', 'u').contains(firstChar)) {
                containsVowel = 1
            }
            vowels(str.substring(1)) + containsVowel

        } else { 0 }
    }
}