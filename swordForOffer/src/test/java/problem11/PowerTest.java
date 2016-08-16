package problem11;

import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/16.
 */
public class PowerTest
{
	@Test
	public void test() throws Exception
	{
		Power power = new Power();
		System.out.println(power.equal(power.power(2, 4), 16));
	}
}
