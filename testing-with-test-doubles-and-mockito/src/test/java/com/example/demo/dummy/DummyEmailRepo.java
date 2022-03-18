package com.example.demo.dummy;

public class DummyEmailRepo implements EmailRepository {

	@Override
	public String sendMessage(String message) {
		throw new AssertionError("Un implemented");
	}

}
