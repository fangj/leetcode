// Source : https://oj.leetcode.com/problems/pascals-triangle/

/**********************************************************************************
  *
  * Given numRows, generate the first numRows of Pascal's triangle.
  *
  * For example, given numRows = 5,
  * Return
  *
  * [
  *      [1],
  *     [1,1],
  *    [1,2,1],
  *   [1,3,3,1],
  *  [1,4,6,4,1]
  * ]
  *
  *
  **********************************************************************************/

package com.fangjian.leetcode

/**
 * Created by fangjian on 14-11-8.
 */
object PascalTriangle {
  def grow(triangle: List[List[Int]]): List[List[Int]] = {
    val lastRow=triangle.last
    val lastRowLeft=0 :: lastRow
    val lastRowRight=lastRow :+ 0
    val pairs= lastRowLeft zip lastRowRight
    val newRow=for((l,r)<-pairs) yield l+r
    triangle :+ newRow
  }

  def generatePascalTriangle(row:Int): List[List[Int]] ={
    row match {
      case i if i<=0 =>Nil
      case 1 => List(List(1))
      case i => this.grow(generatePascalTriangle (i-1))
    }
  }

  def printPascalTriangle(triangle: List[List[Int]]): Unit ={
    for(row<-triangle){
      print(" "*(triangle.length-row.length))
      println(row)
    }
  }
}
/*
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
*/