class Employee(
    fullName: String,
    position: String,
    salary: Int,
    yearsOfExperience: Int
){
    var fullName: String = fullName
        get() = field

    var position: String = position
        get() = field

    var salary: Int = salary
        get() = field
}