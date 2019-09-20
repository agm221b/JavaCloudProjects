
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.junit5demo.service.CalcService;
import com.cg.junit5demo.service.CalcServiceImpl;


class CalcTest {

	CalcService cs ;
	
	@BeforeEach
	public void beforeTests() {
		cs = new CalcServiceImpl();
		System.out.println(cs);
	}
	
	
	@Test
	public void myTest() {
		assertEquals(new Double(30.0), cs.addNum(10.0, 20.0));
		assertEquals(new Double(20.0), cs.subNum(40.0, 20.0));
		assertEquals(new Double(8.0), cs.mulNum(4.0, 2.0));
		assertEquals(new Double(2.0), cs.divNum(40.0, 20.0));
	}
	
	@Test
	public void myTestException() {
		assertThrows(ArithmeticException.class, () -> cs.divNum(5.0, 0.0), "Div by zero should throw exception");
	}
	
	@AfterEach
	public void afterTest() {
		cs=null;
	}

}
