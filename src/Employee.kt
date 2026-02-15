class Employee: ReportGenerator{
    var fullName: String = ""
        get() = field

    var position: String = ""
        get() = field

    var salary: Int = 0
        get() = field
        set(value) {
            if (value < 0) {
                println("Зарплата не может быть отрицательной")
            } else {
                field = value
            }
        }

    var yearsOfExperience: Int = 0
        get() = field
        set(value) {
            if (value > 50) {
                println("\nОпыт работы ограничен 50 годам")
                field = 50
            } else
                field = value
        }

    var currentTask: Task? = null

    override fun generateReport(): String {
        return "=== Данные сотрудника === \nФИО: $fullName \nДолжность: $position \nЗарплата: $salary руб \nОпыт работы: $yearsOfExperience"
    }

    fun assignTask(newTask:  Task) {
        val task = currentTask
        if (task != null && !task.isCompleted) {
            println("Сотрудник уже занят задачей: ${task.title}")
        } else {
            currentTask = newTask
            println("Сотруднику назначена задача: ${newTask.title}")
        }
    }
}



fun main() {
    val employee = Employee()
    employee.fullName = "Вероника Гвоздева"
    employee.position = "Разработчик"
    val task1 = Task("ДЗ - 1", "делать дз", Priority.LOW, false)
    val task2 = Task("ДЗ - 2", "делать дз", Priority.HIGH, false)
    val devDepartment = DevelopmentDepartment()

    // Зп отрицательная
    employee.salary = -1000
    println("Текущая зп: ${employee.salary}")

    // Зп положительная
    employee.salary = 50000
    println("\nТекущая зп: ${employee.salary}")

    // Опыт > 50
    employee.yearsOfExperience = 60
    println("Текущий опыт: ${employee.yearsOfExperience}")
    println()

    println(devDepartment.generateReport())
    println()

    employee.assignTask(task1)
    employee.assignTask(task2)
}