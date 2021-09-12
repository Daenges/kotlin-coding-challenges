package com.igorwojda.string.isanagram

private object Solution1 {
    private fun isAnagram(str1: String, str2: String): Boolean {
        val a1 = str1.toUpperCase().filter { it.isLetter() }.groupBy { it }
        val a2 = str2.toUpperCase().filter { it.isLetter() }.groupBy { it }
        return a1 == a2
    }
}

private object Solution2 {
    private fun isAnagram(str1: String, str2: String): Boolean {
        return getCharFrequency(str1) == getCharFrequency(str2)
    }

    private fun getCharFrequency(str: String): Map<Char, List<Char>> {
        return str.toLowerCase()
            .filter { it.isLetterOrDigit() }
            .groupBy { it }
    }
}

private object Solution3 {
    private fun isAnagram(str1: String, str2: String): Boolean {
        return getCharFrequency(str1) == getCharFrequency(str2)
    }

    private fun getCharFrequency(str: String): Map<Char, Int> {
        return str.toLowerCase()
            .filter { it.isLetterOrDigit() }
            .groupingBy { it }
            .eachCount()
    }
}

private object Solution4 {
    private fun isAnagram(str1 : String, str2 : String) : Boolean {
        return if (str1.isNotEmpty() && str2.isNotEmpty()) {
            val str1FirstLetter = str1[0]
            val str1Rest = str1.substring(1)

            return if(str2.contains(str1FirstLetter, true)) {
                val str2Rest = str2.replaceFirst(str1FirstLetter.toString(), "", true)
                isAnagram(str1Rest, str2Rest)
            }
            else {
                false
            }
        } else {
            true
        }
    }
}

private object KtLintWillNotComplain
