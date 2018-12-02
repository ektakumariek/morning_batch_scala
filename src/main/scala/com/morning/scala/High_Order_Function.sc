val num=1 to 30 toArray

num.length

val names=Array("ekta","NNishu","piyish","tutu","taxon","ekta","tutu")

val dta="kkkk mmmmmm hhhh"

names.map(x=>x.concat("venu"))

val pp=names.map(x=>x.charAt(0)).mkString

val dp=names.map(x=>x).mkString.split("")


val dp1=names.map(x=>x.compareToIgnoreCase("nishu"))

//filter


val dp5=names.filter(x=>x.contains("n"))

//Flatmap

val nn=names.flatMap(x=>x.split(" "))

  //flatmap(x=>x.split(""))


val nn1=names.map(x=>x.toLowerCase).distinct

//group by


val grp=names.groupBy(x=>x.contains("ekta")).mkString

println(grp)





def f1(x:Int)= {
  println(s"SQRT of $x is " + Math.sqrt(x))}


def sqrt1(f1:Int => Unit,a: Int) = {
  f1(a)
}

sqrt1(f1,9)


