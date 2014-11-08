package com.fangjian.leetcode

/**
 * Created by fangjian on 14-11-8.
 */
//TEST

import org.junit._
import Assert._

@Test
class PascalTriangleTest {

  @Test
  def test1() = {
    val triangle=PascalTriangle.generatePascalTriangle(5)
    //println(triangle)
    PascalTriangle.printPascalTriangle(triangle)
  }
}
