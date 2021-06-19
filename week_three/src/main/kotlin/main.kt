fun main(){
    var n:Int = 1
    while(n<=100){
        when{
            n%3 == 0 && n%5 == 0 -> println("FizzBuzz")
            n%3 == 0 -> println("Fizz")
            n%5 == 0 -> println("Buzz")
            else -> println(n)
        }
        n++
    }
}



