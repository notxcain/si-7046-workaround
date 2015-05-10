package com.adt1.model

import shapeless.Generic
import shapeless.test.illTyped

object ADT1Compiles {
  val gen1 = Generic[ADT1]
  illTyped {
    "val gen2 = Generic[ADT2]"
  }
}
