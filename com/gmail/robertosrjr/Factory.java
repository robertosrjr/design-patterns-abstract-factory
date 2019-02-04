package com.gmail.robertosrjr;

import com.gmail.robertosrjr.factory.AbstractFactory;
import com.gmail.robertosrjr.factory.ConcreteFactory;

public class Factory {

	private static AbstractFactory abstFactory = null;
	static AbstractFactory getFactory(String tipofactory) {

		 if (tipofactory.equals("a"))
			 return new ConcreteFactory();

		 return new ConcreteFactory();
	 }
}
