package com.andress.allclasses;

/**
 * Created by A.Zapotochnyy on 06.11.2017.
 */

public enum Acumulator {

	one(3500), two(500), three(7500), four(10000);

	public int powerC;

	private Acumulator(int powerC) {
		this.powerC = powerC;
	}

	public int getPowerC() {
		return powerC;
	}

	public double connectoAcum(Devices a) {

		double T = 0;
		T = (1.5 * powerC * 1 * 1 * a.power) / 100;
		return T;
	}
}
