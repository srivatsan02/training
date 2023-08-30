import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sql = "insert into customer values(?,?,?)";

        try {
            Connection conn = JdbcFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            System.out.print("Enter Cid: ");
            int id = scanner.nextInt();

            System.out.print("Enter Cname: ");
            scanner.nextLine(); // Consume the newline character
            String name = scanner.nextLine();

            System.out.print("Enter Domain: ");
            String occupation = scanner.nextLine();

            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setString(3, occupation);
            stmt.executeUpdate();

            System.out.println("Record inserted");
        } catch (SQLException e) {
            System.out.println("Record not inserted due to...");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
