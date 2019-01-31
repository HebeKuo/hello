package com.mslc;

public class HelloWorld {
	private String name = "";

	public String getName() {
		return name;
	}

	public String getMessage() {
		String msg = "";
		if (name == "") {
			msg = "Hello!";
		} else {
			msg = "Hello " + name + "!";
		}
		System.out.println("~~~~~~~~~~~~~~~~~~name:" + name + " ,msg:" + msg);
		return msg;
	}

	public void setName(String name) {
		this.name = name;
	}

}
