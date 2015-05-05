package com.core.model

import com.adt.model.ADT1

sealed trait Core
case class Container(a: ADT1) extends Core
