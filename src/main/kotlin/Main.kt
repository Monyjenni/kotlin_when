fun main(args: Array<String>) {
   // use the when fuction instead of the if and else function

    val time : Int = 12
    when (time){
        in 0..11->println("Breakfast Time ")
        12 -> println("Lunch Time")
        else -> println("It's diet time")
    }

//    // use when to print the day
//    val day = 4
//
//    val result : when (day){
//
//        1 -> "2"
//        2
//    }
    val number : Int = 2
    when (number){
        1->println("number is 1")
        2->println("number is 2")
        3->println("number is 3")
        4,2 -> println("It's 4 or 2")
        else -> println("the number is unknown")

    }

    //while loop
    var I: Int = 0
    while (I>100){
        println(I)
        I++

    }
}