package com.adt2

import com.adt1.model.ADT1
import shapeless.Generic
import shapeless.test.illTyped

object BothFail {
  val gen1 = Generic[ADT1]
//  illTyped {
//   "val gen1 = Generic[ADT1]"
//  }
  illTyped {
    "val gen2 = Generic[ADT2]"
  }
}
