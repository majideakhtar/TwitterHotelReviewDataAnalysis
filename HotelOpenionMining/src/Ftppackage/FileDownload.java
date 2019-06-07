
package Ftppackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;
 
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
public class FileDownload {
 
    public FileDownload(){
        String server = "files.000webhost.com";
        int port = 21;
        String user = "sentimentalanalysis";
        String pass = "testing1234";
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();
 
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
 
            // APPROACH #1: uploads first file using an InputStream
            File firstLocalFile = new File("D:/test.txt");
 
            String firstRemoteFile = "final.txt";
            
            //String localFile = "D:/test.txt";
            //String remoteFile = "fresh.txt";
            InputStream inputStream = new FileInputStream(firstLocalFile);
 
            System.out.println("Start Downloaded first file");
            boolean done = ftpClient.storeFile(firstRemoteFile, inputStream);
            System.out.println(done);
            inputStream.close();
            if (done) {
                System.out.println("The first file is Downloaded successfully.");
                JOptionPane.showMessageDialog(null, "file is Downloaded successfully");
            }
 
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
//        String server = "files.000webhost.com";
//        int port = 21;
//        String user = "sentimentalanalysis";
//        String pass = "testing1234";
//        FTPClient ftpClient = new FTPClient();
//        try {
//            ftpClient.connect(server, port);
//            ftpClient.login(user, pass);
//            ftpClient.enterLocalPassiveMode();
// 
//            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
//            
//            OutputStream local = new FileOutputStream("D:\\hehe.txt");
//            boolean done = ftpClient.retrieveFile("final.txt", local);
// 
//            System.out.println(done);
//            
//        } catch (Exception ex) {
//            System.out.println("Error: " + ex.getMessage());
//            ex.printStackTrace();
//        } finally {
//            try {
//                if (ftpClient.isConnected()) {
//                    ftpClient.logout();
//                    ftpClient.disconnect();
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
    } 
}