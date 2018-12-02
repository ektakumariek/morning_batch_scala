
val n1= 1 to 20 toArray
val n2= 1 to 20 toArray

def mul(n1:Array[Int], n2:Array[Int]) = for
  ( x<- n1; y<- n2)
  println(s"$x * $y = ${x*y}")


mul(n1,n2)

//Anonymous Function -Diff between normal and Anonymous function

def anyony(age:Int)=age match{
  case age if (age>18) => "major"
  case _=> "minor"
}

anyony(10)


val  anyony1=(age:Int)=> age match{
  case age if (age>18) => "major"
  case _=> "minor"
}

anyony1(10)

//reciursive function

def factorial(num:Int):Int=num match{
  case num if (num <= 1) =>1
  case _=> num * factorial(num - 1)
}

factorial(5)

//Power

def power(x:Int,y:Int):Long= y match
{
  case y if(y<=1)=>1
  case _=> x * power(x,y-1)
}

power(2,2)

val data = "hello mr venu how are you"
val rev1=data.reverse

val rev2=rev1.length

val abc=for(i <- data.reverse ) println(s"$i")

def reverse(data: String) =
  for(i <- data.reverse ) println(s"$i")

reverse(rev1)


//olleh rm unev woh era uoy

def cube(x: Int): Int = x * x * x

def reverseWordsOrder(phrase: String) =
// -1 is to keep whitespaces
  (data.reverse.split(" ").map(_.reverse)).mkString(" ")

reverseWordsOrder(data)

val gg=for(x<- data.split(" "))

  yield x.reverse




val gg1=(for(x<- data.split(" "))

  yield x.reverse).mkString(" ")



def gg3(data:String)=(for(x<- data.split(" "))

  yield x.reverse).mkString(" ")

gg3(data)

//olleh rm unev woh era uoy


val gg2=(for(x<- data.reverse.split(" "))

  yield x.reverse).mkString(" ")

//you are how venu mr hello



def squareRootOfPerfectSquare(a: Int): Option[Int] = {
  int sqrt = (int) Math.round(math.sqrt(a));
  if (sqrt * sqrt == a)
    Some(sqrt)
  else
    None
}





