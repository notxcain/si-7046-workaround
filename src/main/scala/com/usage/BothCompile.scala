package com.usage

import com.core.model.Core
import com.adt.model.ADT1
import shapeless.Generic

object BothCompile {
  val gen1 = Generic[ADT1]
  val gen2 = Generic[Core]
}
