package cn.test.tcpDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {

            Socket s = new Socket("127.0.0.1", 8888);
            InputStream is = s.getInputStream();
            byte[] buffer = new byte[1024];
            int length = is.read(buffer);
            InetAddress ip = s.getInetAddress();
            System.out.println(ip + new String(buffer));

    }
}
