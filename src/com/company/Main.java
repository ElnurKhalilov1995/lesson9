package com.company;

import com.company.builder.Computer;
import com.company.factory.Bmw;
import com.company.factory.Car;
import com.company.factory.Mazda;
import com.company.factory.Mercedes;
import com.company.singleton.Log;

public class Main {

    public static void main(String[] args) {
//    	Builder
		Computer computer = new Computer.ComputerBuilder()
				.setHDD("1TB")
				.setRAM("16GB")
				.setBluetoothEnabled(false)
				.setGraphicsCardEnabled(true)
				.build();

		System.out.println(computer.getHDD());
		System.out.println(computer.getRAM());
		System.out.println(computer.isBluetoothEnabled());
		System.out.println(computer.isGraphicsCardEnabled());


//    	Factory
//    	Car mercedes = getCar("Mercedes");
//    	mercedes.start();
//    	Car bmw = getCar("BMW");
//    	bmw.start();


//    	Singleton
//	    Log.getInstance().addMessage("Hello");
//
//	    Log.getInstance().addMessage("World");
//
//	    Log.getInstance().addMessage("!");
//
//	    Log.getInstance().showLog();
    }

    static Car getCar(String carName) {

    	if (carName.equalsIgnoreCase("Mazda")) {
    		return new Mazda();
		} else if (carName.equalsIgnoreCase("Mercedes")) {
    		return new Mercedes();
		} else if(carName.equalsIgnoreCase("BMW")) {
    		return new Bmw();
		} else {
    		return null;
		}
	}
}
