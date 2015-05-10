package com.adt1.model.usage

import com.adt1.model.ADT1
import com.adt2.model.ADT2
import shapeless.Generic
import shapeless.test.illTyped

object ADT1Compiles {
  val gen1 = Generic[ADT1]
  illTyped {
    "val gen2 = Generic[ADT2]"
  }
}
