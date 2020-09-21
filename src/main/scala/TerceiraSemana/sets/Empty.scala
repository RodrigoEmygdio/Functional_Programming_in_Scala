package TerceiraSemana.sets

class Empty extends IntSet {
  override def getRight: IntSet = new Empty

  override def getLeft: IntSet = new Empty

  override def getElemen: Int = 0

  override def incl(x: Int) = new NonEmpty(x, new Empty, new Empty)

  override def contains(x: Int) = false

  override def toString = "."

  override def union(other: IntSet): IntSet = other
}
