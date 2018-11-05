package com.test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException {
		int BOUND = 1;
		int N_PRODUCERS = 4;
		int N_CONSUMERS = 1;
		System.out.println("Running software with " + N_CONSUMERS + " consumers.");
		System.out.println("Running software with " + N_PRODUCERS + " producers.");
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(BOUND);

		for (int i = 1; i < N_PRODUCERS; i++) {
			new Thread(new Producer(queue)).start();
		}

		for (int j = 0; j < N_CONSUMERS; j++) {
			new Consumer(queue).consume();
		}
	}
}
