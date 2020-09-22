package TerceiraSemana.lists.utils

import TerceiraSemana.lists.List

object ListUtil {
  def nth[T](pos: Int, xs: List[T]): T =
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (pos == 0) xs.head
    else nth(pos - 1, xs.tail)
}
