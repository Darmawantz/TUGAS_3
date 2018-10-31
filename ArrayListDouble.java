import java.util.ArrayList;

public class ArrayList_Double {

	public static void main(String[] args) {
		ArrayList<Double> Nomor = new 	ArrayList<>();
		Nomor.add((Double) 6.7);
		Nomor.add((Double) 14.9);
		Nomor.add((Double) 2.3);
		Nomor.add((Double) 5.9);
		Nomor.add(1, (Double) (1.4));
		System.out.println(Nomor.size());
		ArrayList<Double> Nomor2 = (ArrayList<Double>) Nomor;
		System.out.println( Nomor2.clone());
		
		System.out.println(Nomor.toString());

	}

}
