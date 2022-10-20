package myjavaprograms;
import java.util.Scanner ;

public class notOrtalamasýHesaplayanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deðiþkenleri oluþtur
		int mat, psy, chem, turk, hist, mus ;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Matematik notunuz: ");
		mat = inp.nextInt();
		
		System.out.print("Fizik notunuz: ");
		psy = inp.nextInt();
		
		System.out.print("Kimya notunuz: ");
		chem = inp.nextInt();
		
		System.out.print("Türçe notunuz: ");
		turk = inp.nextInt();
		
		System.out.print("Tarih notunuz: ");
		hist = inp.nextInt();
		
		System.out.print("Müzik notunuz: ");
		mus = inp.nextInt();
		
		int toplam =(mat+psy+chem+turk+hist+mus);
		
		double average= toplam/6;
		System.out.println("Not ortalamanýz: "+ average);

		
		
		
	
	}

}
