package Docker.Controller;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.*;

@RestController
public class HelloController {

    @GetMapping(path = "/docker")
    public String sayHello() throws SQLException {
        CWE6008();
        CWE6025();
        System.out.println(1/0);
        return "Deploy App with Docker for Test";
    }

    public void CWE6025(){
        int[] buff = new int[25];
        for (int i = 0; i <= 25; i++)
            buff[i] = 10;
    }

    public void CWE6008(){
        Object obj = null;
        obj.toString();
    }

/*    public ResultSet SQLInjection(String text) throws SQLException {
        String sql = "select "
                + "customer_id,acc_number,branch_id,balance "
                + "from Accounts where customer_id = '"
                + text
                + "'";
        Connection connection = new DriverManagerDataSource().getConnection();
        ResultSet rs = connection.createStatement().executeQuery(sql);
        return rs;
    }*/
}
