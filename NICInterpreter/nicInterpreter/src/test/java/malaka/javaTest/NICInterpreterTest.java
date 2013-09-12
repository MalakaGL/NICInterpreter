package malaka.javaTest;

import malaka.cse.maven.NICInterpreter;
import malaka.cse.maven.NICProp;
import malaka.cse.maven.exception.InvalidNICException;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class NICInterpreterTest {

	NICInterpreter nicInterpreter;
		
	@BeforeClass
	public void setUp() {
		nicInterpreter = new NICInterpreter();
	}
	
	@Test
	public void createTest1() throws InvalidNICException {
		NICProp nicProp = NICInterpreter.createNICProp("911070588V");
	    assertEquals(nicProp.getDate(), "1991-4-16");
            assertEquals(nicProp.getGender(), "Male");
            assertEquals(nicProp.isVoter(), "Yes");
	}
	
	@Test(expectedExceptions = InvalidNICException.class)
	public void createNICTest2() throws InvalidNICException {
		NICProp nicProp = NICInterpreter.createNICProp("911093V");
                assertEquals(nicProp.getDate(), "1991-4-16");
                assertEquals(nicProp.getGender(), "Male");
                assertEquals(nicProp.isVoter(), "Yes");
	}
	
}
