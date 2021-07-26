package edu.miu.cs.cs525.labs.protection;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvocationHandlerImpl implements InvocationHandler {

	private Movie movie;

	public InvocationHandlerImpl(Movie c) {
		movie = c;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			} else if (method.getName().equals("comment")) {
				return method.invoke(movie, args);
			} else if (method.getName().startsWith("get")) {
				return method.invoke(movie, args);
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}