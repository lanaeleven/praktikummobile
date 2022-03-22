import kotlin.random.Random

fun main() {
    val TVku = Televisi()
    TVku.cetakSpesifikasi()
    TVku.nyalakanTV()
}

class Televisi {
    val merk: String = "Toshiba"
    val ukuranLayar: Int = 42
    val siaran = arrayOf<String>("Mata Najwa", "Opera van Java", "On the Spot")

    fun cetakSpesifikasi() {
        println("TV ini bermerk $merk dengan ukuran layar $ukuranLayar")
    }
    fun nyalakanTV() {
        println(siaran[Random.nextInt(0, 2)])
    }
}