fun main() {
    addition()

    num()

    elements()
    var Person= listOf(
        Person("Melvin",26,5.3,65.7),
        Person("Glenah",30,5.8,80.5),
        Person("Phylis",32,5.8,88.9),
        Person("Darlene",24,5.3,88.8)
    )
    println(Person)

    var name=names("Omenta","Naom","Lindsay")
    println(name)





}
//Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
fun addition(){
var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers[1]+numbers[4]
    println(sum)
}
//(ii) prints out the index of 158 (1 point)
fun num(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var s=numbers.indexOf(158)
    println(s)
}
//(iii) prints out the elements in ascending order. (1 point)
fun elements(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var x=numbers.sortedArray().contentToString()
    println(x)
}
//Given a list of Person objects, each with the attributes, name, age, height, and weight.
// Sort the list in order of descending age (2 points)
data class Person(var name:String,var age:Int,var height:Double,var weight:Double){

}
//Create a function that takes in 3 names and returns a string array containing all 3 names. (2 points)
fun names(nam1:String,nam2:String,nam3:String):Array<String>{
    return arrayOf(nam1,nam2,nam3)
}
//Write a function that takes in a list of Car objects each with a registration and mileage attribute and
// returns the average mileage of all the vehicles in the list. (3 points)

