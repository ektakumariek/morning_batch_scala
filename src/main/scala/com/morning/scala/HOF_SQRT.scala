package com.morning.scala

object HOF_SQRT {

 // def sqrt1(x:Int,f: (Int)=>Int):Int=f(x)

  def main(args: Array[String]): Unit = {

    def f1(x:Int) = {
      println(s"SQRT of $x is " + Math.sqrt(x))
      (y:Int) => Math.sqrt(x+y)

        f1(9)
    }
  }

}
