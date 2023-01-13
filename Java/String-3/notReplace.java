// Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
//
//
// notReplace("is test") → "is not test"
// notReplace("is-is") → "is not-is not"
// notReplace("This is right") → "This is not right"


public String notReplace(String str) {
      if(str.equals("is"))
        return "is not";
      String res = "";
      for(int i=0; i<str.length(); i++){
        if(i == str.length()-1){
            res += str.substring(i,i+1);
        } else if(i==0 || i == str.length()-2){
          if((i==0 && str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i+2))) || (i==str.length()-2 && str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i-1)))){
            res += "is not";
            i++;
          } else {
            res += str.substring(i,i+1);
          }
        } else if(str.substring(i,i+2).equals("is")){
         if(!Character.isLetter(str.charAt(i-1)) && !Character.isLetter(str.charAt(i+2))){
            res += "is not";
            i++;
          } else {
          res += str.substring(i,i+1);
          }
        } else {
          res += str.substring(i,i+1);
        }
      }
      return res;
    }
