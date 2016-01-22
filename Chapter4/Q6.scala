// Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and
// similarly for the other weekdays. Demonstrate that the elements are visited
// in insertion order

val Lmap = scala.collection.mutable.LinkedHashMap(
	"Tuesday" -> java.util.Calendar.TUESDAY, 
	"Wednesday" -> java.util.Calendar.WEDNESDAY, 
	"Thursday" -> java.util.Calendar.THURSDAY, 
	"Friday" -> java.util.Calendar.FRIDAY,
	"Saturday" -> java.util.Calendar.SATURDAY, 
	"Sunday" -> java.util.Calendar.SUNDAY, 
	"Monday" -> java.util.Calendar.MONDAY)

//Order of insertion.

println(Lmap)

// Map(Tuesday -> 3, Wednesday -> 4, Thursday -> 5, Friday -> 6, Saturday -> 7, Sunday -> 1, Monday -> 2)
