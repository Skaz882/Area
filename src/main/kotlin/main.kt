fun areaCircle(): String {
    return ("pi*radius2")
}

fun areaSquare(): String {
    return ("a2")
}

fun areaRectangle(): String {
    return ("l*w")
}

fun areaParallelogram(): String {
    return ("b*h")
}

fun main(){
    print("enter the shape you want the area of: ")
  val a = areaCircle()
  val b = areaSquare()
  val c = areaRectangle()
  val d = areaParallelogram()
    println(a)
    println(b)
    println(c)
    println(d)
}

