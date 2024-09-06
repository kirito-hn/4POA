package pjrSerializacao;

import java.io.Serializable;
public class aviao implements Serializable {
	
	//private static final long serialVersionUID = 1L;
	private String modelo;
	private int capacidade;

	
	public aviao(String modelo, int capacidade) {
		super();
		this.modelo = modelo;
		this.capacidade = capacidade;
		
	}
	
	public String toString() {
		return "AVIÃO [Modelo=" + modelo + ", capacidade=" + capacidade + "]";
	}
	
		public String getModelo() {return modelo;}
		public void setModelo(String modelo) {this.modelo = modelo;}
		public int getCapacidade() {return capacidade;}
		public void setCapacidade(int  capacidade) {this.capacidade= capacidade;}
		
}

