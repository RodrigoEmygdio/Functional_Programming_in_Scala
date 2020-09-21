class Rational(x: Int, y: Int) {
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x,y)
  def numer = x
  def denom = y

  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def unary_- : Rational = new Rational(-numer, denom)
  def < (that:Rational) =  numer* that.denom < that.numer * denom
  def - (that:Rational) = this +  -that
  def max(that:Rational) = if( this < that) that else this
  override def  toString = s"${x/g}/ ${y/g}"
}

val x = new Rational(1, 2)
x.numer
x.denom

val z = x + new Rational(2,3)
z.numer
z.denom
z.toString
