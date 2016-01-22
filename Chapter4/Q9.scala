// Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing
// the counts of values less than v, equal to v, and greater than v.


val arr = Array(1, 2, 4, 99, 32, 93, 28)

def lteqgt(values: Array[Int], v: Int)={
(values.count(_ < v), values.count(_ == v), values.count(_ > v))
}

print(lteqgt(arr,32))