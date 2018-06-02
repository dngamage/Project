import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.other.Dolphin;

public class DolphinTest
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
		Dolphin dolphin = new Dolphin();
	//	dolphin.color();
		dolphin.swim();
	}
}