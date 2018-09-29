object HelloWorld {
  def multiply(a: Integer) (b: Integer) = a * b;

  def divide(a: Integer) (b: Integer) = {
    if(b == 0)
    {print("Error: DIVIDE by 0!!!") }
    else {a/b;}
  }

  def main(args: Array[String]) = {
    print("Multiply: " + multiply(5)(10) + "\n")
    print("Multiply: " + multiply(5)(10) + "\n")
    print("Multiply: " + multiply(5)(10) + "\n")
    print("Multiply: " + multiply(5)(10) + "\n")
    print("\n\n\n")
    print("Divide by zero: " + divide(0)(0) + "\n")
    print("Divide : " + divide(30)(3) + "\n")
    print(divide(30)(3) + "\n")
    print(439%9)
  }
}
