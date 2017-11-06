package com.andress.allclasses;

import java.math.BigDecimal;

/**
 * Created by A.Zapotochnyy on 06.11.2017.
 */

public class Computers extends Devices {

	public static final int memoryVolumeMin = 10;
	public static final int memoryVolumeMax = 20000;
	public static double tax = 8.125;
	public int memoryVolume;

	public Computers(String name, int power, int memoryVolume) {
		super(name, power);
		if ((memoryVolume > memoryVolumeMin) & (memoryVolume < memoryVolumeMax)) {
			this.memoryVolume = memoryVolume;
		} else {
			System.out.println("Error in memoryVolume");
		}
	}

	public Computers(String name, int memoryVolume) {
		super(name);
		if ((memoryVolume > memoryVolumeMin) & (memoryVolume < memoryVolumeMax)) {
			this.memoryVolume = memoryVolume;
		} else {
			System.out.println("Error in memoryVolume");
		}
	}

	public Computers(String name, int price, Logo nameCompany, Acumulator acumulator, int power, int memoryVolume) {
		super(name, price, nameCompany, acumulator, power);
		if ((memoryVolume > memoryVolumeMin) & (memoryVolume < memoryVolumeMax)) {
			this.memoryVolume = memoryVolume;
		} else {
			System.out.println("Error in memoryVolume");
		}
	}

	public Computers setmemoryVolume(int memoryVolume) {
		if ((memoryVolume > memoryVolumeMin) & (memoryVolume < memoryVolumeMax)) {
			this.memoryVolume = memoryVolume;
		} else {
			System.out.println("Error in memoryVolume modification");
		}
		return this;
	}

	public int compareall(Devices a) {
		int c = 0;
		if (a instanceof Computers) {
			Computers z = (Computers) a;
			if (z.memoryVolume > this.memoryVolume) {
				System.out.println(z.name + " > " + this.name);
			} else if (z.memoryVolume < this.memoryVolume) {
				c = -1;
				System.out.println(z.name + " < " + this.name);
			}
			else {
				System.out.println(z.name + "=" + this.name);
			}
		} else {
			super.compareall(a);
		}
		return c;
	}

	public static long memoryVolumeMB(long a) {
		long MB = 0;
		MB = a / 1048576;
		return MB;
	}

	public static long memoryVolumeGB(long a) {
		long MB = 0;
		MB = a / 1048576;
		long GB = MB / 1024;
		return GB;
	}

	public BigDecimal taxvolume(int b) {
		double c = 0;
		c = (b * tax) / 100;
		BigDecimal a = new BigDecimal(c);
		a = a.setScale(2, BigDecimal.ROUND_CEILING);
		return a;
	}

	@Override
	public String toString() {
		return "Computers [memoryVolume=" + memoryVolume + ", name=" + name + ", price=" + price + ", nameCompany="
				+ nameCompany + ", acumulator=" + acumulator + ", power=" + power + ", idinumb=" + idinumb + "]";
	}
}
