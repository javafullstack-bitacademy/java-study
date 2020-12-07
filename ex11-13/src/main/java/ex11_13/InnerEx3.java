package ex11_13;

import java.awt.Button;
import java.awt.event.*;

public class InnerEx3 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		}
		);
	}
}

