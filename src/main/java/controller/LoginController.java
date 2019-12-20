package controller;

import model.Login;

public class LoginController extends Login {

	public String VerificaLogin() {
		if (user.equals("Marcos")) {
			if (senha.equals("1234")) {
				System.out.println(mensagem = "bem vindo" + user);
			} else {
				System.out.println(mensagem = "senha invalida");
			}
		}
		return null;
	}
}
