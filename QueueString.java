
	import java.util.ArrayList;

	public class QueueString {
		ArrayList<String> kelase = new ArrayList<String>();
		int black = -1;

		public void insert(String value) {
			black++;
			kelase.add(black,value);
		}
		public String get() {
			String value = "KOSONG";
			if(black>-1) {
				value = kelase.get(0);
				kelase.remove(0);
				black--;
			}
			return value;
			
		}
		public void cetak() {
			System.out.println("ECOR : "+black+" > KELAS A: "+kelase.toString());
		}
	}

