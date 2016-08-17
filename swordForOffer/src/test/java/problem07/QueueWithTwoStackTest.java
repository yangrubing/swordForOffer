package problem07;

import junit.framework.Assert;
import org.junit.Test;

public class QueueWithTwoStackTest
{
	@Test
	public void test() throws Exception
	{
		QueueWithTwoStack queue = new QueueWithTwoStack();
		queue.appendTail("1");
		queue.appendTail("2");
		queue.appendTail("3");

		Assert.assertEquals("1", queue.deletedHead());
		Assert.assertEquals("2", queue.deletedHead());
		Assert.assertEquals("3", queue.deletedHead());
	}
}
