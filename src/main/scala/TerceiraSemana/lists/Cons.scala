package TerceiraSemana.lists


class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  override def isEmpty: Boolean = false

  override def toString = s"head: $head - tail: $tail"
}

