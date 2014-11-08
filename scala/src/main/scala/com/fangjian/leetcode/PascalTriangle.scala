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
    val newLastRow=for(_<-lastRow){
      //TODO
    }
    triangle
  }

  def generatePascalTriangle(row:Int): List[List[Int]] ={
    row match {
      case i if i<=0 =>Nil
      case 1 => List(List(1))
      case 2 => List(List(1,1))
      case i => this.grow(generatePascalTriangle (i-1))
    }
  }
}
