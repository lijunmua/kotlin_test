import kotlin.contracts.contract

var j = 3
    get() {
        return 3
    }

fun main() {
    var teacher: Course2 = Teacher();
    println(teacher is Course)
    println(teacher is Course2)
    println(teacher is Teacher)
    teacher.hello()
    val list: List<Int> = listOf(1, 2)
    val all: Boolean = list.any() { it >= 2 }
    println(all)
    var mutableListOf: MutableList<Int> = mutableListOf<Int>(1, 2)
    mutableListOf = mutableListOf()

    val l: List<Pair<Int, String>> = listOf<Pair<Int, String>>(1 to "A", 2 to "B", 3 to "C")
}


fun sum(a: Int= 3, b: Int= 4): Int {
    return a + b
}

fun sum(a: String= "all", b: String= "msg"): String {
    return a + b
}

// 递归
tailrec fun fib(index: Int): Long {
    if (index in 1..2) return 1
    return fib(index -2) + fib(index - 1)
}

// 高阶函数
fun advancedFunction() {
    var x : (String, String) -> Int = bef@{a, b ->
        println(b)
        return@bef 666
    }
    println(x("mlj", "lijun"))
}
