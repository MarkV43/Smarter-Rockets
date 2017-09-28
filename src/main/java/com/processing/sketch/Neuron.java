package com.processing.sketch;

import java.util.ArrayList;

/**
 * Created by Marcelo Vogt on 28/09/2017.
 */
public class Neuron {
	public static final int OP_LINEAR = 0;
	public static final int OP_SIGMOID = 1;
	public static final int OP_HIPER_TAN = 2;
	private int operation;

	public Neuron(int operation) {
		this.operation = operation;
	}

	public double calculate(double input) throws Exception {
		switch (operation) {
			case OP_LINEAR:
				return input;
			case OP_SIGMOID:
				return 1 / (1 + Math.pow(Math.E, -input));
			case OP_HIPER_TAN:
				return Math.tanh(input);
			default:
				throw new Neuron.InvalidOperationException("Invalid Operation");
		}
	}

	public static class InvalidOperationException extends Exception {
		public InvalidOperationException() { super(); }
		public InvalidOperationException(String message) { super(message); }
		public InvalidOperationException(String message, Throwable cause) { super(message, cause); }
		public InvalidOperationException(Throwable cause) { super(cause); }
	}
}
