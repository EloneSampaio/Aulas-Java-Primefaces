import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


@ManagedBean(name="I")
@ViewScoped
public class Interesses implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String pais;
	private List<String> interesses;
	private List<String> paises=new ArrayList<String>();


	
	
	
	

	public Interesses(){ 
		paises.add("Angola");
		paises.add("Brasil");
		paises.add("Argelia");
		paises.add("Moçambique");
		paises.add("Guine");
		paises.add("Ghana");
		paises.add("Alemanha");
		paises.add("Namibia");
		paises.add("Cabo Verde");
		paises.add("Quenia");
	}

	public List<String> paisesAuto(String valor) {
		List<String> paisSugerido=new ArrayList<>();
		for (String pais : this.paises) {
			if(pais.toLowerCase().startsWith(valor.toLowerCase())) {
               paisSugerido.add(pais);
			}

		}
		return paisSugerido;
	}
	
	public void actualizar() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Actualizado"));
		System.out.println("Pais: "+pais);
		
	}

	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<String> getPaises() {
		return paises;
	}

	public void setPaises(List<String> paises) {
		this.paises = paises;
	}

	public void mostrar() {


		System.out.println("nome "+this.nome);
		for (String interesse : interesses) {
			System.out.println("Interesses "+interesse);

		}
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Actualizado"));
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getInteresses() {
		return interesses;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}




}
