import java.io.File

class NotHappyParser{
    fun parse(){
        File("/a_example.txt").forEachLine {
            println(it)
        }
    }

}
