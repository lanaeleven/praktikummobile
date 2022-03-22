import kotlin.random.Random

fun main() {
    print("Waktu Sekarang: ")
    val waktu = readLine()
    print("Nama Anda: ")
    val nama = readLine()
    print("Umur Anda: ")
    val umur = readLine()?.toInt()
    println("Suhu tubuh Anda: (35-37)")
    val suhu = Random.nextDouble(35.0, 37.0)

    println("Selamat $waktu, $nama. Umur Anda $umur tahun.")
    println("Suhu tubuh Anda %.1f derajat celcius". format(suhu))
}