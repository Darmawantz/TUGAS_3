import java.util.ArrayList;

public class QueueDouble {
	ArrayList<Double> kelase = new ArrayList<Double>();
	int alief = -1;

	public void insert(Double value) {
		alief++;
		kelase.add(alief,value);
	}
	public Double get() {
		Double value = 0.1;
		if(alief>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			alief--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("Record : "+alief+" > VARIABLE: "+kelase.toString());
}
}