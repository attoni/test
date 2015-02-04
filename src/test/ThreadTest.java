package test;

public class ThreadTest extends Thread {
	private Thread t;
	String name;

	public ThreadTest(String threadName) {
		name = threadName;

	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			try {
				
				System.out.println("Creating Thread =" + name + "    i=" + i);
				if(name.equalsIgnoreCase("Thread-1"))
					Thread.sleep(100);
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Thread " + name + " son buldu.");
	}
	
	@Override
	public synchronized void start() {
	
			
			System.out.println("Thread Starting");
			
			if(t==null){
				t=new Thread(this,name);
				t.start();
			}
	}
	}


