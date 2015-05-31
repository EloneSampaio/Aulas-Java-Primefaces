import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


@ManagedBean(name="Login")
@ViewScoped

public class Login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nome;
	private String senha;
	private String login;


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
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


	public void Verificarlogin() {

		FacesMessage mensagem=null;

		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
			System.out.println("Verificando..."+this.login);

			if("elone".equalsIgnoreCase(this.login)) {
				mensagem=new FacesMessage("Login ja em uso");
				mensagem.setSeverity(FacesMessage.SEVERITY_WARN);
				FacesContext.getCurrentInstance().addMessage(null, mensagem);
			}
			else {
				mensagem=new FacesMessage("Login Disponivel");
				mensagem.setSeverity(FacesMessage.SEVERITY_INFO);
				FacesContext.getCurrentInstance().addMessage(null, mensagem);
			}
		
	}
	public void cadastrar() {

		System.out.println("Nome: "+this.nome);
		System.out.println("Login: "+this.login);
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Cadastro EFectuado com Sucesso"));
	}

}
