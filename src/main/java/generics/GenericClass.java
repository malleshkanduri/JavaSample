package generics;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GenericClass<T,S,X,Y> extends BaseClass<X,Y> {
	T t;
	S s;
	
	public T getTypeT() {
		return t;
	}
	
	public S getTypeS() {
		return s;
	}
	
	static public void main(String[] s) {
		GenericClass<String,Integer, Long, Double> genericClass = new GenericClass<String,Integer, Long, Double>();
		
		String string = genericClass.getTypeT();
		Integer integer = genericClass.getTypeS();
		Map<Long, Double> baseClassTypeS = genericClass.getBaseClassTypeS();
		List<Long> baseClassTypeT = genericClass.getBaseClassTypeT();
		System.out.println(string);
	}
}

class BaseClass<T,S> {
	public List<T> getBaseClassTypeT() {
		return Collections.emptyList();
	}
	
	public Map<T, S> getBaseClassTypeS() {
		return Collections.emptyMap();
	}
}