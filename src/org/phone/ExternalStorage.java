package org.phone;

public class ExternalStorage {
public void size() {
	System.out.println("Size");
}

public  void phonename() {
	System.out.println("Iphone");
}
public static void main(String[] args) {
	ExternalStorage e = new ExternalStorage();
	e.size();
	e.phonename();
 
	System.out.println("Created main method");

}
}
