package problem35;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/23.
 */
public class FindNotRepeatingCharTest
{
	@Test
	public void test()
	{
		FindNotRepeatingChar f = new FindNotRepeatingChar();
		Assert.assertEquals(8, f.FirstNotRepeatingChar("asdfasdfo"));
	}
}
