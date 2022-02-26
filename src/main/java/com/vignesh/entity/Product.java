package com.vignesh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {
   
	@Id
	private Integer pid;
	private String pname;
	private Double price;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	public Product(Integer pid, String pname, Double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
}
