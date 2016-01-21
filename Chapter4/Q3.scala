//Repeat the preceding exercise with an immutable map.

// Read the file passed as an argument and get a mutable Map of words and their counts

def getWordCount(file: String): Map[String, Int] = {           // Returns a Map
	var wordMap = scala.collection.mutable.Map[String, Int]()  // make it var
	val f = new java.util.Scanner(new java.io.File(file))
	while(f.hasNext){
		val nextWord = f.next
		wordMap += ( nextWord -> (wordMap.getOrElse(nextWord, 0)+1))  // A new copy of the Map is created everytime.
	}
	wordMap
}

// Print out all the words and their counts

def printWords(wordMap: Map[String,Int]){          // Pass a Map of word -> count as argument
	println("Word count: ")
	for((k,v) <- wordMap) print(k + " => " + v + "   ")
}

// Try

printWords(getWordCount("FileName"))