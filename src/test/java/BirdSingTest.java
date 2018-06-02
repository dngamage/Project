import com.birds.Bird;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BirdSingTest
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
		Bird bird = new Bird();
		bird.sing();
	}
}