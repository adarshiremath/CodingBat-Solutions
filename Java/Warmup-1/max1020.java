/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */

public int max1020(int a, int b) {
    boolean aval = (a >9 && a < 21);
    boolean bval = (b >9 && b < 21);
    if( aval && bval){
      return a > b ? a : b;
    }
    else if(aval && !bval){
      return a;
    }
    else if(!aval && bval){
      return b;
    }
    return 0;

}
