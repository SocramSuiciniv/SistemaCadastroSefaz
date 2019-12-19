package principal;

import java.util.ArrayList;

import java.util.List;

import dao.UsuarioDaoTesteLocal;
import models.Usuario;

public class CrudTesteLocal {
	private static UsuarioDaoTesteLocal u = new UsuarioDaoTesteLocal();

	public static void main(String[] args) {

		popularArray();
		listarPessoas();
		u.deletarUsuario(2);
		listarPessoas();
		listarPessoas();

	}

	public static void popularArray() {

		Usuario usuario1 = new Usuario();
		usuario1.setNome("Rud");
		usuario1.setId(1);
		usuario1.setSenha("123");
		usuario1.setEmail("rudson@hotmail.com");
		usuario1.setTelefone("998188202");
		u.salvarUsuario(usuario1);

		Usuario usuario2 = new Usuario();
		usuario2.setNome("Mark");
		usuario2.setId(2);
		usuario2.setSenha("mark@hotmail.com");
		usuario2.setTelefone("819928222");
		u.salvarUsuario(usuario2);

		Usuario usuario = new Usuario();
		usuario.setNome("Douglas");
		usuario.setId(3);
		usuario.setSenha("123");
		usuario.setEmail("douglas@hotmail.com");
		usuario.setTelefone("998144402");
		u.salvarUsuario(usuario);

	}

	public static void listarPessoas() {

		List<Usuario> lista = new ArrayList<Usuario>();

		lista = u.listarUsuario();

		for (Usuario usuario : lista) {

			System.out.println("Nome : " + usuario.getNome());
			System.out.println("Senha : " + usuario.getSenha());
			System.out.println("Email : " + usuario.getEmail());
			System.out.println(" Telefone: " + usuario.getTelefone());
			System.out.println("------------------------------------");

		}

	}

}
