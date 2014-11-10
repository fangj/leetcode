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

}

//TEST
import org.junit._
@Test
class MinimumDepthOfBinaryTreeTest{

    @Test
    def test()={

    }
}