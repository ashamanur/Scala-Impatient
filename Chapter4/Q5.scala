import scala.collection.JavaConversions.mapAsScalaMap

// Read the file passed as an argument and get a mutable Map of words and their counts

def getWordCount(file: String): scala.collection.mutable.Map[String, Int] = { 
	val wordMap: scala.collection.mutable.Map[String, Int] = = new java.util.TreeMap[String, Int]()
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