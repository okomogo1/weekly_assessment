fun main(){
    // 10 if Statements
    var num1: Int = 45
    var boy: String = chucks
    var age:Int =18
    var sex: String = male
    var fruit: String = mango
    var city: = asaba
    if (num1 > 10 ){
        println("hello")
    }
    if (boy == chucks){
        println("You are right")
        else println("You failed")
    }
    if (boy ==chucks && age >= 18){
        println("you are eligible")
        else println("Check back later")}

    if (age > 17){
        println(" Getting old")
        else println("young man")}

    if (sex == female){
        println(" Shemale")
        else println("Greetings")
    }
    if (age < 20){
        println ("Good")
        else println (" okay")
    }
    if(city ==asaba){
        println(" the boy is good")
        else println (" yeah")
    }
    if (fruit == mango){
        println("Mango is sweet")
        else(" its not mango")
    }
    if (fruit == mango && city != asaba){
        println(" not saba mango")
        else println(" this is asaba mango")
    }
    if (mango == male){
        println(" this is strange")
        else println("mormal thing")
    }

}


//5 when conditions
var scoreWhen: Int = 45
when(scoreWhen){
    in 70..100 -> println("A")
    in 60..69 -> println("B")
    in 50..59 -> println("C")
    in 40..49 -> println("D")
    in 39 downTo 0 -> println("F")
    else -> println("invalid score")
}

// second when statement
var isSelectedWhen: Boolean = false
when (isSelectedWhen) {
    true-> println("Item selected")
    else-> println("item not selected")
}

//third
var criteriaMarkWhen: Int = 50
when (criteriaMarkWhen) {
    in 70..100 -> println("you are qualified for this programme")
    in 69 downTo 0  -> println("you are not qualified, wait for another session")
    else -> println("Invalid mark")
}
//fouth when statement
var checkDataType:Int =56
when(checkDataType){
    is Int -> println("an interger numner")
}

var ourSeason: Int = 1
when (ourSeason) {
    1 -> println("Dry season")
    2 -> println("Raining season")
    else -> println("please select a valid season number")
}
}

