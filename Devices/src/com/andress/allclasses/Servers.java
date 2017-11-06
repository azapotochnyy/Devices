package com.andress.allclasses;

import java.math.BigDecimal;

/**
 * Created by A.Zapotochnyy on 06.11.2017.
 */

public class Servers extends Computers {

	private static int quantityservers;
	private int quantity;

	public Servers(String name, int memoryVolume, int quantity) {
		super(name, memoryVolume);
		this.quantity = quantity;
		quantityservers = quantityservers + quantity;
	}

	public Servers(String name, int power, int memoryVolume, int quantity) {
		super(name, power, memoryVolume);
		this.quantity = quantity;
		quantityservers = quantityservers + quantity;
	}

	public Servers(String name, int price, Logo nameCompany, Acumulator acumulator, int power, int memoryVolume,
			int quantity) {
		super(name, price, nameCompany, acumulator, power, memoryVolume);
		quantityservers = quantityservers - this.quantity + quantity;
		this.quantity = quantity;
	}

	public static int getQuantityservers() {
		return quantityservers;
	}

	public void setQuantity(int quantity) {
		quantityservers = quantityservers - this.quantity + quantity;
		this.quantity = quantity;
	}

	public BigDecimal ServPrice(int a) {
		BigDecimal price = new BigDecimal(a);
		BigDecimal totaltax = taxvolume(a);
		double disc = 0.05;
		BigDecimal discount = new BigDecimal(disc);
		discount = discount.setScale(2, BigDecimal.ROUND_DOWN);
		BigDecimal pricevithouttax = price.subtract(totaltax);
		BigDecimal totalDiscount = pricevithouttax.multiply(discount);
		BigDecimal pricevithdiscount = pricevithouttax.subtract(totalDiscount);
		pricevithdiscount = pricevithdiscount.setScale(2, BigDecimal.ROUND_HALF_UP);
		return pricevithdiscount;
	}

	@Override
	public String toString() {
		return "Servers [quantity=" + quantity + ", memoryVolume=" + memoryVolume + ", name=" + name + ", price="
				+ price + ", nameCompany=" + nameCompany + ", acumulator=" + acumulator + ", power=" + power
				+ ", idinumb=" + idinumb + "]";
	}
}
