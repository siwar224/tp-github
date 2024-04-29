import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest {

	@Test
	public void testAdditionWithDecimals() {
	    // Set up the calculator
	    Calculatrice calculatrice = new Calculatrice();

	    // Enter the first operand (decimal)
	    calculatrice.ecran.setText("2.5");
	    calculatrice.tab_button[13].doClick(); // Plus button

	    // Enter the second operand (decimal)
	    calculatrice.ecran.setText("3.7");
	    calculatrice.tab_button[11].doClick(); // Equals button

	    // Verify the result
	    assertEquals(6.2, Double.parseDouble(calculatrice.ecran.getText()), 0.001);
	}
	
	@Test
	public void testSubtraction() {
	    Calculatrice calculatrice = new Calculatrice();

	  // Set up the calculator
	  calculatrice = new Calculatrice();

	  // Enter the first operand
	  calculatrice.ecran.setText("10");
	  calculatrice.tab_button[14].doClick(); // Minus button

	  // Enter the second operand
	  calculatrice.ecran.setText("5");
	  calculatrice.tab_button[11].doClick(); // Equals button

	  // Verify the result
	  assertEquals(5.0, Double.parseDouble(calculatrice.ecran.getText()), 0.001);
	}


}
