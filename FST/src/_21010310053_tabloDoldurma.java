
public class _21010310053_tabloDoldurma {

	public static String[][] tabloyaEkleme(String[] dizi1,String[] dizi2, int satir, int sutun){
		
		String[][] Tablo = new String[satir+1][sutun+1];
		
		 for (int i = 0; i < sutun+1; i++) { 
			   Tablo[0][i] = dizi1[i];
		}
		return tabloyaEkleme1(Tablo, dizi2, satir, sutun);
		
	}
	 
	
public static String[][] tabloyaEkleme1(String[][] tablo,String[] dizi2, int satir, int sutun) {
      
	 for (int i = 0; i < satir; i++) {
		   tablo[i+1][0] = dizi2[i];
	}
	return tablo;
	}


}
