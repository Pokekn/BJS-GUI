import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		GUIBJS gui = new GUIBJS();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(gui);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(925, 500);
		frame.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
	}

}