package list.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insertstm {
	{
		
		 try {
			  
			 	Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");
				PreparedStatement in=con.prepareStatement("insert into std values(?,?,?)");
				in.setString(1,User.t.getText());
				in.setString(2,User.t1.getText());
				in.setString(3,User.t2.getText());
				in.executeUpdate();
				User.l3.setText("you inserted the records");
				User.l3.setBounds(50, 350, 200, 40);
				User.l3.getBaseline(200, 40);
				OptionPaneinsert o=new OptionPaneinsert();
				System.out.println("details inserted");
				con.close();
		 }
		catch (Exception e)
		{
				System.out.println(e);
		}
	}
} 