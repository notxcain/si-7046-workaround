package com.adt2.model.usage

import com.adt2.model.ADT2
import shapeless.Generic
import shapeless.test.illTyped


object ADT2Compiles {
  val gen1 = Generic[ADT2]
  illTyped {
    "val gen2 = Generic[ADT1]"
  }
}
