package problem02;

import org.junit.Test;

import junit.framework.Assert;
import problem02.SingletonClass;

public class SingletonClassTest
{
	@Test
	public void test()
	{
		SingletonClass singletonClass1 = SingletonClass.newInstance();

		SingletonClass singletonClass2 = SingletonClass.newInstance();

		Assert.assertEquals(singletonClass1, singletonClass2);
	}
}
