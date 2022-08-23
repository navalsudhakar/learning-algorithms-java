package practice.hacker.rank;

public class SingletonDemo {
	
	private static SingletonDemo singleton=null;
	
	private SingletonDemo() {
		
	}
	
	public SingletonDemo getInstance() {
		if(singleton==null) {
			synchronized (SingletonDemo.class) {
				if(singleton==null) {
					singleton=new SingletonDemo();
					return singleton;
				}
			}
		}
		return singleton;
	}

}
