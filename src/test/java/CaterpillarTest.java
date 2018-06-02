import com.butterfly.Caterpillar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CaterpillarTest
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
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.fly();
		caterpillar.walk();
	}
}