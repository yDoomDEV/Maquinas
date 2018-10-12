package br.com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.UUID;

import org.bukkit.entity.Player;

public class MySQL {

	public static void criarTabela() {
		try {
			Connection con = abrirConexao();
			PreparedStatement st = con
					.prepareStatement("CREATE TABLE IF NOT EXISTS MAQUINAS(ID VARCHAR(45),MAQUINAS DOUBLE);");
			st.executeUpdate();

			con.close();

		} catch (Exception e) {

		}
	}

	public static void addJogador(Player player) {
		UUID id = player.getUniqueId();
		try {
			Connection con = abrirConexao();
			PreparedStatement st = con.prepareStatement("INDERT INTO MAQUINAS VALUES (?, 0);");
			st.setString(1, id.toString());

			st.executeUpdate();

			con.close();
		} catch (Exception e) {

		}
	}

	public static double getJogador(Player player) {
		double value = 0;
		try {
			UUID id = player.getUniqueId();
			try {
				Connection con = abrirConexao();
				PreparedStatement st = con.prepareStatement("SELECT MAQUINAS FROM MAQUINAS WHERE ID = ?;");
				st.setString(1, id.toString());
				ResultSet rs = st.executeQuery();

				if (rs.next()) {
					value = rs.getDouble("MAQUINAS");

				}

				con.close();
			} catch (Exception e) {

			}
		} catch (Exception e) {

		}
		return value;
	}

	public static boolean hasJogador(Player player) {
		try {
			UUID id = player.getUniqueId();
			try {
				Connection con = abrirConexao();
				PreparedStatement st = con.prepareStatement("SELECT MAQUINAS FROM MAQUINAS WHERE ID = ?;");
				st.setString(1, id.toString());
				ResultSet rs = st.executeQuery();
				boolean result = rs.next();
				con.close();
				return result;

			} catch (Exception e) {

			}
		} catch (Exception e) {

		}
		return false;
	}

	public static void setJogador(Player player, double maquinas) {
		UUID id = player.getUniqueId();
		try {
			Connection con = abrirConexao();
			PreparedStatement st = con.prepareStatement("UPDATE MAQUINAS SET MAQUINAS = ? WHERE ID = ?;");
			st.setString(1, id.toString());
			st.setDouble(1, maquinas);

			st.executeUpdate();

			con.close();
		} catch (Exception e) {

		}
	}

	public static Connection abrirConexao() {
		try {
			String password = "";
			String user = "root";
			String host = "localhost";
			String port = "3303";
			String database = "Maquinas";
			String type = "jdbc:mysql://";
			String url = type + host + ":" + port + "/" + database;

			return DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			System.out.print("§4Error no mysql!");
		}

		return null;
	}

}
