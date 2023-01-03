/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.


hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
 */

public boolean check(int num){
  if(num > 12 && num < 20){
    return true;
  }
  return false;
}
public boolean hasTeen(int a, int b, int c) {
  if(check(a) || check(b) || check(c)){
    return true; 
  }
  return false;
}
