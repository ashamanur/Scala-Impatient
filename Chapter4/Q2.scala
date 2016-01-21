//Write a program that reads words from a file. Use a mutable map to count
//how often each word appears. To read the words, simply use a java.util.Scanner:
//val in = new java.util.Scanner(java.io.File("myfile.txt"))
//while (in.hasNext()) process in.next()

// Read the file passed as an argument and get a mutable Map of words and their counts

def getWordCount(file: String): scala.collection.mutable.Map[String, Int] = { 
	val wordMap = scala.collection.mutable.Map[String, Int]()
	val f = new java.util.Scanner(new java.io.File(file))
	while(f.hasNext){
		val nextWord = f.next
		wordMap += ( nextWord -> (wordMap.getOrElse(nextWord, 0)+1))
	}
	wordMap
}

// Print out all the words and their counts

def printWords(wordMap: scala.collection.mutable.Map[String,Int]){
	println("Word count: ")
	for((k,v) <- wordMap) print(k + " => " + v + "   ")
}

// Try

printWords(getWordCount("FileName"))