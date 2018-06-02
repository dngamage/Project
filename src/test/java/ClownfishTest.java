import com.fish.Clownfish;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClownfishTest
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
		Clownfish clownfish = new Clownfish();
		clownfish.color();
		clownfish.size();
	}
}