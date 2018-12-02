val num=10
val res=num match {
  case x if (x==10) => "you are kid"
  case x if(x>10) => "you are youth"
  case _ => "chk ur input"


}

//val day="tue"
//Function

def res2(day:String)= day match {

  case day if (day == "monday") => "pls work"
  case "tue" | "tuesday" => "no office"
  case _ => "go home"
}

//match

res2("tue")


def res1(num:Int) =num match{
  case num if(num>10 && num>90) =>"cool"
  case _=>"best"
}

res1(90)

val price=100
def agecity(age:Int,gender:Char)=(age,gender) match{
  case (x,y) if(x>10 && y=='f')=> s"${price*0.6} off dress"
  case _=>"no"
}

agecity(11,'f')

val n=Array(1,2,4,88,99,100)

val res3= for(x<- n) yield x*x

val res6= for(x<- n) yield x match {
  case a if(a>5) => "small number"
  case _=>"aaaa"
}




//val mul1 =for(x<-n1;y<-n2) println(s"$x * $y=${x*y}")

//imp for loop execution

def mul(n1:Array[Int], n2:Array[Int]) = for
( x<- n1; y<- n2)
 println(s"$x * $y = ${x*y}")


val n1= 1 to 20 toArray
val n2= 1 to 20 toArray

mul(n1,n2)














