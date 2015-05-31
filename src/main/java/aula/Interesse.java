package aula;

import java.io.Serializable;

public class Interesse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String descricao;
	private String icon;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getIcon() {
		return icon;
	}
	public Interesse(String descricao, String icon) {
		
		this.descricao = descricao;
		this.icon = icon;
	}
	public Interesse() {
		
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}




}
