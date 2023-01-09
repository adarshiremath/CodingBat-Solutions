// Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)
//
//
// fizzString("fig") → "Fizz"
// fizzString("dib") → "Buzz"
// fizzString("fib") → "FizzBuzz"


public String fizzString(String str) {
  String s = "";
  if(str.startsWith("f")){
    s += "Fizz";
  }
  if(str.endsWith("b")){
    s+= "Buzz";
    return s;
  }
  return s.length() > 0 ? s : str;
}
