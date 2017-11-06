package com.andress.allclasses;

/**
 * Created by A.Zapotochnyy on 06.11.2017.
 */

public class TV extends Devices {

	public double diagonal;

	public TV(String name, double diagonal) {
		super(name);
		this.diagonal = diagonal;
	}

	public TV(String name, int power, double diagonal) {
		super(name, power);
		this.diagonal = diagonal;
	}

	public TV(String name, int price, Logo nameCompany, Acumulator acumulator, int power, double diagonal) {
		super(name, price, nameCompany, acumulator, power);
		this.diagonal = diagonal;
	}

	//Compare diagonal of a TV
	public int compareall(Devices a) {
		int z=0;
		if (a instanceof TV) {
			TV n = (TV) a;
			if (n.diagonal > this.diagonal) {
				z = 1;
				System.out.println(n.name + " > " + this.name);
			} else if (n.diagonal < this.diagonal) {
				z = -1;
				System.out.println(n.name + " < " + this.name);
			} else {
				z = 0;
				System.out.println(n.name + " = " + this.name);
			}
		} else {
			super.compareall(a);
		}
		return z;
	}

	@Override
	public String toString() {
		return "TV [diagonal=" + diagonal + ", name=" + name + ", price=" + price + ", nameCompany=" + nameCompany
				+ ", acumulator=" + acumulator + ", power=" + power + ", idinumb=" + idinumb + "]";
	}
}
