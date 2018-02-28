package com.everis.agendadigital.model;

public enum Estados {

	RO(11,"RO"),
	AC(12,"AC"),
	AM(13,"AM"),
	PA(15,"PA"),
	MA(21,"MA"),
	CE(23,"CE"),
	RN(24,"RN"),
	PB(25,"PB"),
	PE(26,"PE"),
	AL(27,"AL"),
	SE(28,"SE"),
	BA(29,"BA"),
	MG(31,"MG"),
	ES(32,"ES"),
	RJ(33,"RJ"),
	SP(35,"SP"),
	PR(41,"PR"),
	SC(42,"SC"),
	RS(43,"RS"),
	MS(50,"MS"),
	MT(51,"MT"),
	GO(52,"GO"),
	DF(53,"DF");

	private final int codigoIbge;
	private final String nome;

	private Estados(int codigoIbge,String nome) {
		this.codigoIbge = codigoIbge;
		this.nome = nome;
	}
	
	public String getCodigo() {
		return Integer.toString(codigoIbge);
	}
	
	public String getNome(){
		return nome;
	}
	
	public int getCodigoIbge(){
		return codigoIbge;
	}
}
