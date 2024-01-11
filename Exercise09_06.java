
public class Exercise09_06 {
	public static void main(String[] args) {
		StopWatch timer = new StopWatch();
		int size = 100000;
		
		double[] list = new double[size];
		for (int i = 0; i < size; i++)
			list[i] = Math.random() * list.length;
		
		System.out.println("Start");
		timer.start();
		selectionSort(list);
		timer.stop();
		System.out.println("Stop");
		System.out.println("Sort of " + size + " numbers took " + timer.getElapsedTime() + " milliseconds.");
	}
	
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length; i++) {
			double currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin < list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}

class StopWatch {
	private long startTime;
	private long endTime;
	
	public StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return endTime - startTime;
	}
}