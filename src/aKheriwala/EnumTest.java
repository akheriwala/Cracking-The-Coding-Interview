package aKheriwala;
import java.lang.Enum;

enum Color {
	RED, GREEN, BLUE;
}

//Enum methods - values(), ordinal(), valueOf()

public class EnumTest {

	public static void main(String[] args) {
		// Call values
		Color arr[] = Color.values();
		
		//Print each value
		for (Color col: arr) {
			System.out.println(col + " at index " + col.ordinal());
		}
		
		System.out.println(Color.valueOf("RED"));

	}

}
