import java.io.File

class NotHappyParser{
    fun parse(){

        var line = 0
        val index2 = 0
        val lines = File("/Users/annalabellarte/dev/university/bigdata/hashcode/src/a_example.txt").readLines()
        val header = lines[0].split(" ")
        Simulation.totBooks = header[0].toInt()
        Simulation.totLibraries = header[1].toInt()
        Simulation.days = header[2].toInt()

        Simulation.books = lines[1].split(" ").map { it.toInt() }
        val list = ArrayList<Library>()
        var index = 2
        for ( i in 0 until Simulation.totLibraries){
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
