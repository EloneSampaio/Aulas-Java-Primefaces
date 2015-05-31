import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean(name="Inverter")
@ViewScoped
public class Inverter implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String palavra;
	private String palavraInvertida;
	private int contador;


	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public String getPalavraInvertida() {
		return palavraInvertida;
	}
	public void setPalavraInvertida(String palavraInvertida) {
		this.palavraInvertida = palavraInvertida;
	}

	public void inverter() {
		this.palavraInvertida="";
		this.contador=0;

		if(this.palavra!=null && this.palavra.isEmpty()) {
			this.contador=1;
		}

		for (int i = this.palavra.length()-1; i>=0;  i--) {
			char letra=this.palavra.charAt(i);
			this.palavraInvertida +=letra;

			if(letra== ' ') {
				this.contador++;
			}

		}
		System.out.println("nome " +this.palavra);
		System.out.println("invertido "+this.palavraInvertida);
		System.out.println("quantidade de letra " +this.contador);
	}


}
