//Repeat the preceding exercise with a sorted map, so that the words are
//printed in sorted order.

// Read the file passed as an argument and get a mutable Map of words and their counts

def getWordCount(file: String): scala.collection.immutable.SortedMap[String, Int] = { 
	var wordMap = scala.collection.immutable.SortedMap[String, Int]()
	val f = new java.util.Scanner(new java.io.File(file))
	while(f.hasNext){
		val nextWord = f.next
		wordMap += ( nextWord -> (wordMap.getOrElse(nextWord, 0)+1))
	}
	wordMap
}

// Print out all the words and their counts

def printWords(wordMap: scala.collection.immutable.SortedMap[String,Int]){
	println("Word count: ")
	for((k,v) <- wordMap) print(k + " => " + v + "   ")
}

// Try

printWords(getWordCount("FileName"))