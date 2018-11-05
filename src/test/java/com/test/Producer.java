package com.test;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			produce();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void produce() throws InterruptedException {
		for (int i = 0; i < 1000; i++) {
			queue.put(i);
			System.out.println("Inserted number: " + i);
		}

	}
}
