val tolerance = 0.0001
def isClosedEnough(x: Double, y: Double) =
  scala.math.abs((x - y) / x) / x < tolerance

def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  def iterate(guess: Double): Double = {
    val next = f(guess)
    if (isClosedEnough(guess, next)) next
    else iterate(next)
  }

  iterate(firstGuess)
}

def avaregeDump(f:Double=> Double)(x:Double)= (x+f(x))/2

def sqrt(number: Double):Double=
  fixedPoint(avaregeDump(x=> number/x))(1)

sqrt(2)
scala.math.sqrt(2)