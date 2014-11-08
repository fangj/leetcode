// Source : https://oj.leetcode.com/problems/valid-palindrome/
/**********************************************************************************
  *
  * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
  *
  * For example,
  * "A man, a plan, a canal: Panama" is a palindrome.
  * "race a car" is not a palindrome.
  *
  * Note:
  * Have you consider that the string might be empty? This is a good question to ask during an interview.
  *
  * For the purpose of this problem, we define empty string as valid palindrome.
  *
  *
  **********************************************************************************/
package com.fangjian.leetcode

/**
 * Created by fangjian on 14-11-8.
 */
object ValidPalindrome extends App{

  def isValidPalindrome(str:String):Boolean ={
    val list=str.toList
    val filterList=list.filter(_.isLetterOrDigit).map(_.toUpper);
    this.isValidPalindrome(filterList)
  }
  def isValidPalindrome(chars: List[Char]): Boolean ={
    chars.length match {
      case 0 => { println("0");  true}
      case 1 => { println("1");  true}
      case _=> {println(chars);  chars.head==chars.last && this.isValidPalindrome(chars.init.tail)}
    }
  }
}

//TEST

import org.junit._
import Assert._

@Test
class ValidPalindromeTest {
  @Test
  def test1() = assertTrue("\"A man, a plan, a canal: Panama\" is a palindrome.",ValidPalindrome.isValidPalindrome("A man, a plan, a canal: Panama"))
  @Test
  def test2() = assertFalse("\"race a car\" is not a palindrome.",ValidPalindrome.isValidPalindrome("race a car"))
}
