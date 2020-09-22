package TerceiraSemana

import TerceiraSemana.sets.{Empty, NonEmpty}
import org.junit.Assert.{assertEquals, assertFalse, fail}
import org.junit._

class TestIntSet {
  @Test def `should create union set` = {
    val t1  = new NonEmpty(3, new Empty, new Empty)
    t1.getElemen
    val t2 = t1 incl 4

    val t3 = new NonEmpty(10, new Empty, new Empty)
    val unionSets = t3.union(t2)
    println(s"t3: ${t3}")
    println(s"t2 ${t2}")
    println(s"t3.union(t2): ${unionSets}")
    assertEquals(4,unionSets.getRight.getElemen)
  }

  @Test def `should create union set with no equals values` = {
    val t1  = new NonEmpty(3, new Empty, new Empty)
    t1.getElemen
    val t2 = t1 incl 4

    val t3 = (new NonEmpty(10, new Empty, new Empty)) incl 4

    val unionSets = t2.union(t3)
    println(s"t3: ${t3}")
    println(s"t2 ${t2}")
    println(s"t2.union(t3): ${unionSets}")
    assertEquals(4,unionSets.getLeft.getElemen)
    assertEquals(3,unionSets.getLeft.getLeft.getElemen)

  }
}
