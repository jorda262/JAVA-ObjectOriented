import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener
{
	private JButton click;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JButton buttonStart;
	private JButton buttonStop;
	private JTextField text;
	
	public Calculator()
	{
		super("My Calculator");
		setSize(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2));
		JPanel eastPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		eastPanel.setLayout(new BorderLayout());
		buttonPanel.setLayout(new GridLayout(4,3));
		click = new JButton("Big Button");
		text = new JTextField();
		eastPanel.add(text, BorderLayout.NORTH);
		eastPanel.add(buttonPanel, BorderLayout.CENTER);
		button1 = new JButton("1");
		button1.addActionListener(this);
		button2 = new JButton("2");
		button2.addActionListener(this);
		button3 = new JButton("3");
		button3.addActionListener(this);
		button4 = new JButton("4");
		button4.addActionListener(this);
		button5 = new JButton("5");
		button5.addActionListener(this);
		button6 = new JButton("6");
		button6.addActionListener(this);
		button7 = new JButton("7");
		button7.addActionListener(this);
		button8 = new JButton("8");
		button8.addActionListener(this);
	    button9 = new JButton("9");
	    button9.addActionListener(this);
	    button0 = new JButton("0");
	    button0.addActionListener(this);
		buttonStart = new JButton("Start");
		buttonStop = new JButton("Stop");
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);
		buttonPanel.add(button0);
		buttonPanel.add(buttonStart);
		buttonPanel.add(buttonStop);
		add(click);
		add(eastPanel);
		setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button1)
		{
			text.setText(text.getText() + "1");
		}
		else if(e.getSource() == button2)
		{
			text.setText(text.getText() + "2");
		}
		else if(e.getSource() == button3)
		{
			text.setText(text.getText() + "3");
		}
		else if(e.getSource() == button4)
		{
			text.setText(text.getText() + "4");
		}
		else if(e.getSource() == button5)
		{
			text.setText(text.getText() + "5");
		}
		else if(e.getSource() == button6)
		{
			text.setText(text.getText() + "6");
		}
		else if(e.getSource() == button7)
		{
			text.setText(text.getText() + "7");
		}
		else if(e.getSource() == button8)
		{
			text.setText(text.getText() + "8");
		}
		else if(e.getSource() == button9)
		{
			text.setText(text.getText() + "9");
			
		}
		else if(e.getSource() == button0)
		{
			text.setText(text.getText() + "0");
		}
		
		
	}

	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		calculator.setVisible(true);
	}
}
