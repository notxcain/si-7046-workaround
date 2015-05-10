package com.adt1

import com.adt1.model.ADT1
import com.adt2.model.ADT2
import shapeless.Generic
import shapeless.test.illTyped

object BothFail {
  illTyped {
    "val gen1 = Generic[ADT1]"
  }
  illTyped {
    "val gen2 = Generic[ADT2]"
  }
}
