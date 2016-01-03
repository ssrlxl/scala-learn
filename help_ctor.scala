
/*
	scala 构造器
	scala private 
*/

class Rational(n: Int, d: Int){

	require(d != 0)

	private val g = gcd(n.abs, d.abs)
	val number: Int = n / g
	val denom: Int = d / g

	def this(n: Int) = this(n, 1)

	override def toString = number +"/" +denom


	def add(that: Rational): Rational = 
		new Rational(
				number * that.denom + that.number *denom,
				denom * that.denom
			)


	def +(that: Rational):Rational = 
		new Rational(
			number * that.denom + that.number * denom
			,denom * that.denom
			)
	def *(that: Rational):Rational = 
		new Rational(number *that.number, denom*that.denom)	
	private def gcd(a: Int, b: Int):Int = 
		if (b == 0) a else gcd(b, a %b)		
}


val rat1 = new Rational(10,1)
var rat2 = new Rational(2)
println(rat1)
println(rat2)

var gcd = new Rational(66,42)

println(rat1.add(rat2))

println("最大公约数 ", gcd)

println("加＋ ", rat1+rat2)

println("乘法* ", rat1*rat2)