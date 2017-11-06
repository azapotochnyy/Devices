package com.andress.allclasses;

/**
 * Created by A.Zapotochnyy on 06.11.2017.
 */

public final class Plazma extends TV {

	public int screenexpansion;

	public Plazma(String name, double diagonal, int screenexpansion) {
		super(name, diagonal);
		this.screenexpansion = screenexpansion;
	}

	public Plazma(String name, int power, double diagonal, int screenexpansion) {
		super(name, power, diagonal);
		this.screenexpansion = screenexpansion;
	}

	public Plazma(String name, int price, Logo nameCompany, Acumulator acumulator, int power, double diagonal,
			int screenexpansion) {
		super(name, price, nameCompany, acumulator, power, diagonal);
		this.screenexpansion = screenexpansion;
	}

	public int compareall(Devices a) {
		int z = 0;
		if (a instanceof Plazma) {
			Plazma n = (Plazma) a;
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
		return "Plazma [screenexpansion=" + screenexpansion + ", diagonal=" + diagonal + ", name=" + name + ", price="
				+ price + ", nameCompany=" + nameCompany + ", acumulator=" + acumulator + ", power=" + power
				+ ", idinumb=" + idinumb + "]";
	}

}
