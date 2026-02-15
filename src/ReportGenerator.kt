interface ReportGenerator {
    fun generateReport(): String
}

fun main() {
    val employee = Employee()
    val devDepartment = DevelopmentDepartment()
    employee.fullName = "Вероника Гвоздева"
    employee.position = "Разработчик"
    employee.salary = 50000
    employee.yearsOfExperience = 3
    val report: List<ReportGenerator> = listOf(
        employee,
        devDepartment
    )

    for (i in report) {
        println(i.generateReport())
        println()
    }
}