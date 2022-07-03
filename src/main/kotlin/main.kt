fun main() {
    val likes = 31
    val correctName = if (likes % 10 === 1 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $correctName ")
}