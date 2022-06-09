package Array_String_probelms;

public class ArrayStringProblems {
  public static boolean isUnique(String str){
      if(str.length() == 0){
        return true;
      }
      //this is going to allow us to treat uppercase and lowercase letters the same
      str = str.toLowerCase();
      for(int i = 0; i < str.length() - 1; i++){
          for(int j = i+1; j < str.length();j++){
              if(str.charAt(i) == str.charAt(j)){
                  return false;
              }
          }
      }
      return true;
  }

  public static void main(String[] args) {
    //test cases for isUniquw
     System.out.println(isUnique("Hello")); //return false
     System.out.println(isUnique("car")); //return true
     System.out.println(isUnique("carr")); //return false
     System.out.println(isUnique("CcAr")); //return false
     System.out.println(isUnique("")); //return true
  }
}
