package com.rakib.interviewPractice

class DuplicateFinder {

    fun findDuplicates(input: List<Int>): List<Int> {
        val duplicates = mutableListOf<Int>()
        val seen = mutableSetOf<Int>()

        for (number in input) {
            if (!seen.add(number)) {
                duplicates.add(number)
            }
        }

        return duplicates
    }

    fun findDuplicate(events: List<String>): Set<String> {
        if (events.isEmpty() || events.size == 1) {
            return emptySet()
        }
        val seen = mutableSetOf<String>()
        val duplications = mutableSetOf<String>()
        for (event in events) {
            if (!seen.add(event)) {
                duplications.add(event)
            }
        }
        return duplications
    }
}

fun main() {
    val finder = DuplicateFinder()
    println(finder.findDuplicates(listOf(1, 2, 3, 2, 4, 1)))
    println(finder.findDuplicate(listOf("login", "click", "login", "logout", "click")))
}
