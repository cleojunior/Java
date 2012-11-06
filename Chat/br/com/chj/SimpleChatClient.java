import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatClient {
	JTextArea incoming;
	JTextField outgoing;
	BufferedReader reader;
	PrintWriter writer;
	
	public static void main(String[] args) {
		SimpleChatClient client = new SimpleChatClient();
		client.go();
	}
	
	public void go() {
		JFrame frame = new JFrame("Tora Simple Chat Client");
		JPanel mainPanel = new JPanel();
		
		incoming = new JTextArea(15, 50);
		incoming.setLineWrap(true);
		incoming.setWrapStyleWord(true);
		incoming.setEditable(true);
		
		JScrollPane qScroller = new JScrollPane(incoming);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		outgoing = new JTextField(20);
		
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		
		/* TODO: -> Continuar em pág. 384 Use a Cabeça JAVA.pdf */
	}
}

public class SendButtonListener implements ActionListener {
	public void actionPerformed(ActionEvent ev) {
		
	}	
}