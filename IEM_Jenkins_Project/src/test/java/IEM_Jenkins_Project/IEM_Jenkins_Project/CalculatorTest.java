package IEM_Jenkins_Project.IEM_Jenkins_Project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculatorTest {
	
	@Test
	void testAdditon() {
		Calculator cal = new Calculator();
		int result = cal.add(2, 3);
		assertEquals(5, result);
	}
}
