import scala.io.Source

object LongLines{

	def processFile(fileName: String, width: Int){

		val source = Source.fromFile(fileName)
		for(line <- source.getLines)
			processFile(from)
	}

	private def processFile(fileName:String, width:Int, line:String){
		if (line.length > width){
			println(fileName +": "+line.trim)
		}
	}
}

def filesMatching(query:String, matcher:(String,String) => Boolean) = {

	for(file <- filesHere; if matcher(file.getName, query))
		yield file
}

def filesEnding(query:String) = 
	filesMatching(query, _.endsWidth(_))