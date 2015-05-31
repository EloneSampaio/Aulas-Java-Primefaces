

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


@ManagedBean(name="UsuarioBean")
@ViewScoped
public class UsuarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String email;
	private String contacto;
	private String endereco;
	private String sexo;
	private String estadoCivil;
	

	
	

	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void mostrar() {
		System.out.println("email: "+this.email);
		System.out.println("contacto: "+this.contacto);
	}
	
	public void mostrarCivil() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Actualizado"));
		System.out.println("genero: "+this.sexo+ "Estado civil: "+this.estadoCivil);
	}
	
	
	

}
