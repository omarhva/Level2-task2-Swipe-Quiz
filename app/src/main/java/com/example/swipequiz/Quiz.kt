package com.example.swipequiz

/**
 * @author Omar Mulla Ibrahim
 * Student Nr 500766035
 */

/**
 * data class for qustions and answers
 */
data class Quiz(
    var qustion: String,
    var answer: Boolean

) {
    companion object {
        val QUESTIONS = arrayOf(
            "A val is same as var",
            "Mobile Application Development grants 12 ECTS",
            "A Unite in Kotlin corresponds to a void in java",
            "in Kotlin 'when' replace the 'switch' oprator in Java"
        )
        val ANSWERS = arrayOf(
            false,
            false,
            true,
            true
        )
    }
}