

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TPdemo {

	static class MyTask implements Callable<String> {

		@Override
		public String call() throws Exception {
			Thread.sleep(50);
			System.out.println("Rabotq");
			return "Ooooo poolche";
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ExecutorService pool = Executors.newFixedThreadPool(2);

		List<Future> list = new ArrayList<Future>();

		for (int i = 0; i < 10; i++) {
			list.add(pool.submit(new MyTask()));
		}

		pool.shutdown();
		for (Future future : list) {
			try {
				future.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Time taken" + (System.currentTimeMillis() - start));

	}

}
