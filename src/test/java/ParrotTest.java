import com.birds.*;
import com.birds.Bird;
import com.birds.ParrotWithCat;
import com.birds.ParrotWithDog;
import com.birds.ParrotWithRooster;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ParrotTest
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
		Bird b1 = new ParrotWithDog();
		b1.sing();
		b1=new ParrotWithCat();
		b1.sing();
		b1=new ParrotWithRooster();
		b1.sing();
	}
}