package com.SA;
/**
 * 
 * @author teacher<br>
 * <h1>學員管理系統 bruh bruh bruh<h1>
 * @version 1.0
 */
public class student {
	private String name;

	public student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return 顯示所有資料
	 */
	public String show() {
		return "name: " + name;
	}
}
