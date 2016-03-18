package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.DBConnection;

public class User implements IUser {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accID;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((yourName == null) ? 0 : yourName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (accID != other.accID)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (yourName == null) {
			if (other.yourName != null)
				return false;
		} else if (!yourName.equals(other.yourName))
			return false;
		return true;
	}

	private Account acc;
	static Connection myConn = null;
	private String password;
	private String username;
	private String yourName;
	private String email;
	private int id;
	private int accID;

@Override
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User(String password, String username, String yourName, String email) {
		this.setPassword(password);
		this.setUsername(username);
		this.setYourName(yourName);
		this.setEmail(email);
	}
	
	public User(String password, String username, String email) {
		this.setPassword(password);
		this.setUsername(username);
		this.setEmail(email);
	}

	@Override
	public String toString() {
		return "User [password=" + password + ", username=" + username + ", yourName=" + yourName + ", email=" + email
				+ ", id=" + id +", Accid="+accID+ "]";
	}


	public void seeFreshContent() {
		Statement myStmt = null;
		ResultSet myRs = null;
		try {

			myConn = DBConnection.getInstance().getCon();

			myStmt = myConn.createStatement();

			myRs = myStmt
					.executeQuery("select * from ninegag.contents order by time_stamp desc;");

			while (myRs.next()) {
				System.out.println(myRs.getInt("ID") + ";"
						+ myRs.getInt("uploader") + ";"
						+ myRs.getTimestamp("time_stamp"));
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (myStmt != null) {
				try {
					myStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (myConn != null) {
				try {
					myConn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	public void seeTrendingContent() {
		Statement myStmt = null;
		ResultSet myRs = null;
		try {

			myConn = DBConnection.getInstance().getCon();

			myStmt = myConn.createStatement();

			myRs = myStmt
					.executeQuery("select * from ninegag.contents order by time_stamp desc;");

			while (myRs.next()) {
				if (myRs.getInt("points")>=300&&myRs.getInt("points")<1000) {
					System.out.println(myRs.getInt("ID") + ";"
							+ myRs.getInt("uploader") + ";"
							+ myRs.getInt("points") + ";"
							+ myRs.getTimestamp("time_stamp"));
					
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (myStmt != null) {
				try {
					myStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (myConn != null) {
				try {
					myConn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
@Override
	public int getAccID() {
		return accID;
	}

	public void setAccID(int accID) {
		this.accID = accID;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

}
