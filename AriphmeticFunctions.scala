object HelloWorld {
  def multiply(a: Integer) (b: Integer) = a * b;

  def divide(a: Integer) (b: Integer)  = {
    if(b == 0)
    {print("Error: DIVIDE by 0!!!\n") }
    else {a/b}
  }

  def summury(a:Integer) (b:Integer) = a + b

  def summaryFor(a:Array[Integer])( b:Array[Integer]) = (a,b).zipped.map(_ + _).sum

  

  def main(args: Array[String]) = {
    print("Multiply: " + multiply(5)(10) + "\n")
    print("Multiply: " + multiply(5)(10) + "\n")
    print("Multiply: " + multiply(5)(10) + "\n")
    print("Multiply: " + multiply(5)(10) + "\n")
    print("\n\n\n")
    print("Divide by zero: " + divide(0)(0) + "\n")
    print("Divide : " + divide(30)(3) + "\n")
    print(divide(30)(3) + "\n")
    print(439%9 + "\n")
    print(summury(4)(5) + "\n")
    val list= summaryFor(Array(1, 2, 3))(Array(9, 1))
    println(list +  "\n")
    println(0)
    print(0)
  }
}
