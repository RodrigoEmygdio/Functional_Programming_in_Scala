package TerceiraSemana.sets

abstract class IntSet{
  def incl(x:Int): IntSet
  def contains(x:Int): Boolean
  def union(other: IntSet): IntSet
  def getElemen:Int
  def getLeft: IntSet
  def getRight: IntSet
}
