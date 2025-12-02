class Question<T> (
    val questionText: String,
    val answer: T, 
    val diffculty: Difficulty
)

// Why use an enum class?
// 1. To represent a fixed set of constants
// 2. To improve code readability and maintainability
// 3. To group related constants together
// 4. To provide type safety

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
}