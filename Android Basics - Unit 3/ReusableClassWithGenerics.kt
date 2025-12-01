class Question<T> (
    val questionText: String,
    val answer: T, 
    val diffculty: String
)

// So this Question class can now be used to create questions of different types like String, Int, Boolean etc.
// Why generics?
// 1. Code Reusability: Ekbar class likhe onek type er jonno use kora jabe
// 2. Type Safety: Compile time e type check hoye jabe automatically, jate kore runtime e type error na hoy
// 3. Flexibility: Different type er data handle korte parbe ektai class diye


// Example below:

fun main () {
    val question1 = Question<String>(
        "What is the capital of France?",
        "Paris",
        "Easy"
    )
    val question2 = Question<Int>(
        "What is 2 + 2?",
        4,
        "Easy"
    )
    val question3 = Question<Boolean>(
        "Is the sky blue?",
        true,
        "Easy"
    )
}