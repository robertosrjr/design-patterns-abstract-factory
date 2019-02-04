package com.gmail.robertosrjr.factory;

import com.gmail.robertosrjr.model.GrupoOperacaoComum;
import com.gmail.robertosrjr.model.GrupoOperacaoOCVPD;
import com.gmail.robertosrjr.model.GrupoOperacaoOPD;

public class ConcreteFactory extends AbstractFactory {

	@Override
	public GrupoOperacaoComum createGrupoOperacaoOCVPD() {

		return new GrupoOperacaoOCVPD();
	}

	@Override
	public GrupoOperacaoComum createGrupoOperacaoOPD() {

		return new GrupoOperacaoOPD();
	}
}
