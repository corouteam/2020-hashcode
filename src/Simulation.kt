data class Simulation(
    var days: Int,
    var totBooks: Int,
    var totLibraries: Int,
    var books: List<Int>,
    val libraries: List<Library>
)