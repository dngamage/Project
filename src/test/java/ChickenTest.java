import com.birds.Chicken;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest
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
		Chicken chicken = new Chicken();
		chicken.fly();
		chicken.sing();
	}
}