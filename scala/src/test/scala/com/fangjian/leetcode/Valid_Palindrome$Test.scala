package com.fangjian.leetcode;

import org.scalatest._

class Valid_Palindrome$Test extends FlatSpec with Matchers {

    it should "OK" in{
        Valid_Palindrome.isValidPalindrome("HeH") should be (true)
    }
}
