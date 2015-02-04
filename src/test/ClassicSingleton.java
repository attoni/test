package test;

public class ClassicSingleton {
	private static ClassicSingleton instance = null;
private String a;
	protected ClassicSingleton() {
	}

	public static ClassicSingleton getInstance() {
		System.out.println(instance);
		if (instance == null) {
			instance = new ClassicSingleton();
		}
		return instance;
	}
	public void seta(String k){
		a=k;
		System.out.println("====ainstance"+a);
	}
public void geta(){
		
		System.out.println(a);
	}

	
	
}