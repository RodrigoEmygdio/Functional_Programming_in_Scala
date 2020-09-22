package TerceiraSemana

import TerceiraSemana.lists.utils.ListUtil
import TerceiraSemana.lists.{Cons, List, Nil}
import org.junit.Assert.{assertEquals, fail}
import org.junit.Test

class ListTest {

  trait Fixture {
    val oneElement = new Cons[Int](1, new Nil[Int])
    val twoElement = new Cons[Int](1, new Cons[Int](2, new Nil[Int]))
  }


  @Test def `should return nth element of on List[T]`: Unit = {
    new Fixture {
      val elem: Int = ListUtil.nth(0, oneElement)
      assertEquals(1, elem)

    }
  }
  @Test def `should return second element of on List[T]`: Unit = {
    new Fixture {
      val elem: Int = ListUtil.nth(1, twoElement)
      assertEquals(2, elem)

    }
  }

  @Test def `should return  IndexOutOfBoundsException`: Unit = {
    new Fixture {
      try {
        ListUtil.nth(2, twoElement)
        fail("`should return  IndexOutOfBoundsException")
      } catch {
        case e: IndexOutOfBoundsException => true
      }
    }
  }

  @Test def `should return  IndexOutOfBoundsException when pos is less than zero`: Unit = {
    new Fixture {
      try {
        ListUtil.nth(-1, twoElement)
        fail("`should return  IndexOutOfBoundsException")
      } catch {
        case e: IndexOutOfBoundsException => true
      }
    }
  }
}
