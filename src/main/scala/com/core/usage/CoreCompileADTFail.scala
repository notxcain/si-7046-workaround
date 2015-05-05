package com.core.usage

import com.core.model.Core
import shapeless.Generic
import shapeless.test.illTyped

object CoreCompileADTFail {
  val gen2 = Generic[Core]

  illTyped {
    "val gen1 = Generic[ADT1]"
  }
}