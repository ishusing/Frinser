package com.frinser.automation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.projectY.settings.Settings;

public class TimeSpentAllZero {
	Settings dataDb = new Settings();

	public static void main(String qp[]) throws SQLException
	{
		String selectSQL = "SELECT id, query,GROUP_CONCAT(link SEPARATOR \"', '\"),GROUP_CONCAT(userid SEPARATOR \"', '\"), GROUP_CONCAT(vote SEPARATOR ', ') , GROUP_CONCAT(time SEPARATOR ', ') FROM `timespent` group by query order by id";
		PreparedStatement p1 = Settings.getConn().prepareStatement(selectSQL);
		ResultSet rs = p1.executeQuery();
		while(rs.next())
		{
			String votesString= rs.getString(5);
			if(!votesString.contains("1"))
			{
				
				if(!searchInLinkssTable("'"+rs.getString(3)+"'") && !searchinTimeSpentOtherQuery("'"+rs.getString(3)+"'"))
				{
					System.out.print(rs.getInt(1)+",     " );
					for(int i=2;i<=6;i++)
					{
						System.out.print(rs.getString(i)+",    ");
					}
					System.out.println("\n\n\n\n");
					
				}
			}
		}
	}

	private static boolean searchinTimeSpentOtherQuery(String links) throws SQLException {
		String sql1 = "SELECT * FROM timespent where link in (" + links + ")";
		PreparedStatement p = Settings.getConn().prepareStatement(sql1);
		ResultSet rst = p.executeQuery();
		Set<String> queries = new HashSet<String>();
		String tmpQuery = "";
		while(rst.next())
		{ 
			queries.add(rst.getString("query"));
		}
		
		String selectSQL = "SELECT *, GROUP_CONCAT(vote SEPARATOR \", \") FROM  `timespent`  where query in (";
		
		int i = 0;
		for (String qq: queries) {
			if (i == 0) {
				tmpQuery = tmpQuery + "?";
				i++;
				continue;
			}
			i++;
			tmpQuery = tmpQuery + "," + "?";
		}
		selectSQL = selectSQL + tmpQuery + ")";	
		
		PreparedStatement p1 = Settings.getConn().prepareStatement(selectSQL);
		i=1;
		for (String qq : queries) {
			p1.setString(i++, qq);
		}
		ResultSet rs =null;
		try{
		  rs = p1.executeQuery();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		while(rs.next())
		{ 
			if(rs.getString(9).contains("1"))
			{
				return true;
			}
		}
		return false;
	}

	private static boolean searchInLinkssTable(String links) throws SQLException {
		String selectSQL = "SELECT * FROM `linkstable` where links in ("+links+") ORDER BY `userid` ASC";
		PreparedStatement p1 = Settings.getConn().prepareStatement(selectSQL);
		ResultSet rs = p1.executeQuery();
		if(rs.next())
		{ 
			return true;
		}
		return false;
	}
}
