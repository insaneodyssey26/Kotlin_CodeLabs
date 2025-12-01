// What is a data class? and why use it?
// A data class in Kotlin is a class that is primarily used to hold data.
// It automatically provides several useful methods such as toString(), equals(), hashCode(), and copy().

data class Question<T> (
    val questionText: String,
    val answer: T, 
    val diffculty: Difficulty
)

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}

fun main () {
    val question1 = Question<String>(
        "What is the capital of France?",
        "Paris",
        Difficulty.MEDIUM
    )
    val question2 = Question<Int>(
        "What is 2 + 2?",
        4,
        Difficulty.EASY
    )
    val question3 = Question<Boolean>(
        "Is the sky blue?",
        true,
        Difficulty.EASY
    )
    println (question1.toString())
}