public class Consumer extends Thread {
	private Buffer b;
	private Integer number;
	private Integer time;
	
	public Consumer (Buffer b, Integer number, Integer time) {
		this.b = b;
		this.number = number;
		this.time = time;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(time * 1000);
			}
			catch (InterruptedException e) {
				System.err.println("Exception: " + e.toString());
			}
			System.out.println("Consumer retrieved " + (b.get() + number));
		}
	}
}
