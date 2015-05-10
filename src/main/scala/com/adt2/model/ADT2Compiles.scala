package com.adt2.model

import shapeless.Generic
import shapeless.test.illTyped

object ADT2Compiles {
  val gen2 = Generic[ADT2]

  illTyped {
    "val gen1 = Generic[ADT1]"
  }
}
