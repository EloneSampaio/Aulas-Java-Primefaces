package aula;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="Perfil")
@ViewScoped
public class PerfilUsuario implements Serializable {

	private String senha;
	private String login;
	private String texto;
	private Date data;
	private String profissao;
	private Interesse interesse;

	/**
	 * 
	 */

	//lista de interesses

	public static final List<Interesse> INTERESSES=new ArrayList<>();

	static {

		INTERESSES.add(new Interesse("Cinema","cinema"));
		INTERESSES.add(new Interesse("Computacao","computacao"));
		INTERESSES.add(new Interesse("Esportes","esportes"));
		INTERESSES.add(new Interesse("Leitura","leitura"));
	}


	private static final long serialVersionUID = 1L;


	public String getTexto() {
		return texto;
	}




	public String getProfissao() {
		return profissao;
	}




	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}




	public Interesse getInteresse() {
		return interesse;
	}




	public void setInteresse(Interesse interesse) {
		this.interesse = interesse;
	}




	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void actualizar() {
		System.out.println("Profissão  "+this.profissao);
		System.out.println("Interesse  "+this.interesse.getDescricao());
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Actualizado"));
	}

	public void mostrar() {
		System.out.println("sobre: "+this.texto);
	}

	public void Mostrardata() {
		System.out.println("data "+this.data.getDate());
	}

	public Date getHoje() {
		return new Date();	
	}

	public List<String> completar(String texto){

		List<String> lista=new ArrayList<String>();
		if(texto.startsWith("elo")) {
			lista.add("elone samp");
			lista.add("elone sampaio");
			lista.add("elone gonçalves");
			lista.add("elone isata");
		}
		return lista;

	}

	public List<Interesse> getInteresses(){
		return INTERESSES;
	}


}
