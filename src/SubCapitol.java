import java.io.IOException;
 import java.util.ArrayList;
 
 public class SubCapitol {
 	String numeSubcap;
 	ArrayList<Element> elemente = new ArrayList<Element>();
 	
 	public SubCapitol(){}
 	public SubCapitol(String tip)
 	{
 		this.numeSubcap=tip;
 	}
 	
 	 public String toString() {
 	       return numeSubcap;
 	   }
 	 
 	 void print(){
 		 
 		 for(int i=0;i<elemente.size();i)
 		 {
 			 System.out.println(numeSubcap  " "  elemente.get(i));
 		 }
 	 }
 	 
 	 public void addElement(Element e)
 	 {
 		 elemente.add(e);
 	 }
 	 
 	 public String getNume()
 	 {
 		 return numeSubcap;
 	 }
 	 
 	 public static void main(String [] args) throws IOException{
 		 
 		 
 		 SubCapitol subcap = new SubCapitol("Subcapitol");
 		 
 		 Imagine imag = new Imagine(subcap.getNume(),"Imagine","made by seby");
 		 Tabel tabel = new Tabel(subcap.getNume(),"Tabel","seba");
 		 
 		 subcap.addElement(imag);
 		 subcap.addElement(tabel);
 		 
 		 subcap.print();
 		 
 		// System.out.println(subcap);
 	 }
 	
 } 