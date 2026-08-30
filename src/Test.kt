open class Shape
class Rectangle: Shape()

fun Shape.getName() = "Shape"
fun Rectangle.getName() = "Rectangle"  //虽然这里同时扩展了父类和子类的getName函数

fun printClassName(s: Shape) {  //但由于这里指定的类型是Shape，因此编译时也只会使用Shape扩展的getName函数
    println(s.getName())
}

fun main() {
    val name: String = "Shape"
    println(name test name)
    println(name.func())
    println(func(name))

    var stu: Stu<Int> = Stu(9)
    var stu1: Stu<out Number> = stu
    var stu2: Stu<*> = stu
    val age1: Number = stu1.age
    val age: Any? = stu2.age

}

infix fun String.test(name: String) : Int {
    return this.length
}

val func: String.() -> Int = {
    this.length
}


class Stu<T>(var age: T) {}