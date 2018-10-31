import java.util.ArrayList;

public class Array_object {

	public static void main(String[] args) {
		  ArrayList<Mahasiswa> list = new ArrayList<Mahasiswa>();
		   list.add(new Mahasiswa("Darmawan", "D0217504", "Informatika A 2017","Lembang"));
		   list.add(new Mahasiswa("M.Farhan", "D0217369", "Informatika A 2017","Lembang"));
		   list.add(new Mahasiswa("Sudarmin", "D0217302", "Informatika A 2017","Wajo"));
		 
		   for(int i = 0; i < list.size(); i++){
			    System.out.println("Nama :"+ list.get(i).getNama() + "	 || Alamat :" + 
			    list.get(i).getNim() +" 	|| Nim :" + list.get(i).getKelas() + " 	||Kelas :"+ list.get(i).getAlamat());
			    
			   }
			   
	}

}
