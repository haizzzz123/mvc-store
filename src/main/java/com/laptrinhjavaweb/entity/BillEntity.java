package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "bill")
public class BillEntity extends BaseEntity {
	
	@ManyToOne
    @JoinColumn(name = "userid")
    private UserEntity userid;
	
	@Column(name = "datetime")
	@CreatedDate
	private Date datetime;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "bill_products", joinColumns = @JoinColumn(name = "billid"), 
								  inverseJoinColumns = @JoinColumn(name = "productid"))
	private List<ProductsEntity> products = new ArrayList<>();
	
	@Column(name = "total")
	private String total;
	
	
	public UserEntity getUserid() {
		return userid;
	}

	public void setUserid(UserEntity userid) {
		this.userid = userid;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public List<ProductsEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductsEntity> products) {
		this.products = products;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	
	
	
}
