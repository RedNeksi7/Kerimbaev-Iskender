fun main(args: Array<String>) {
    println(calculator(34.4,55.0,'*'))

    val myName="Iskender"

    val names= listOf("Erik", "Islam", "Ruslan","Dooron", "Nooruz", "Bektur")
    val assembledName = assembleName(names)
    println("Собранное имя: $assembledName")
}

fun calculator(a: Double, b:Double, c:Char):Double{
    return when(c){
        '+'->a+b
        '-'->a-b
        '*'->a*b
        '/'->a/b
        else -> throw IllegalArgumentException("Недопустимое значение.")    }
}

fun assembleName(names: List<String>): String {
    val nameSet = mutableSetOf<Char>()
    val assembledName = StringBuilder()

    for (name in names) {
        for (char in name) {
            if (char.toLowerCase() in "iskender") {
                nameSet.add(char.toLowerCase())
            }
        }
    }

    for (char in "iskender") {
        if (nameSet.contains(char)) {
            assembledName.append(char)
        }
    }

    return assembledName.toString()
}