import java.util.ArrayList;

public class arraylist_String {

	public static void main(String[] args) {
		ArrayList<String> ListNaruto = new 	ArrayList<String>();
		ListNaruto.add("Sasuke");
		ListNaruto.add("Sakura");
		ListNaruto.add("Kakashi");
		ListNaruto.add("Hinata");
		ListNaruto.add(4, "Kurama");
		System.out.println(ListNaruto.size());
		ArrayList<String> ListNaruto2 = (ArrayList<String>) ListNaruto;
		System.out.println( ListNaruto2.clone());
		
		System.out.println(ListNaruto.toString());
	}

}
