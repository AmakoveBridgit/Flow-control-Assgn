fun main() {
    oddNums()

    println( nameArray(arrayOf("Mercy","lola","Methulah","Smith")))



    getDrink(3)
    getDrink(8)
    getDrink(18)
    printNumb()

    }
//question1
fun oddNums(){
    for (nums in 1..100) {
        if (nums % 2 != 0) {
            println(nums)
        }

    }
}
//question2
fun nameArray(names:Array<String>):Int{
    var pple=0
    for (name in names)
        if (name.length>5){
            pple ++
        }
        return pple
}
//question3
fun getDrink(guests:Int){
    when(guests){
     in  0..5 -> println("serves milk")
    in  7..14-> println("fanta orange")
        else-> println("serves cocacola")
    }
}
//Question4
fun printNumb() {
    for (value in 1..100)
        if (value % 3 == 0 && value%5==0) {
            println("FizzBuzz")
        }
    else if (value%3 ==0){
        println("Fizz")
    }
    else if (value % 5==0) {
       println("Buzz") }

        }









