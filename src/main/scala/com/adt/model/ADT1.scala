package com.adt.model

sealed trait ADT1
case class Rec(as: List[ADT1])
case object Singleton extends ADT1
case class Intie(a: Int) extends ADT1
