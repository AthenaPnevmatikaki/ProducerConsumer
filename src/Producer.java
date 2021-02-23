public class Producer extends Thread {
	private Buffer b;
	private Integer price;
	private Integer time;
	
	public Producer (Buffer b, Integer price, Integer time) {
		this.b = b;
		this.price = price;
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
			b.put(price);
			System.out.println("Producer set buffer to " + price);
			price += 2;
		}
	}
}
