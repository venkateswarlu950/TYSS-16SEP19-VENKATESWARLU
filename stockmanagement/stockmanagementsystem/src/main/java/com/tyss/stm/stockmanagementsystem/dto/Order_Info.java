package com.tyss.stm.stockmanagementsystem.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="Order_Info")
public class Order_Info {
	@Id
	@Column
	@GeneratedValue
	private int oid;
	@Column
	private Double totalPrice;
	@Column
	private Double totalPriceWithGst;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="order_history", joinColumns = @JoinColumn(name="oid"), inverseJoinColumns = @JoinColumn(name="id"))
	private List<Product> product_info;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Double getTotalPriceWithGst() {
		return totalPriceWithGst;
	}
	public void setTotalPriceWithGst(Double totalPriceWithGst) {
		this.totalPriceWithGst = totalPriceWithGst;
	}
	public List<Product> getProduct_info() {
		return product_info;
	}
	public void setProduct_info(List<Product> product_info) {
		this.product_info = product_info;
	}
	
	
	

}
