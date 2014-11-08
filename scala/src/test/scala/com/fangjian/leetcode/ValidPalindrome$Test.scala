package com.fangjian.leetcode;

import org.scalatest._

class ValidPalindrome$Test extends FlatSpec with Matchers {

    it should "OK" in{
        ValidPalindrome.isValidPalindrome("HeH") should be (true)
    }
}
