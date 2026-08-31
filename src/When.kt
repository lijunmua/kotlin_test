fun main() {
    // 带参数的when
    val argument = "山西";
    val provincialCapital: String = when (argument) {
        "山西" -> "太原"
        "河北" -> "石家庄"
        else -> "北京"
    }
    println(provincialCapital)

    val fraction = 1.4;
    val grade = when ((fraction * 100).toInt()) {
        in 121..150 -> "优"
        in 90 .. 120 -> "及格"
        else -> "不及格"
    }
    println(grade)

    // 无参的when
    val level = 9;
    val total = 10;
    val isSatisfied = when {
        level < total -> false;
        level == total -> false;
        level > total -> true;
        else -> false;
    }
    println(isSatisfied)
}