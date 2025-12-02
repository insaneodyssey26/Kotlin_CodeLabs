class Quiz {
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
    companion object StudentProgress {
    var total: Int = 10
    var answered: Int = 4
}
}

val Quiz.StudentProgress.progressText: String
get() = "$answered out of $total answered."

class Question<T> (
    val questionText: String,
    val answer: T, 
    val diffculty: Difficulty
)

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}

fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) {
        print("█")
    }
    repeat(Quiz.total - Quiz.answered) {
        print("░")
    }
    println()
    println(Quiz.progressText)
}

fun main() {
    println(Quiz.printProgressBar())
}