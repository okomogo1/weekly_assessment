fun main(args: Array<String>){
    //define a loop 1 - 100
    var num:Int = 1
    while (num<=100){
        println(num)
        num++
    }
    //loop to print from 1-10 without printing 4 and 5
    var numbertoTen:Int = 1
    while (numbertoTen<=10){
        when(numbertoTen){
            !in 4..5 -> println(numbertoTen)
        }
        numbertoTen++
    }
}