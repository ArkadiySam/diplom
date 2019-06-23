package document;


import java.io.*;
import java.sql.*;

public class DocStorage {

    private static String url = "jdbc:sqlite:C:/Users/Arkadiy/Desktop/диплом/template/documents.db";

    private static byte[] getDataFile(Document document) throws IOException {
        ByteArrayOutputStream bos  = new ByteArrayOutputStream();;
        File f = new File(document.getPath());
        FileInputStream fis = new FileInputStream(f);
        byte[] buffer = new byte[1024];
        for (int len; (len = fis.read(buffer)) != -1;) {
            bos.write(buffer, 0, len);
        }
        return bos.toByteArray();
    }

    public static void addDoc(int id) throws SQLException, IOException, ClassNotFoundException {
        Document doc = DocumentFactory.getDocument(id);
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection(url);
        String insertSQL = "INSERT INTO doc values (?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(insertSQL);
        pstmt.setInt(1, id);
        pstmt.setBytes(2, getDataFile(doc));
        pstmt.executeUpdate();
        conn.close();
    }

    public static InputStream getDoc(int id) {
        ResultSet rs = null;
        InputStream input = null;
        try {
            Class.forName("org.sqlite.JDBC");

        Connection conn = DriverManager.getConnection(url);
        String insertSQL = "SELECT data from doc WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(insertSQL);
        pstmt.setInt(1, id);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            input = rs.getBinaryStream("data");
        }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return input;
    }
}
