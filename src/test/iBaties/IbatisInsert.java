package test.iBaties;

import com.ibatis.common.resources.*;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import java.io.*;
import java.sql.*;


public class IbatisInsert {

        public static void main(String[] args) throws IOException, SQLException {
            Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
            SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

            /* This would insert one record in Employee table. */
            System.out.println("Going to insert record.....");
            Employee em = new Employee("Zara", "2000");

            smc.insert("Employee.insert", em);

            System.out.println("Record Inserted Successfully ");
        }
    }


