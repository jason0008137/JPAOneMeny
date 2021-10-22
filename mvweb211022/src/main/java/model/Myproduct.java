package model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="myproduct")
@NamedQuery(name="Myproduct.findAll", query="SELECT m FROM Myproduct m")
public class Myproduct implements Serializable {

	@Id
	private int pid;

	private String place;

	private String pname;

	private int price;

	public Myproduct() {
	}

	public int getPid() {
		return this.pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}