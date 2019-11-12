package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName SocketServer
 * @Description
 * @Author maTao
 * @Date 2019/11/12 0012 下午 14:14
 **/
public class SocketServer {


    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        Socket socket = null;
        try {
            // 监听客户端8080 请求
            serverSocket = new ServerSocket(8080);

            // 使用accept 阻塞等待请求
            socket = serverSocket.accept();

        } catch (IOException e) {
            e.printStackTrace();
        }

        String line;

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter os = new PrintWriter(socket.getOutputStream());

            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Client:"+ is.readLine());

            line = sin.readLine();

            while (!line.equals("bye")){
                os.println(line);
                os.flush();
                System.out.println("Server:" + line);
                System.out.println("Client:"+ is.readLine());
                line = sin.readLine();
            }
            os.close();
            is.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
