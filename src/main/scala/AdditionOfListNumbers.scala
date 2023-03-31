package com.knoldus

object AdditionOfListNumbers extends App{
  def addListIntegers(list: List[Int]): Int = {
    if(list.length == 0) 0
    else if(list.length == 1) list.headOption.getOrElse(0)
    else list.headOption.getOrElse(0) + addListIntegers(list.tail)
  }
  println(addListIntegers(List(2,3,4,5,9)))
  println(addListIntegers(List(2)))
  println(addListIntegers(List()))
}
