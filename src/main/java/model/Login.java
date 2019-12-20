package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "loginBean")
@RequestScoped

public class Login {
	protected String user;
	protected String senha;
	protected String mensagem = "";

	public String getLogin() {
		return user;
	}

	public void setLogin(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
