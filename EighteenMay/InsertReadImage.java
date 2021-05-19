//Program to insert & read image
import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class InsertReadImage {
public static void ReadImage() {
	String url = "jdbc:mysql://localhost:3306/database1?useSSL=false";
    String user = "root";
    String password = "root";

    String query = "SELECT Data FROM Images where id = 2";

    try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet result = pst.executeQuery()) {

        if (result.next()) {

            String fileName = "image1.png";

            try (FileOutputStream fos = new FileOutputStream(fileName)) {

                Blob blob = result.getBlob("Data");
                int len = (int) blob.length();

                byte[] buf = blob.getBytes(1, len);

                fos.write(buf, 0, len);

            } catch (IOException ex) {

                Logger lgr = Logger.getLogger(InsertReadImage.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    } catch (SQLException ex) {

        Logger lgr = Logger.getLogger(InsertReadImage.class.getName());
        lgr.log(Level.SEVERE, ex.getMessage(), ex);
    }
    System.out.println("Read");
}
    
    public static void InsertImage() {
    String url = "jdbc:mysql://localhost:3306/database1?useSSL=false";
    String user = "root";
    String password = "root";

    String sql = "INSERT INTO images(Data) VALUES(?)";

    try (Connection con = DriverManager.getConnection(url, user, password); 
        	PreparedStatement pst = con.prepareStatement(sql)) {

            File myFile = new File("image.png");
            try (FileInputStream fin = new FileInputStream(myFile)) {

                pst.setBinaryStream(1, fin, (int) myFile.length());
                pst.executeUpdate();

            } catch (IOException ex) {

                Logger lgr = Logger.getLogger(InsertReadImage.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(InsertReadImage.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
        
        System.out.println("Image inserted successfully....");
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
    	InsertImage();
    	ReadImage();
    }
}