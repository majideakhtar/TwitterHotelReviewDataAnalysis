/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ftppackage;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;
 
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
 


public class FtpUpload {
 
    public FtpUpload(){
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
 
            System.out.println("Start uploading first file");
            boolean done = ftpClient.storeFile(firstRemoteFile, inputStream);
            System.out.println(done);
            inputStream.close();
            if (done) {
                System.out.println("The first file is uploaded successfully.");
                JOptionPane.showMessageDialog(null, "file is uploaded successfully");
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
//            // APPROACH #1: uploads first file using an InputStream
//            File firstLocalFile = new File("D:/test.txt");
// 
//            String firstRemoteFile = "final.txt";
//            
//            //String localFile = "D:/test.txt";
//            //String remoteFile = "fresh.txt";
//            InputStream inputStream = new FileInputStream(firstLocalFile);
// 
//            System.out.println("Start uploading first file");
//            boolean done = ftpClient.storeFile(firstRemoteFile, inputStream);
//            System.out.println(done);
//            inputStream.close();
//            if (done) {
//                System.out.println("The first file is uploaded successfully.");
//            }
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

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}