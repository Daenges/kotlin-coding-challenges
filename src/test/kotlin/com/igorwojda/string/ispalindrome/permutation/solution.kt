package com.igorwojda.string.ispalindrome.permutation

// frequency map solution
private object Solution1 {
    private fun isPermutationPalindrome(str: String, characterRemoved: Boolean = false): Boolean {
        val charactersFrequencyMap = str.groupingBy { it }.eachCount()

        val filtered = charactersFrequencyMap.filter { it.value % 2 == 1 }

        return filtered.size <= 1
    }
}

// recursive solution
private object Solution2 {
    private fun isPermutationPalindrome(s: String) : Boolean {
        return if(s.length > 1) {
            val firstChar = s[0]
            val restString = s.substring(1)
            if (restString.contains(firstChar)) {
                isPermutationPalindrome(restString.replaceFirst(firstChar.toString(), "", true))
            } else {
                false
            }
        } else {
            true
        }
    }
}
