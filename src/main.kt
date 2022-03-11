fun main(){
    //Question one
    array(arrayOf("Alan", "Zuriel", "Naham", "Zahavah"))

    //Question two
    city()

    //Question three
    calculations()

    //Question four
    var con = contain(arrayOf("Zhoe", "Peter", "James", "Elly"))
    println(con.contentToString())
}

fun array(characters:Array<String>) {
    var strings = characters
    println(strings.contentToString())
}

fun city() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { city ->
        println(city.capitalize())
    }
}

fun calculations() {
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)

    //prints out the sum of the second and fifth elements
    var sum = numbers[1] + numbers[4]
    println(sum)

    //prints out the index of 158
    var index = numbers.indexOf(158)
    println(index)

    //prints out the elements in ascending order
    var sorting = numbers.sortedArray()
    println(sorting.contentToString())
}

fun contain(names: Array<String>): Array<String>{
    var elements = names
    return elements

}