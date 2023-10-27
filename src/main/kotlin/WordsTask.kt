fun main(args: Array<String>) {
    val str: String = readln()
    val words = str.split(' ')
    var noWords : Boolean = true
    for(i in words){
        if(i.length >=3 && i[0]=='а')
        {
            println(i)
            noWords = false
        }
    }
    if(noWords)
        println("Слов на 'а' больше 3 символов не найдено")
}
