package com.andress.start;

import com.andress.allclasses.Acumulator;
import com.andress.allclasses.CDplayer;
import com.andress.allclasses.Computers;
import com.andress.allclasses.Devices;
import com.andress.allclasses.ELT;
import com.andress.allclasses.Laptop;
import com.andress.allclasses.Logo;
import com.andress.allclasses.Plazma;
import com.andress.allclasses.Servers;
import com.andress.allclasses.TV;

/**
 * Created by A.Zapotochnyy on 06.11.2017.
 */

public class Devicesmain {

	public static void main(String[] args) {

		CDplayer cd = new CDplayer("Ion24", 2500, Logo.GL, Acumulator.one, 2500, "small");
		Computers comput = new Computers("Acb1", 2000, Logo.KONIA, Acumulator.three, 2000, 15000);
		ELT elt1 = new ELT("Super", 1500, Logo.ÑJD, Acumulator.four, 3000, 60, 120);
		Laptop ltop = new Laptop("Smart", 3500, Logo.GL, Acumulator.four, 2700, 18000, 450);
		TV telik = new TV("oldOne", 100, Logo.KONIA, Acumulator.one, 2000, 70);
		Plazma plazm = new Plazma("Best", 2500, Logo.ELECTRON, Acumulator.one, 2500, 60, 2400);
		Servers server = new Servers("OMUL", 12000, Logo.AMURA, Acumulator.one, 9000, 19000, 7);

		/*
		 * System.out.println(cd); System.out.println("----------------");
		 * System.out.println(comput); System.out.println("----------------");
		 * System.out.println(elt1); System.out.println("----------------");
		 * System.out.println(ltop); System.out.println("----------------");
		 * System.out.println(telik); System.out.println("----------------");
		 * System.out.println(plazm); System.out.println("----------------");
		 * System.out.println(server);
		 */
		System.out.println("-=-=-=-=-=-=-=--=--=-=-");

		Laptop nout1 = new Laptop("Fujitsu", 2500, 350, 13);

		// Calculation of power of all devices
		Devices maspower[] = new Devices[7];
		maspower[0] = cd;
		maspower[1] = comput;
		maspower[2] = elt1;
		maspower[3] = ltop;
		maspower[4] = telik;
		maspower[5] = plazm;
		maspower[6] = server;

		System.out.println("Power of all devices = " + cd.totalpower(maspower));

		System.out.println("----------------");

		// Calculation of memoryVolume of the Computers
		Devices maspower2[] = new Devices[2];
		Computers comput2 = new Computers("Acc1", 1500, Logo.KONIA, Acumulator.three, 3000, 14000);

		maspower2[0] = comput;
		maspower2[1] = comput2;

		System.out.println("total memory volume is " + comput.memoryVolume + " + " + comput2.memoryVolume + " = "
				+ comput.totalmemoryVolume(maspower2));

		System.out.println("----------------");

		//Compare computers by memoryVolume
		comput.compareall(comput2);
		comput2.compareall(comput);
		System.out.println("----------------");

		//Compare TV by diagonal
		TV telik2 = new TV("oldOne", 100, Logo.KONIA, Acumulator.one, 2000, 70);
		TV telik3 = new TV("oldTwo", 100, Logo.KONIA, Acumulator.one, 2000, 60);
		telik2.compareall(telik3);
		telik3.compareall(telik2);
		System.out.println("----------------");

		//Compare Plazma by diagonal
		Plazma plazm2 = new Plazma("Best", 2400, Logo.ELECTRON, Acumulator.one, 2400, 50, 2300);
		Plazma plazm3 = new Plazma("NoBest", 2500, Logo.ELECTRON, Acumulator.one, 2500, 60, 2400);
		plazm2.compareall(plazm3);
		plazm3.compareall(plazm2);
		System.out.println("----------------");

		//Compare ELT by diagonal
		ELT elt2 = new ELT("Super", 1500, Logo.ÑJD, Acumulator.four, 3000, 60, 120);
		ELT elt3 = new ELT("NoSuper", 1400, Logo.ÑJD, Acumulator.four, 2000, 50, 110);
		elt2.compareall(elt3);
		elt3.compareall(elt2);
		System.out.println("----------------");

		//Compare ELT and Plazma by diagonal
		elt2.compareall(plazm2);
		plazm2.compareall(elt2);
		System.out.println("----------------");

		//Quantity of the servers
		System.out.println(Servers.getQuantityservers());
		System.out.println("----------------");

		Servers server2 = new Servers("OMaL", 12000, Logo.AMURA, Acumulator.one, 9000, 19000, 15);
		System.out.println(Servers.getQuantityservers());
		System.out.println("----------------");

		server2.setQuantity(100);
		System.out.println(Servers.getQuantityservers());
		System.out.println("----------------");

		//MemoryVolumeMB, memoryVolumeGB
		long s = 2000000000;
		System.out.println(Computers.memoryVolumeMB(s));
		System.out.println(Computers.memoryVolumeGB(s));
		System.out.println("----------------");

		int a = Devices.devicenumber - Devices.devicenumberFirst;
		System.out.println("We have created= " + a + " Devices");
		System.out.println("----------------");

		//What does enum have;
		for (Logo log : Logo.values())
			System.out.println(log + " a greeting is  " + log.getLogo1());
		System.out.println("----------------");

		//Tax of the Computers price
		System.out.println("taxvolume fo " + "" + comput.name + "is" + comput.taxvolume(comput.price));
		System.out.println("taxvolume fo " + "" + comput2.name + "is" + comput2.taxvolume(comput2.price));
		System.out.println("----------------");

		//Servers price with tax
		System.out.println(server.ServPrice(1000));
		System.out.println(server2.ServPrice(2000));
		System.out.println("----------------");

	}

}
