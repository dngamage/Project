import com.butterfly.Butterfly;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ButterflyTest
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
	public void test()
	{
		Butterfly butterfly = new Butterfly();
		butterfly.sing();
		butterfly.fly();
	}
}