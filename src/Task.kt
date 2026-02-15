enum class Priority {
    LOW, MEDIUM, HIGH
}

data class Task(
    val title: String,
    val description: String,
    val priority: Priority,
    var isCompleted: Boolean = false
)

fun main() {
     val task1 = Task("ДЗ", "делать дз", Priority.LOW, true)
     val task2 = Task("ДЗ", "делать дз", Priority.LOW, true)
     val task3 = Task("Отдыхать","ничего не делать", Priority.HIGH)

    println("=== toString() ===")
    println("task1: $task1")
    println("task2: $task2")
    println("task3: $task3\n")

    println("=== equals() ===")
    println("task1 == task2: ${task1.equals(task2)}")
    println("task1 == task3: ${task1.equals(task3)}\n")

    println("=== hashCode() ===")
    println("task1: ${task1.hashCode()}")
    println("task2: ${task2.hashCode()}")
    println("task3: ${task3.hashCode()}\n")

    println("=== copy() ===")
    val task4 = task3.copy(priority = Priority.LOW, isCompleted = true)
    println("task3: $task3")
    println("task4: $task4")
}