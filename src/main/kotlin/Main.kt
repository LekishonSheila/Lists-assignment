fun main() {


    val heights = listOf(1.10, 1.34, 1.80, 1.6, 1.95)
    val (averageHeight, totalHeight) = calculateHeight(heights)
    println("Average height is $averageHeight meters")
    println("Total height is $totalHeight meters")

    sortedPersons.forEach { println("${it.name} (${it.age} years)") }
}

//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices (i.e)index 2,4,6 etc
fun getStringsAtEvenIndices(strings: List<String>): List<String> {
    val result = mutableListOf<String>()
    for (i in strings.indices) {
        result.add(strings[i])
    }
    return result
}



//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun calculateHeight(heights: List<Double>): Pair<Double, Double> {
    val totalHeight = heights.sum()
    val averageHeight = totalHeight / heights.size.toDouble()
    return Pair(averageHeight, totalHeight)
}






//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(val name: String, val age: Int, val height: Double, val weight: Double)


    val people = listOf(
        Person("Alice", 25, 1.7, 65.0),
        Person("Bob", 30, 1.8, 75.0),
        Person("Charlie", 20, 1.6, 60.0)
    )

    val sortedPersons = people.sortedByDescending { it.age }


//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.







//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.


