// Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
//
//
// wordEnds("abcXY123XYijk", "XY") → "c13i"
// wordEnds("XY123XY", "XY") → "13"
// wordEnds("XY1XY", "XY") → "11"


public String wordEnds(String str, String word) {
  if(str.equals(word)){
    return "";
  }
  int len = word.length();
  int[] arr = new int[str.length()];
  int j=0;
  String res ="";
  for(int i=0; i<=str.length()-len; i++){
    if(str.substring(i,i+len).equals(word)){
      arr[j] = i;
      j++;
    }
  }
  for(int i=0; i<j ;i++){
    if(arr[i] == 0){
      res += str.substring(len,len+1);
    }
    else if(arr[i] == str.length()-len){
      res += str.substring(str.length()-len-1,str.length()-len);
    }
    else{
      res += str.substring(arr[i]-1,arr[i]) + str.substring(arr[i]+len,arr[i]+len+1);
    }
  }
  return res;
}
