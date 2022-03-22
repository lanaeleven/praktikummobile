fun main() {
    print("Input bilangan = ")
    val angka = Integer.valueOf(readLine())
    var batas = 0
    var hasil = angka
    while (batas < 5) {
        hasil += angka
        if (hasil % 2 == 0 || hasil % 3 == 0) {
            print("$hasil ")
            batas++
        }
    }
}