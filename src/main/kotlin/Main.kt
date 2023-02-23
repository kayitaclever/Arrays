fun main(){

    val friends = arrayOf("batiam","chantal","Liliane","Kizito")
    println(friends.contentToString())
    println(friends.get(1))
    println("${friends[2]} ${friends[3]}")
    friends.set(1,"Lenana")
    println(friends.contentToString())
    //or
    friends[2]="Kipkorir"
    println(friends.contentToString())
    var friends2 = friends.plus("Kimari")
    println(friends2.contentToString())
    val newfriends = arrayOf("sarah","Fred","Julia")
    friends2= friends2.plus(newfriends)
    println(friends2.contentToString())
    var firstName= friends[0]

    friends[0]=friends[3]
    friends[3]=firstName
    println(friends.contentToString())

    println(friends.indexOf("Jack"))
    println(friends.contentToString())
    println(friends.indexOf("batiam"))

    val numbers= arrayOf(43,7,8797,322,24,3,6)
    println(numbers.indexOf("322"))
//


}
//write a function that takes in the dimensions of a cuboid and returns its volume

fun dimensions (num1:Int,num2:Int,num3:Int):Int{

}



