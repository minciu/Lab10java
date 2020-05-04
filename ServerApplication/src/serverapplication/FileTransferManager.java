/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapplication;

import com.jcraft.jsch.*;
/**
 *
 * @author user
 */
public class FileTransferManager {
    private final String HOST = "localhost";
    private final String USERNAME = "user";
    private final String PASSWORD = "password";

    private ChannelSftp setupJsch() throws JSchException {
        JSch jsch = new JSch();

        Session jschSession = jsch.getSession(USERNAME, HOST);
        jschSession.setPassword(PASSWORD);

        java.util.Properties config = new java.util.Properties();
        config.put("StrictHostKeyChecking", "no");
        jschSession.setConfig(config);

        jschSession.connect();
        return (ChannelSftp) jschSession.openChannel("sftp");
    }

    public void uploadFile(String localFile) {
        try {
            ChannelSftp channelSftp = setupJsch();
            channelSftp.connect();

            String remoteDirectory = "/gomoku/";

            channelSftp.put(localFile, remoteDirectory + "report.html");
            channelSftp.disconnect();
        } catch (JSchException | SftpException exception) {
            exception.printStackTrace();
        }
    }
}
