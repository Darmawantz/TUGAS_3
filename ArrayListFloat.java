import java.util.ArrayList;

public class ArrayList_Float {

	public static void main(String[] args) {
		ArrayList<Float> Nomor = new 	ArrayList<>();
		Nomor.add((float) 25.7);
		Nomor.add((float) 8.9);
		Nomor.add((float) 6.3);
		Nomor.add((float) 5.5);
		Nomor.add(3, (float) (15.4));
		System.out.println(Nomor.size());
		ArrayList<Float> Nomor2 = (ArrayList<Float>) Nomor;
		System.out.println( Nomor2.clone());
		
		System.out.println(Nomor.toString());
	}

	

}
