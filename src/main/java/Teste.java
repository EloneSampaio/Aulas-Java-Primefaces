import java.io.Serializable;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;



@ManagedBean(name="T")
@ViewScoped
public class Teste implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String snome;
	private String email;
	private String senha;
	private Date data;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSnome() {
		return snome;
	}
	public void setSnome(String snome) {
		this.snome = snome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void consulta() {
		if("elone".equalsIgnoreCase(this.nome)) {
			FacesMessage mensagem=new FacesMessage("Já existe um usuario com esse nome");
			mensagem.setSeverity(FacesMessage.SEVERITY_WARN);
			FacesContext.getCurrentInstance().addMessage(null, mensagem);
		}
		else {

			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario Disponivel"));

		}
	}
	public void mostrar() {

		System.out.printf("Dados: nome completo-> %s %s  email-> %s senha-> %s data-> %s ",this.nome,this.snome,this.email,this.senha,this.data);


	}


}
