package br.com.alura.bytebank.teste

fun doWhile(to: Int) {
    var test = true
    var count = 0
    do {
        println(count)
        count++
        if (count >= to) {
            test = false
        }
    } while(test)
}