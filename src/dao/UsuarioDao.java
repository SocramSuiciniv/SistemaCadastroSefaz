package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class UsuarioDao {

	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;

	public void conectar() {
		String servidor = "jdbc:mysql://localhost:3306/usuarios";
		String usuario = "root";
		String senha = "123456";
		String driver = "com.mysql.jdbc.Driver";

		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = (Statement) this.connection.createStatement();

		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
			System.out.println("Usuario não conectado");
		}

	}

	public boolean estaConectado() {
		if (this.connection != null) {
			return true;
		} else {
			return false;
		}
	}

	public void listarUsuarios() {
		try {
			String query = "SELECT * FROM dados ORDER BY nome";
			this.resultset = this.statement.executeQuery(query);
		    while(this.resultset.next()){
		    	System.out.println("Id: " + this.resultset.getString("id") + " - Nome: " + this.resultset.getString("nome") + " - Email: " + this.resultset.getString("email") + " - Senha: " + this.resultset.getString("senha") + " - Telefone: " + this.resultset.getString("telefone"));
		    }

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}
	public void inserirUsuarios(String nome, String email, String senha, String telefone) {
		try {
			String query = "INSERT INTO dados (nome, email, senha, telefone) VALUES ('" + nome  + "', '" + email + "', '" + senha + "', '" + telefone + "');";
			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}
	public void editarUsuarios(String nome, String email, String senha, String telefone) {
		try {
			String query = "UPDATE dados SET nome = '" + nome + "', email = '" + email + "', senha = '" + senha + "', telefone = '" + telefone + "';";
			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}
	public void DeletarUsuarios(String id) {
		try {
			String query = "DELETE FROM dados WHERE id = " + id + ";";
			this.statement.executeUpdate(query);

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}
}