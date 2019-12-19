package principal;

import dao.UsuarioDao;

public class Principal {

	public static void main(String[] args) {
		UsuarioDao usuariodao = new UsuarioDao();
		usuariodao.conectar();

		if (usuariodao.estaConectado()) {
			//usuariodao.listarUsuarios();
			//usuariodao.inserirUsuarios("Poli", "poli@hotmail.com", "1234", "34330562");
			//usuariodao.editarUsuarios("Poli", "poli@hotmail.com", "minhagalega", "34330562");
			usuariodao.DeletarUsuarios("1");

		} else {
			System.out.println("Não foi possivel conectar ao banco de dados.");
		}

	}

}
