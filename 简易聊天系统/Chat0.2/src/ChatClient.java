import java.awt.*;

public class ChatClient extends Frame{
	
	TextField tftxt = new TextField();
	TextArea taContent = new TextArea();
	
	public static void main(String[] args) {
		new ChatClient().launchFrame();
	}
	
	public void launchFrame() {
		setLocation(400, 300);
		setSize(300, 300);
		add(tftxt, BorderLayout.SOUTH);
		add(taContent, BorderLayout.NORTH);
		setVisible(true);
	}

}
