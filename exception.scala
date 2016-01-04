import java.io.FileReader

import java.io.FileNotFoundException

import java.io.IOException

try{
	val f = new FileReader("input.txt")

}catch{
	case ex:FileNotFoundException =>
		println("文件没有发现")
	case ex: IOException =>
		println("IO异常")
}finally{
	println("文件关闭")
}


def makeRowSeq(row: Int) = 
	for(col <- 1 to 10)yield {
		val prod = (row * col).toString()
		val padding = " " * (4-prod.length)
		padding + prod
	}


def makeRow(row: Int) = makeRowSeq(row).mkString

def multiTable() = {
	val tableSeq = 
	for(row  <- 1 to 10)
	yield makeRow(row)

	tableSeq.mkString("\n")
}	