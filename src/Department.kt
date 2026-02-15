abstract class Department {
    abstract val departmentName: String
    abstract fun printDepartmentGoal()
}

class DevelopmentDepartment: Department(), ReportGenerator {
    override val departmentName: String = "Отдел разработки"
    override fun printDepartmentGoal() {
        println("Писать эффективный код")
    }

    override fun generateReport(): String {
        return "=== Информация о отделе === \nНазвание: $departmentName \nЦель: Писать эффективный код"
    }
}

class TestingDepartment: Department() {
    override val departmentName: String = "Отдел тестирования"
    override fun printDepartmentGoal() {
        println("Искать баги")
    }
}

fun main() {
    val devDepartment = DevelopmentDepartment()
    val testDepartment = TestingDepartment()

    println("${devDepartment.departmentName}:")
    devDepartment.printDepartmentGoal()

    println("\n${testDepartment.departmentName}:")
    testDepartment.printDepartmentGoal()
}