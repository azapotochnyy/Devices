package com.andress.allclasses;

/**
 * Created by A.Zapotochnyy on 06.11.2017.
 */

public enum Logo

{
	KONIA("Welcome to Ukraune"), GL("Welcome to Japan"), ÑJD("Welcome to USSR"), AMURA("ORIGATO"), CH("ogisava"), ELECTRON("Welcome to Lviv");

	public String logo1;

	private Logo(String logo1) {
		this.logo1 = logo1;
	}

	public String getLogo1() {
		return logo1;
	}

}
