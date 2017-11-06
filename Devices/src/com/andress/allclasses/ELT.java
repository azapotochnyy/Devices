package com.andress.allclasses;

/**
 * Created by A.Zapotochnyy on 06.11.2017.
 */

public class ELT extends TV {

	public double chastotarozvt;

	public ELT(String name, int power, double diagonal, double chastotarozvt) {
		super(name, power, diagonal);
		this.chastotarozvt = chastotarozvt;

	}

	public ELT(String name, double diagonal, double chastotarozvt) {
		super(name, diagonal);
		this.chastotarozvt = chastotarozvt;

	}

	public ELT(String name, int price, Logo nameCompany, Acumulator acumulator, int power, double diagonal,
			double chastotarozvt) {
		super(name, price, nameCompany, acumulator, power, diagonal);
		this.chastotarozvt = chastotarozvt;
	}

	public int compareall(Devices a) {
		int z = 0;
		if (a instanceof ELT) {
			ELT n = (ELT) a;
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
}
