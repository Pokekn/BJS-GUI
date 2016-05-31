
public class CsvStrToArray {

  private static final String TRENNER = ","; 

  public static String[] ToAarray(String s, String b) {
      //String s = "14,abc,+68,1024,-109,  ,17";
	  String sb = s + b;
      String[] sa = sb.split(TRENNER);
      
      String[] a = new String[sa.length]; 
      
      for (int i = 0; i < sa.length; i++) {
        
          sa[i] = sa[i].trim(); 
          
          
      }  
      
      return a;
  } 
}
