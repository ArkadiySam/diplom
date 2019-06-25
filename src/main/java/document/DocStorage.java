package document;


import java.io.*;
import java.sql.*;

public class DocStorage {

    private static String url = "jdbc:sqlite:C:/Users/Ксения/Desktop/доки/template/documents.db";

    private static byte[] getDataFile(Document document) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        File f = new File(document.getPath());
        try (FileInputStream fis = new FileInputStream(f);){
            byte[] buffer = new byte[1024];
            for (int len; (len = fis.read(buffer)) != -1; ) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bos.toByteArray();
    }

    public static void addDoc(int id) throws SQLException, ClassNotFoundException {
        Document doc = DocumentFactory.getDocument(id);
        Class.forName("org.sqlite.JDBC");
        try (Connection conn = DriverManager.getConnection(url)) {
            String insertSQL = "INSERT INTO doc values (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setInt(1, id);
            pstmt.setBytes(2, getDataFile(doc));
            pstmt.executeUpdate();
        }
    }

    public static InputStream getDoc(int id) {
        InputStream input = null;

        try (Connection conn = DriverManager.getConnection(url)) {
            Class.forName("org.sqlite.JDBC");
            String insertSQL = "SELECT data from doc WHERE id=?";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                input = rs.getBinaryStream("data");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return input;
    }
}
