package com

import shapeless.test.illTyped

object BothFail {
  illTyped {
    "val gen1 = Generic[ADT1]"
  }
  illTyped {
    "val gen2 = Generic[ADT2]"
  }
 }
