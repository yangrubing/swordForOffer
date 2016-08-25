package problem42;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by bjyangrubing on 2016/8/25.
 */
public class StringReverseTest
{

	@Test
	public void test()
	{
		StringReverse s = new StringReverse();

		Assert.assertEquals(" student. a am I ", s.ReverseSentence(" I am a student. "));

		Assert.assertEquals("XYZabc", s.LeftRotateString("abcXYZ", 3));
	}

}
