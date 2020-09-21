package TerceiraSemana.sets

class NonEmpty(elem: Int, left: IntSet, rigth: IntSet) extends IntSet {
  override def getElemen: Int = elem

  override def getRight: IntSet = rigth

  override def getLeft: IntSet = left

  override def incl(x: Int) = {
    if (x < getElemen) new NonEmpty(getElemen, left incl x, rigth)
    else if (x > getElemen) new NonEmpty(getElemen, left, rigth incl x)
    else this
  }


  override def contains(x: Int) =
    if (getElemen < x) left contains x
    else if (getElemen > x) rigth contains x
    else true

  override def union(other: IntSet): IntSet = {
    println(s"left: $left - right: $rigth - other : $other - elem: $elem")
    ((left union rigth) union other) incl elem
  }

  override def toString = "{" + left + elem + rigth + "}"
}
