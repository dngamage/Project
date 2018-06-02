import com.birds.Rooster;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RoosterTest
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
		Rooster rooster = new Rooster();
		rooster.sing();
	}
}