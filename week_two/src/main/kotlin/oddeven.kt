fun main(){
    //print all even numbers between 10 and 20 and all odd numbers between 20 and 30
    var oddEven:Int = 10
    while (oddEven<=30){
        when(oddEven){
            in 10..20 -> {
                when {
                    oddEven % 2 == 0 -> println(oddEven)
                }
            }
            //odd numbers between 20 to 30
            in 20..30 -> {
                when {
                    oddEven % 2 != 0 -> println(oddEven)
                }
            }
        }
        if(oddEven == 20){
            println("-----------------------------")
        }
        oddEven++
    }

}
