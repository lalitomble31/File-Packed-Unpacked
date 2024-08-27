package PackAndUnpacked;

import java.util.Scanner;

public class DriverClassFPU {

	public static void main(String[] args) {
		
	while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Lalit's Packer Unpacker CUI Module");
		System.out.println("1) Packing Activity.");
		System.out.println("2) Unpacking Activity.");
		System.out.println("3) Exit.");
		int choice=sc.nextInt();
		
		PackedFile p1=new PackedFile();
		UnpackFile u1=new UnpackFile();
		
		switch(choice){
		case 1:
			p1.Packed();
			break;
		
		case 2:
			u1.Unpacked();
			break;
			
		case 3:
			System.out.println("ThankYou....");
			return;
			
		default:
			System.out.println("Enter Valid Choice...");
		

	}

}
}
}
