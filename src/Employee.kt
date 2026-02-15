class Employee{
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
}

fun main() {
    val employee = Employee()

    employee.fullName = "Вероника Гвоздева"
    employee.position = "Разработчик"

    // Зп отрицательная
    employee.salary = -1000
    println("Текущая зп: ${employee.salary}")

    // Зп положительная
    employee.salary = 50000
    println("\nТекущая зп: ${employee.salary}")

    // Опыт > 50
    employee.yearsOfExperience = 60
    println("Текущий опыт: ${employee.yearsOfExperience}")
}