package com.andress.allclasses;

/**
 * Created by A.Zapotochnyy on 06.11.2017.
 */

public class Laptop extends Computers {

	public int weight;

	public Laptop(String name, int memoryVolume, int weight) {
		super(name, memoryVolume);
		this.weight = weight;
	}

	public Laptop(String name, int power, int memoryVolume, int weight) {
		super(name, power, memoryVolume);
		this.weight = weight;
	}

	public Laptop(String name, int price, Logo nameCompany, Acumulator acumulator, int power, int memoryVolume,
			int weight) {
		super(name, price, nameCompany, acumulator, power, memoryVolume);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Laptop [weight=" + weight + ", memoryVolume=" + memoryVolume + ", name=" + name + ", price=" + price
				+ ", nameCompany=" + nameCompany + ", acumulator=" + acumulator + ", power=" + power + ", idinumb="
				+ idinumb + "]";
	}
}
