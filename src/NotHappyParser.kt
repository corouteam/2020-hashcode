import java.io.File

class NotHappyParser{
    fun parse(){

        var line = 0
        val index2 = 0
        val simulation = Simulation(0, 0,0, listOf(), listOf())
        val lines = File("/Users/annalabellarte/dev/university/bigdata/hashcode/src/a_example.txt").readLines()
        val header = lines[0].split(" ")
        simulation.totBooks = header[0].toInt()
        simulation.totLibraries = header[1].toInt()
        simulation.days = header[2].toInt()

        simulation.books = lines[1].split(" ").map { it.toInt() }
        val list = ArrayList<Library>()
        var index = 2
        for ( i in 0 until simulation.totLibraries){
                var line = lines[index].split(" ")
                index ++
                val l = Library(id = line[0].toInt(), books = setOf(), signTime = line[1].toInt(), booksForDay =  line[2].toInt() )
                line = lines[index].split(" ")
                l.books = line.map { it.toInt() }.toSet()
                index ++
            list.add(l)
        }

        print("")
    }


}
