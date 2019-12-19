package dao;

import java.sql.Connection;

import java.util.List;

import java.util.ArrayList;

import models.Usuario;

public class UsuarioDaoTesteLocal {

	List<Usuario> listaUsuario = new ArrayList<Usuario>();

	public boolean salvarUsuario(Usuario usuario) {

		try {

			listaUsuario.add(usuario);

		} catch (Exception e) {
			return false;
		}

		return false;
	}

	public boolean deletarUsuario(long id) {
		for (Usuario usuario : listaUsuario) {
			if (usuario.getId() == id) {

				listaUsuario.remove(usuario);
			}
		}

		return false;
	}

	public List<Usuario> listarUsuario() {
		return this.listaUsuario;
	}

	public boolean alterarUsuario(Usuario usuario) {
		for (Usuario usuario1 : listaUsuario) {
			if (usuario1.getId() == usuario.getId()) {

				listaUsuario.remove(usuario1);
				listaUsuario.add(usuario);
			}
		}
		return false;

	}
}
