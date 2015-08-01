package com.sample.warjar.batch;

import java.io.IOException;

import com.sample.warjar.service.Service;

public class Main {

	public static void main(String[] args) throws IOException {
		Service service = new Service();
		System.out.println( service.sayHello()  );
	}

}
