
public class _21010310053_Okuma {
	
	public static String[] stateRead(String dosya) {	
		String[] first = dosya.split(" ");
		String p = "";
	
		for (int i = 0; i < first.length; i++) {
		p += first[i];
	     }
	    
	    String w = p.substring(3, p.length()-1);
		String[] states = w.split(",");		
		return states;	
	}
	public static String[] inputs(String dosya) {

		String[] first = dosya.split(" ");
		String p = "";
	
		for (int i = 0; i < first.length; i++) {
		p += first[i];
	     }
	    
	    String w = p.substring(3, p.length()-1);
		String[] input = w.split(",");
		
	return input;
		
	}
   public static String[] gecis(String dosya) {	
	String[] first = dosya.split("	");
	String p = "";

	for (int i = 0; i < first.length; i++) {
	p += first[i]+ " ";
     } 
    String w = p.substring(0, p.length());
	String[] input = w.split(" ");

	return input;
	
}
  public static String[] fonksiyon(String dosya) {	
	String[] first = dosya.split("");
	String p = "";

	for (int i = 0; i < first.length; i++) {
	p += first[i];
     }
    
    String w = p.substring(0, p.length());
    w = w.replace("(","");
    w = w.replace(")","");
    w = w.replace("\t"," ");
    w = w.replace(",","");   
    w = w.trim();
   
	String[] states = w.split(" ");	
	return states;
	
}
   public static String startState(String dosya) {	
	String a =dosya;
	a = a.replace(" ", "");
	String [] w = a.split("=");
	a = w[1];
	
	return a;
}
   public static String[] girdiArrayDoldurma(String dosya) {
	String girdi = dosya;
	girdi = girdi.replace("", " ");
    girdi =girdi.trim();
    String[] girdiArray = girdi.split(" ");
    return  girdiArray;
}
 
}
