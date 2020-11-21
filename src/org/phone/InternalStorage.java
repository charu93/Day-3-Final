package org.phone;

public class InternalStorage {
	public void processorName() {
		System.out.println("Processor name is Intel");
	}
	public void ramSize() {
		System.out.println("Ram Size is 3gb");
	}
	public static void main(String[] args) {
		ExternalStorage e =new ExternalStorage();
		InternalStorage i =new InternalStorage();
		e.size();
		i.ramSize();
		i.processorName();
	}
}
