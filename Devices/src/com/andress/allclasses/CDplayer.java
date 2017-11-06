
package com.andress.allclasses;

/**
 * Created by A.Zapotochnyy on 06.11.2017.
 */

public class CDplayer extends Devices {

	public String type;

	public CDplayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public CDplayer(String name, int power, String type) {
		super(name, power);
		this.type = type;

	}

	public CDplayer(String name, int price, Logo nameCompany, Acumulator acumulator, int power, String type) {
		super(name, price, nameCompany, acumulator, power);
		this.type = type;
	}

	@Override
	public String toString() {
		return "CDplayer [type=" + type + ", name=" + name + ", price=" + price + ", nameCompany=" + nameCompany
				+ ", acumulator=" + acumulator + ", power=" + power + ", idinumb=" + idinumb + "]";
	}
}
