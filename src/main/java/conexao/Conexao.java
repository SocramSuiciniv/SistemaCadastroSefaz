package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Conexao {

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
}