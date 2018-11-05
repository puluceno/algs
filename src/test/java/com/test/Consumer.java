package com.test;

import java.util.concurrent.BlockingQueue;

public class Consumer {

	private BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	public void consume() throws InterruptedException {
		while (true) {
			Integer take = queue.take();
			System.out.println("*** Consumed number: " + take);
		}
	}
}
