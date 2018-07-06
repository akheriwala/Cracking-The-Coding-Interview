package aKheriwala;
import java.util.*;

public class CountPrime {
	
	public static void main(String[] args) {
	
	Hashtable h = new Hashtable();
	Hashtable h1 = new Hashtable();
	
	h.put(1,"Testing ");
	h.put(2,"the ");
	h.put(3," hash table ");
	
	System.out.println("Original hash table values are " +h);
	
	h1 = (Hashtable) h.clone();
	
	System.out.println("Clone hash table values are " +h1);
	h.clear();
	System.out.println("Original hash table values after clearing are " +h);
	System.out.println("Clone hash table values are " +h1);
	
	}
}


