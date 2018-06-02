import com.fish.Shark;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SharkTest
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
		Shark shark = new Shark();
		shark.color();
		shark.size();
	}
}