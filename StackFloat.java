
public class StackFloat {
	private int maxsize; //penentu batas elemen stack maksimum
	private float[] stackarray; //array untuk menyimpan stack
	private int top; //indeks array
	public void inisiasi(int s) //menentukan ukuran kapasitas stack
	{
	maxsize = s;
	stackarray = new float [maxsize];
	top = -1;
	}
	public void push(double d)
	{
	if (top>=maxsize-1)
	System.out.println("Stack Penuh. "+d+" Tidak Bisa Masuk");
	else 
	{
	top++;
	stackarray[top] = (float) d;
	System.out.println(d +" Masuk ke Stack");
	}
	}
	public float pop()
	{
	float temp;
	if (top>=0)
	{
	temp = stackarray[top];
	System.out.println(temp + " Keluar dari Stack");
	top--;
	return (temp);
	}
	else 
	{
	System.out.println("Stack Sudah Kosong");
	return(-1);
	}
	}
	public void view()
	{
	System.out.print("Isi Stack: ");
	for(int i=0; i<=top; i++)
	System.out.print(stackarray[i] + " ");
	System.out.println();
}
}
