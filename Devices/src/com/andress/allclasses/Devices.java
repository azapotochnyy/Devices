package com.andress.allclasses;

import java.util.Random;

/**
 * Created by A.Zapotochnyy on 06.11.2017.
 */

public class Devices {

	public static int devicenumber;
	public static int devicenumberFirst;
	public String name;
	public int price;
	public long power;
	public int idinumb;
	public Logo nameCompany;
	public Acumulator acumulator;

	public Devices(String name) {
		super();
		this.name = name;
		devicenumber();
	}

	public Devices(String name, int power) {
		super();
		this.name = name;
		this.power = power;
		devicenumber();
	}

	public Devices(String name, int price, Logo nameCompany, Acumulator acumulator, int power) {
		super();
		this.name = name;
		this.price = price;
		this.nameCompany = nameCompany;
		this.acumulator = acumulator;
		this.power = power;
		devicenumber();

	}

	static {
		Random rand = new Random();
		devicenumber = rand.nextInt(30);
		devicenumberFirst = devicenumber;
	}

	public static int getDevicenumber() {
		return devicenumber;
	}

	public static void setDevicenumber(int devicenumber) {
		Devices.devicenumber = devicenumber;
	}

	public final void devicenumber() {
		devicenumber++;
		idinumb = devicenumber;
	}

	public int getIdinumb() {
		return idinumb;
	}

	public void setIdinumb(int idinumb) {
		this.idinumb = idinumb;
	}

	public Logo getNameCompany() {
		return nameCompany;
	}

	public void setnameCompany(Logo nameCompany) {
		this.nameCompany = nameCompany;
	}

	public long getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public long totalpower(Devices a[]) {
		long count = 0L;
		for (int i = 0; i < a.length; i++) {
			count += a[i].getPower();
		}
		return count;
	}

	public long totalmemoryVolume(Devices b[]) {
		long totalmemoryVolumecount = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] instanceof Computers) {
				Computers n = (Computers) b[i];
				totalmemoryVolumecount = totalmemoryVolumecount + n.memoryVolume;
			} else {
			}
		}
		return totalmemoryVolumecount;
	}

	public int compareall(Devices a) {
		int c;
		if (a.power > this.power) {
			c = 1;
		} else if (a.power < this.power) {
			c = -1;
		} else {
			c = 0;
		}
		return c;
	}
}
