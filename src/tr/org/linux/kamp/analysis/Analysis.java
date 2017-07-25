package tr.org.linux.kamp.analysis;

import java.util.Scanner;	//Scanner import ettik.
public class Analysis {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);	//input isimli klavyeden giriş değeri aldık.	
		int passes =0;
		int failures= 0;
		int studentCounter=1;
		
		while (studentCounter<=10) {
			System.out.println("Sonucu giriniz, 1 geçti 2 kaldı");
			int result=input.nextInt();		//
			if (result==1) {
				passes ++;
				studentCounter++;
			}
			else if (result==2) {
				failures ++;
				studentCounter++;
			}
			else System.out.println("Lütfen 1 ya da 2 olarak giriniz.");
		}
		System.out.println("Geçenler:"+passes);
		System.out.println("Geçenler:"+failures);
	}
}
