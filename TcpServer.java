package cn.test.tcpDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        OutputStream oo = s.getOutputStream();
        oo.write("你已经连接上服务器".getBytes());
        s.close();
        oo.close();
    }
}
