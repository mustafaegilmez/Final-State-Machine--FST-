import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;

public class _21010310053_Main {
	

public static void main(String[] args) throws FileNotFoundException {
		
		Scanner dosyaInput = new Scanner(new File("FST.txt"));	   	
		String dosya  = dosyaInput.nextLine(); 
		String dosya0 = dosyaInput.nextLine(); 
		String dosya1 = dosyaInput.nextLine(); 
		String dosya2 = dosyaInput.nextLine(); 

		if(!dosya.isEmpty()) {
			System.out.println("FST.txt dosyası okundu.");
		}
		else {
			System.out.println("Dosya hatalı-Bulanamadı");
		}
		 String[] states  = _21010310053_Okuma.stateRead(dosya);        
	     String[] girdiler = _21010310053_Okuma.inputs(dosya0); 
	     String[] gecis = _21010310053_Okuma.gecis(dosya2);
	    int stateSayisi = states.length; 
	    int satirSayisi = states.length; 
	    int sutunSayisi = girdiler.length; 
	    String[][] statesTable = _21010310053_tabloDoldurma.tabloyaEkleme(gecis, states, satirSayisi, sutunSayisi);
	    String[][] ciktiTable = _21010310053_tabloDoldurma.tabloyaEkleme(gecis, states, satirSayisi, sutunSayisi);
	    int index = 1;
	    int sutun = 1;
	    int index1 = 2;
	    while(0 < stateSayisi) {
	    	
	    	dosya2 = dosyaInput.nextLine();	  
	    	String[] array = _21010310053_Okuma.fonksiyon(dosya2);
	    	for (int i = 1; i <=sutunSayisi ; i++) {
				statesTable[sutun][i] = array[index];		
				ciktiTable[sutun][i] = array[index1];
				index = index+2;
				index1 = index1+2;
				}
	    	stateSayisi--;
	    	index = 1;
	    	index1 = 2;
	    	sutun ++;
	    }
        
	    Scanner input = new Scanner(System.in);
	    System.out.println("input giriniz:");
	    String girdi = input.nextLine();    
	    String[] girdiArray = _21010310053_Okuma.girdiArrayDoldurma(girdi);
	        
	    int inputSayisi = girdiArray.length;
	    dosya2 = dosyaInput.nextLine();
        String baslangicState = _21010310053_Okuma.startState(dosya2 );
        
        String[] tumStatesArray = new String[inputSayisi+1];     
		tumStatesArray[0] = baslangicState;
		String[] ciktiArray = new String[inputSayisi];
	
		_21010310053_yazdirma.deneme(inputSayisi, satirSayisi, sutunSayisi, statesTable, ciktiTable, tumStatesArray, girdiArray, ciktiArray);
		System.out.println();
		
		Scanner input1 = new Scanner(System.in);
	    System.out.println("input giriniz: ");
	    String girdi1 = input1.nextLine();    
	    String[] girdiArray1 = _21010310053_Okuma.girdiArrayDoldurma(girdi1);
	        
	    int inputSayisi1 = girdiArray1.length;	   
        String baslangicState1 = _21010310053_Okuma.startState(dosya2 );
        
        String[] tumStatesArray1 = new String[inputSayisi1+1];     
		tumStatesArray1[0] = baslangicState1;
		String[] ciktiArray1 = new String[inputSayisi1];
	    
		_21010310053_yazdirma.deneme(inputSayisi1, satirSayisi, sutunSayisi, statesTable, ciktiTable, tumStatesArray1, girdiArray1, ciktiArray1);
 }
}

























