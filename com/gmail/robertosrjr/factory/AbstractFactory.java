package com.gmail.robertosrjr.factory;

import com.gmail.robertosrjr.model.GrupoOperacaoComum;

public abstract class AbstractFactory {

	public abstract GrupoOperacaoComum createGrupoOperacaoOCVPD();
	public abstract GrupoOperacaoComum createGrupoOperacaoOPD();
	
}
