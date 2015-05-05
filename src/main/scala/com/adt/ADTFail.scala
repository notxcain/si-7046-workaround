package com.adt

import shapeless.test.illTyped

object ADTFail {
  illTyped {
    "val gen1 = Generic[ADT1]"
  }
}
