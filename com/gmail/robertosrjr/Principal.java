package com.gmail.robertosrjr;

import com.gmail.robertosrjr.factory.AbstractFactory;

public class Principal {

	public static void main(String[] args) {
		
		AbstractFactory abstfact = Factory.getFactory("1");
		abstfact.createGrupoOperacaoOCVPD();
	}
}
