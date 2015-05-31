import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;



@ManagedBean(name="E")
@ViewScoped
public class Estado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome; 
	private String estado;
	private String cidade;
	private List<String> estados =new ArrayList<String>();
	private List<String> cidades =new ArrayList<String>();
	
	
	

	public List<String> getEstados() {
		return estados;
	}
	public List<String> getCidades() {
		return cidades;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	 public Estado() {
		estados.add("MA");
		estados.add("LD");
		estados.add("SP");

	}
	 
	 
	 public void carregaCidade() {
		 cidades.clear();
		 if("MA".equals(estado)) {
              cidades.add("UBERLANDIA");
              cidades.add("UBERBU");
              cidades.add("UBER");
              
		 }
		 
		 else if("LD".equals(estado)) {
             cidades.add("Luanda");
             cidades.add("Cazenga");
             cidades.add("Sambizanga");
             
		 }
		 
		 else if("SP".equals(estado)) {
             cidades.add("São Paulo");
             cidades.add("CAPÃO");
             cidades.add("OSASCO");
             
		 }
	 }


	public void mostrar() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Actualizado"));
		System.out.printf("Estado "+this.estado+"Cidade "+this.cidade);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
