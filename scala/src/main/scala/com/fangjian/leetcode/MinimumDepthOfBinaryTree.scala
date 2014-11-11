// Source : https://oj.leetcode.com/problems/minimum-depth-of-binary-tree/

/**********************************************************************************
  *
  * Given a binary tree, find its minimum depth.
  *
  * The minimum depth is the number of nodes along the shortest path from the root node
  * down to the nearest leaf node.
  *
  **********************************************************************************/

/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
package com.fangjian.leetcode

/**
 * Created by Fang Jian on 14-11-9.
 */
class MinimumDepthOfBinaryTree {

}

class TreeNode2( value:Int, left:TreeNode2, right:TreeNode2) extends TreeNode(value,left,right){
     def minDepth:Int={
        if (left==null && right==null){
            1
        }else if(left==null && right!=null){
            right.minDepth+1
        }else if(right==null && left!=null){
            left.minDepth+1
        }else{
            Math.min(left.minDepth,right.minDepth)+1;
        }
     }

    def this(value:Int)={
        this(value,null,null)
    }
}

//TEST
import org.junit._
@Test
class MinimumDepthOfBinaryTreeTest{

    @Test
    def test()={
        val root=new TreeNode2(5,
            new TreeNode2(4 ,new TreeNode2(11, new TreeNode2(7),new TreeNode2(2)),null),
            new TreeNode2(8,new TreeNode2(13),new TreeNode2(4,null,new TreeNode2(1))))
        //println(root)
        root.prettyPrint()
        println();
        val result=root.minDepth;
        Assert.assertEquals(3,result)
    }
}