package myjavaprograms;
import java.util.Scanner ;

public class notOrtalamas�HesaplayanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//De�i�kenleri olu�tur
		int mat, psy, chem, turk, hist, mus ;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Matematik notunuz: ");
		mat = inp.nextInt();
		
		System.out.print("Fizik notunuz: ");
		psy = inp.nextInt();
		
		System.out.print("Kimya notunuz: ");
		chem = inp.nextInt();
		
		System.out.print("T�r�e notunuz: ");
		turk = inp.nextInt();
		
		System.out.print("Tarih notunuz: ");
		hist = inp.nextInt();
		
		System.out.print("M�zik notunuz: ");
		mus = inp.nextInt();
		
		int toplam =(mat+psy+chem+turk+hist+mus);
		
		double average= toplam/6;
		System.out.println("Not ortalaman�z: "+ average);

		
		
		
	
	}

}
