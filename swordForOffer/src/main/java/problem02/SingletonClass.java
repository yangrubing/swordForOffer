package problem02;

/**
 * 单例模式，采用静态类的实现方式
 * @author bjyangrubing
 * 
 */
public class SingletonClass
{
	/**set the construtor private*/
	private SingletonClass()
	{
	}

	private static class SingletonHolder
	{
		private static final SingletonClass INSTANCE = new SingletonClass();
	}

	public static SingletonClass newInstance()
	{
		return SingletonHolder.INSTANCE;
	}
}
