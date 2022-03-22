fun main() {
    print("Nilai x = ")
    val x = Integer.valueOf(readLine())
    println(hitung(x))
}

fun hitung(x: Int): Int {
    return 2* x *x + 5*x - 8
}