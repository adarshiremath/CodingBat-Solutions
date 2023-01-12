// A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
//
//
// getSandwich("breadjambread") → "jam"
// getSandwich("xxbreadjambreadyy") → "jam"
// getSandwich("xxbreadyy") → ""


public String getSandwich(String str) {
  int[] arr = new int[str.length()/5];
  int j = 0;
  for(int i=0; i<str.length()-4; i++){
    if(str.substring(i,i+5).equals("bread")){
        arr[j] = i;
        j++;
      }
    }
  if(j <= 1){
    return "";
  }

  String sand = str.substring(arr[0]+5, arr[j-1]);
  return sand;
}
