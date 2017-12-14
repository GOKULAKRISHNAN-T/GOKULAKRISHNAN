package org.pbook;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.book.Book;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("paperBook")
public class PaperBook extends Book {
	private float shippingWeight;
	private Integer inStock;

	public float getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(float shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public Integer getInStock() {
		return inStock;
	}

	public void setInStock(Integer inStock) {
		this.inStock = inStock;
	}

	public PaperBook() {
		super();

	}

	public PaperBook(Integer id, String title, Double price, String isbnNo, String publisher, String edition) {
		super(id, title, price, isbnNo, publisher, edition);

	}

	public PaperBook(float shippingWeight, Integer inStock) {
		super();
		this.shippingWeight = shippingWeight;
		this.inStock = inStock;
	}
	

}
