import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleChatServer {
	ArrayList clientOutputStreams;
	private static final Integer PORT = 5000;

	public class ClientHandler implements Runnable {
		BufferedReader reader;
		Socket sock;

		public ClientHandler(Socket clientSocket) {
			try {
				sock = clientSocket;
				InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
				reader = new BufferedReader(isReader);
			} catch (Exception ex) {
				ex.printStackTrace();	
			}
		}

		public void run() {
			String message;

			try {
				while ((message = reader.readLine()) != null) {
					System.out.println("read " + message);
					tellEveryone(message);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}	

	public static void main(String[] args) {
		new SimpleChatServer().go();
	}

	public void go() {
		clientOutputStreams = new ArrayList();

		try {
			ServerSocket serverSock = new ServerSocket(PORT);
			while (true) {
				Socket clientSocket = serverSock.accept();
				PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
				clientOutputStreams.add(writer);
				Thread thread = new Thread(new ClientHandler(clientSocket));
				thread.start();
				System.out.println("got a connection");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void tellEveryone(String message) {
		Iterator iterator = clientOutputStreams.iterator();
		while (iterator.hasNext()) {
			try {
				PrintWriter writer = (PrintWriter) iterator.next();
				writer.println(message);
				writer.flush();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}	
}