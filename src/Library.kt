data class Library(
    val id: Int,
    var books: Set<Int>,
    val signTime: Int,
    val booksForDay: Int
) {

    fun getScore(): Double{
        val bookWeigth = 1
        val signTimeWeigth = 1
        val booksForDayWeigth = 1

        val bookScore = books.map{ Simulation.books[it] }.average()
        val signScore = signTime
        val booksForDayScore = booksForDay

        return (bookScore*bookWeigth + booksForDayWeigth*booksForDayScore)/(signScore*signTimeWeigth)
    }
}