package SegundaSemana

import org.junit._
import org.junit.Assert.assertEquals
import SegundaSemana.FunctionRecursive._
class FunctionRecursiveTest {

  @Test def `deverar somar`:Unit={
    sum((num) =>num *2, 2,3)
  }

}
