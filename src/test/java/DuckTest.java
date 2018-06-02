import com.birds.Duck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DuckTest
{

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void sing()
	{
		Duck duck = new Duck();
		duck.swim();
		duck.sing();
	}
}