// Below is a singleton object.
// What is singleton object?
// A singleton object is a design pattern that restricts the instantiation of a class to a single instance.
// This is useful when exactly one object is needed to coordinate actions across the system.
// Suppose you are building a student progress tracker app,
// and you want to keep track of the total number of questions and the number of questions answered by a student.
// You can use a singleton object to hold this data.
// If we used a regular class instead of a singleton object,
// we would need to create an instance of the class to access its properties,
// which would be unnecessary since we only need one instance to track the progress.

object StudentProgress {
    var total: Int = 10
    var answered: Int = 4
}

fun main() {
    println("${StudentProgress.answered} out of ${StudentProgress.total} answered.")
}