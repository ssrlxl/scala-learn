
val filesHere = (new java.io.File(".")).listFiles
def fileLines(file: java.io.File) = 
	scala.io.Source.fromFile(file).getLines.toList




for(
	file <- filesHere
	if file.isFile;
	if file.getName.endsWith(".scala")
	)println(file)

/*
   嵌套枚举
*/

def grep(pattern: String) = 
	for(
		file <- filesHere
		if file.getName.endsWith(".scala");

		line <- fileLines(file)
		if line.trim.matches(pattern)
	)println(file + ": "+line.trim)


grep(".*gcd.*")


println("生成新的数组。。。")

def scalaFiles = 
	for{
		file <- filesHere
		if file.getName.endsWith(".scala")
	}yield file

for(
	fils<-scalaFiles
	)println(fils)

val forLineLengths = 
	for{
		file <- filesHere
		if file.getName.endsWith(".scala");

		line <- fileLines(file)
		trimmed = line.trim
		if trimmed.matches(".*for.*")


		}yield trimmed.length

for{
	line <- forLineLengths
}println(line)		