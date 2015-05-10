package com.adt1.model

sealed trait ADT1
case class R(as: ADT1)
case object S extends ADT1
case class I(a: Int) extends ADT1
