package bankmanagementsystem;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class userdisplay {

	public void userdisplay() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		{
		      bankconnection con=new bankconnection();
		Statement s1=(Statement) con.getConnection().createStatement();
		ResultSet r=s1.executeQuery("select * from userdetail");
		while(r.next())
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("User Id:               "+r.getInt(1));
			System.out.println("User Account Number:   "+r.getString(2));
			System.out.println("Name of the user:      "+r.getString(3));
			System.out.println("Age of the user:       "+r.getString(4));
			System.out.println("Place of the user:     "+r.getString(5));
			System.out.println("Proofid of the user:   "+r.getString(6));
			System.out.println("------------------------------------------------------------------");
			}
		
		staffhome op=new staffhome();
		op.staffuser();
		}
		}


		
}