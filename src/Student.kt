open class Student (var name:String, var age: Int) {
    init {
        println("student init")
    }

    constructor() : this("", 0)

    constructor(name: String) : this(name, 0) {
        println("Student constructor name is $name")
    }

    var sex: String = "male"
        get() {
            return field
        }

    open fun hello() : Unit {
        println("Hello, morining $name!")
    }

    override fun toString(): String {
        return super.toString()
    }
}

class ArtStudent(name: String) : Student(name) {
    override fun hello(): Unit {
        println("Hello, afternoon $name!")
    }

    override fun toString(): String {
        return super.toString()
    }
}

class SportStudent(name: String, age: Int) : Student(name, age) {}

interface Course{
    fun hello() : Unit = println("Hello, course!")
    fun test() : Unit {}
}

interface Course2{
    fun hello() : Unit = println("Hello, course2!")
    fun test2() : Unit {}
}

class Teacher: Course, Course2{
    override fun hello(): Unit = super<Course>.hello()
}
