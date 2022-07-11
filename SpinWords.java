package separa_strings;


public class SpinWords {

    public static String spinWords(String sentence) {
      String[] cadenaSplit= sentence.split(" ");
      String palabra= "";
      String cadenaNueva= "";
      int l; 

      for (String s :cadenaSplit) {
        palabra= "";
        if (s.length() >= 5) {
          for (int i= s.length()-1; i >= 0; i--) {
            palabra+= s.charAt(i); 
          }
        }
        else { 
            palabra= s;
        }
          
        cadenaNueva+= palabra + " ";
      }
            
      l= cadenaNueva.length();
      cadenaNueva= cadenaNueva.substring(0, (l-1));
      return cadenaNueva;
    }
  
    public static void main (String[] args) {

      System.out.println(spinWords("Hey wollef sroirraw"));
    }
  
  
  
  }