package problem09;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/16.
 */
public class FibonacciTest
{
	@Test
	public void test()
	{
		Fibonacci fibonacci = new Fibonacci();
		Assert.assertEquals(5, fibonacci.fib(5));
	}
}
