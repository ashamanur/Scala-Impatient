// Write a function minmax(values: Array[Int]) that returns a pair containing the
// smallest and largest values in the array.

val arr = Array(1, 2, 4, 99, 32, 93, 28)

def minmax(values: Array[Int]): (Int,Int) = {
	(values.min, values.max)
}

//Print
print(minmax(arr))