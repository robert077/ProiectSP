import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Capitol {
	String numeCapitol;
	ArrayList<SubCapitol> subCap;
	
	public Capitol(){}
	public Capitol(String nume,ArrayList<SubCapitol> listaSubcap)
	{
		this.numeCapitol=nume;
		this.subCap=listaSubcap;
	}
	
	 public String toString() {
	       return numeCapitol+" --> SubCapitole:"+subCap+"\n";
	   }
	 
	 public static void main(String [] argc)
	 {
		 
		 
		 ArrayList<SubCapitol> listaSubcap = new ArrayList<SubCapitol>();
		 
		 listaSubcap.add(new SubCapitol("Imag"));
		 listaSubcap.add(new SubCapitol("Paragraf"));
		 listaSubcap.add(new SubCapitol("Paragraf"));
		 
		 
		 Capitol cap=new Capitol("Cap1",listaSubcap);
		 
		 System.out.print(cap);
		 


	 }
}