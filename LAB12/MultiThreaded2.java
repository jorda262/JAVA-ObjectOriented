import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MultiThreaded2 extends JFrame implements ActionListener, Runnable {
	public static final int WIDTH = 600;
	public static final int HEIGHT = 400;
	public static final int FILL_WIDTH = 600;
	public static final int FILL_HEIGHT = 400;
	public static final int SQUARE_SIZE = 10;
	public static final int PAUSE = 10; // milliseconds

	private JPanel box;

	public static void main(String[] args) 
	{
		MultiThreaded2 gui = new MultiThreaded2();
		gui.setVisible(true);
	}

	public MultiThreaded2() 
	{
		setSize(WIDTH, HEIGHT);
		setTitle("Threaded Fill Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		box = new JPanel();
		add(box, BorderLayout.CENTER);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());

		JButton startButton = new JButton("Start");
		startButton.addActionListener(this);
		buttonPanel.add(startButton);

		JButton stopButton = new JButton("Stop");
		stopButton.addActionListener(this);
		buttonPanel.add(stopButton);
		add(buttonPanel, BorderLayout.SOUTH);
	}
	
	public void run() 
	{
		Graphics g = box.getGraphics();

		int count = 0;

		for (int y = 0; y < FILL_HEIGHT; y = y + SQUARE_SIZE) 
		{
			for (int x = 0; x < FILL_WIDTH; x = x + SQUARE_SIZE) 
			{

				if (count % 2 == 0) {
					g.setColor(Color.yellow);
					g.fillRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
				}
				else if (count % 7 == 0) {
					g.setColor(Color.black);
					g.fillRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
				}
				else if (count % 5 == 0) {
					g.setColor(Color.red);
					g.fillRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
				}
				else if (count % 13 == 0) {
					g.setColor(Color.magenta);
					g.fillRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
				}
				else if (count % 9 == 0) {
					g.setColor(Color.blue);
					g.fillRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
				}
				else 
				{
					g.setColor(Color.green);
					g.fillRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
				}
				try {
					Thread.sleep(PAUSE);
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				count++;
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getActionCommand().equals("Start")) 
		{
			Thread threads = new Thread(this);
			threads.start();
		} 
		else if (e.getActionCommand().equals("Stop")) 
		{
			System.exit(0);
		}
	}
	
}

