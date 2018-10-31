public class StackString
{
private int maxsize; //penentu batas elemen stack maksimum
private String [] stackarray; //array untuk menyimpan stack
private int top; //indeks array
public void inisiasi(int s) //menentukan ukuran kapasitas stack
{
maxsize = s;
stackarray = new String [maxsize];
top = -1;
}
public void push(String data)
{
if (top>=maxsize-1)
System.out.println("Stack Penuh. "+data+" Tidak Bisa Masuk");
else 
{
top++;
stackarray[top] = data;
System.out.println(data +" Masuk ke Stack");
}
}
public String pop()
{
String temp = null;
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

}
return temp;
}
public void view()
{
System.out.print("Isi Stack: ");
for(int i=0; i<=top; i++)
System.out.print(stackarray[i] + " ");
System.out.println();
}
}
