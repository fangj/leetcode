// Source : https://oj.leetcode.com/problems/pascals-triangle-ii/

/**********************************************************************************
  *
  * Given an index k, return the kth row of the Pascal's triangle.
  *
  * For example, given k = 3,
  * Return [1,3,3,1].
  *
  * Note:
  * Could you optimize your algorithm to use only O(k) extra space?
  *
  *
  **********************************************************************************/

package com.fangjian.leetcode

/**
 * Created by fangjian on 14-11-8.
 */
object PascalTriangle2 {
  def grow(lastRow: List[Int]): List[Int]= {
    val lastRowLeft=0 :: lastRow
    val lastRowRight=lastRow :+ 0
    val pairs= lastRowLeft zip lastRowRight
    for((l,r)<-pairs) yield l+r
  }

  def generatePascalTriangleLastRow(row:Int): List[Int] ={
    row match {
      case i if i<0 =>Nil
      case 0 => List(1)
      case i => this.grow(generatePascalTriangleLastRow (i-1))
    }
  }

}

//TEST

import org.junit._
import Assert._

@Test
class PascalTriangleTest {

  @Test
  def test1() = {
    val triangleLastRow=PascalTriangle2.generatePascalTriangleLastRow(3)
    println(triangleLastRow)
    Assert.assertEquals(List(1,3,3,1),triangleLastRow)
  }
}
