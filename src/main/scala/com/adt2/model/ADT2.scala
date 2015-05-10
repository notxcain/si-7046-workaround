package com.adt2.model

sealed trait ADT2
case class R(as: ADT2)
case object S extends ADT2
case class I(a: Int) extends ADT2
