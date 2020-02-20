import java.io.File

class NotHappyParser{
    fun parse(){

        val line = 0
        val simulation = Simulation(0, 0,0, listOf())
        File("/Users/annalabellarte/dev/university/bigdata/hashcode/src/a_example.txt").forEachLine {
            if(line == 0){
                val header = it.split(" ")
                simulation.totBooks = header[0].toInt()
                simulation.totLibraries = header[1].toInt()
                simulation.days = header[2].toInt()

            }
            if(line == 1){
                //peso dei libri
            }
            if(line == 2){

            }
        }
    }

}
