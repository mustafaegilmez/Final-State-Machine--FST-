
public class _21010310053_yazdirma {

public static void deneme(int inputSayisi,int satirSayisi,int sutunSayisi,String statesTable[][],String ciktiTable[][],String tumStatesArray[],String girdiArray[],String ciktiArray[]) {
        int satirIndex = -1;
		int sutunIndex = -1;
        int sayac = 0;
        int satir = 1;
        int sayi = 0;
        int girilenDegerKadar = inputSayisi;
           
		while (0 < girilenDegerKadar) {
			for (int i = 1; i <= satirSayisi; i++) {  
				
				 if(statesTable[i][0].equals(tumStatesArray[sayi])) {
					 satirIndex = i;
					 break;
				 }
			}
			for (int j = 1; j <= sutunSayisi; j++) {
				
				if(statesTable[0][j].equals(girdiArray[sayac])) {
					 sutunIndex = j;
					 break;
				 }
			}			
			tumStatesArray[satir] = statesTable[satirIndex][sutunIndex];
			ciktiArray[sayi] = ciktiTable[satirIndex][sutunIndex];
			satir++;
			sayi++;
			sayac++;
			girilenDegerKadar--;
			satirIndex = -1;
			sutunIndex = -1;			
		}  
		
		System.out.print("Durumların sırası: ");
		for (int i = 0; i < tumStatesArray.length; i++) {
			System.out.print(tumStatesArray[i]);
			if(i < tumStatesArray.length-1) {
				System.out.print(",");
				
			}			
		}
		System.out.println();
		System.out.print("Çıktı: ");
		for (int i = 0; i < ciktiArray.length; i++) {
			System.out.print(ciktiArray[i]);
		}		
	}
}
