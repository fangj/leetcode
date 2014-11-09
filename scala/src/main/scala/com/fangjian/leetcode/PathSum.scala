// Source : https://oj.leetcode.com/problems/path-sum/

/**********************************************************************************
  *
  * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
  * such that adding up all the values along the path equals the given sum.
  *
  * For example:
  * Given the below binary tree and sum = 22,
  *
  *               5
  *              / \
  *             4   8
  *            /   / \
  *           11  13  4
  *          /  \      \
  *         7    2      1
  *
  * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
  *
  **********************************************************************************/
package com.fangjian.leetcode



/**
 * Created by fangjian on 14-11-8.
 */
class TreeNode(var value:Int,var left:TreeNode,var right:TreeNode){
  override def toString: String = {
    "TreeNode["+"V:"+value+" L:"+left+" R:"+right+"]"
  }
  def this(value:Int)={
    this(value,null,null)
  }
  def prettyPrint(): Unit ={
    print(value+" ")
    if(this.left!=null){
      print("/");
      this.left.prettyPrint()
    }
    if(this.right!=null) {
      print("\\");
      this.right.prettyPrint()
    }
  }
  def isLeaf:Boolean={
   this.left==null && this.right==null
  }
  def hasSum( expectSum:Int):Boolean={
    hasSum(0,expectSum)
  }



  def hasSum(currentSum: Int, expectSum: Int): Boolean = {
    val newCurrentSum=currentSum+value
    println("visit:"+value+" sum:"+newCurrentSum)
    if (this.isLeaf) {
      expectSum==newCurrentSum
    }else{
      left.hasSum(newCurrentSum,expectSum) || right.hasSum(newCurrentSum,expectSum)
    }
  }
}

  class PathSum {
  /**
   * Definition for binary tree
   * struct TreeNode {
   *     int val;
   *     TreeNode *left;
   *     TreeNode *right;
   *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
   * };
   */
  var root=new TreeNode(1,null,null)


}

import org.junit._

@Test
class PathSumTest{
  @Test
  def test1={
    val root=new TreeNode(5,
      new TreeNode(4 ,new TreeNode(11, new TreeNode(7),new TreeNode(2)),null),
      new TreeNode(8,new TreeNode(13),new TreeNode(4,null,new TreeNode(1))))
    println(root)
    root.prettyPrint()
    println();
    val result=root.hasSum(22);
    Assert.assertTrue(result);
  }

}