// Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
//
//
// countYZ("fez day") → 2
// countYZ("day fez") → 2
// countYZ("day fyyyz") → 2


public int countYZ(String str) {
  int count = 0;
  for(int i=0; i<str.length()-1; i++){
    if(Character.isLetter(str.charAt(i)) && !(Character.isLetter(str.charAt(i+1)))){
      if(str.substring(i,i+1).toLowerCase().equals("y") || str.substring(i,i+1).toLowerCase().equals("z")){
      count += 1;
      }
    }
  }
   if(str.substring(str.length()-1,str.length()).toLowerCase().equals("y") || str.substring(str.length()-1,str.length()).toLowerCase().equals("z")){
      count += 1;
      }
  return count;
}
