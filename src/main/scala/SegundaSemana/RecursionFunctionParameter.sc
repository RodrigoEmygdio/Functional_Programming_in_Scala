def sum(f: Int => Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (acc != 0) acc
    else loop(a, f(a) + acc)
  }
  loop(a, 0)
}

sum((num) => num +1 ,2,3)