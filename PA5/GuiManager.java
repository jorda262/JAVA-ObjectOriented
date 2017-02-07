package pa5;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GuiManager extends JFrame implements ActionListener
{
	private ArrayList<Item>arrayList = new ArrayList<Item>();
	private JTextArea textArea;
	private JTextField enterField, uidField, nameField, descriptionField, priceField;
	private JPanel main, topPanel, centerPanel, bottomPanel;
	private JButton search, create, display, delete;
	private JLabel blank1, blank2, enter, uid, name, description, price;
	
	
	public GuiManager()
	{
		super("Shopping List");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new GridLayout(2,1));
	   
	    initializeValues();
	   
	    search.addActionListener(this);
	    create.addActionListener(this);
	    display.addActionListener(this);
	    delete.addActionListener(this);
	    
	    this.add(main);
	    JScrollPane scrollPane = new JScrollPane(textArea);
	    this.add(scrollPane);
	    
	}
	
	public void initializeValues()
	{
		  //panels
	    topPanel = new JPanel(new FlowLayout());
	    centerPanel = new JPanel(new GridLayout(4,2));
	    bottomPanel = new JPanel(new GridLayout(1,5));
	    main = new JPanel(new BorderLayout());
	    
	    //buttons
	    search = new JButton("Search");
	    create = new JButton("Create");
	    display = new JButton("Display");
	    delete = new JButton("Delete");
	   
	    
	    //labels
	    blank1 = new JLabel("");
	    blank2 = new JLabel("");
	    enter = new JLabel("Enter Item's Name: ");
	    uid = new JLabel("UID");
	    name = new JLabel("Name");
	    description = new JLabel("Description");
	    price = new JLabel ("Price");
	    
	    //text fields set up
	    enterField = new JTextField(15);
	    uidField = new JTextField();
	    nameField = new JTextField();
	    descriptionField = new JTextField();
	    priceField = new JTextField();
	    
	   
	    //create and display text area with output border
	    textArea = new JTextArea();
	    Border border = BorderFactory.createTitledBorder("Output");
	    textArea.setBorder(border);
	    textArea.setEditable(false);
	    
	    //top panel set up
	    topPanel.add(enter);
	    topPanel.add(enterField);
	    topPanel.add(search);
	    
	    //center panel setup
	    centerPanel.add(uid);
	    centerPanel.add(uidField);
	    centerPanel.add(name);
	    centerPanel.add(nameField);
	    centerPanel.add(description);
	    centerPanel.add(descriptionField);
	    centerPanel.add(price);
	    centerPanel.add(priceField);
	    
	    //bottom panel set up
	    bottomPanel.add(blank1);
	    bottomPanel.add(create);
	    bottomPanel.add(display);
	    bottomPanel.add(delete);
	    bottomPanel.add(blank2);
	    
	    //main panel setup
	    main.add(topPanel,BorderLayout.NORTH);
	    main.add(centerPanel,BorderLayout.CENTER);
	    main.add(bottomPanel,BorderLayout.SOUTH);
	}
	
	public void search(String name){
		int count = 0;
		for(int i = 0 ; i < arrayList.size(); i++)
		{
			Item temp = arrayList.get(i);
			if(temp.getName().compareToIgnoreCase(name) == 0)
			{
				uidField.setText("" + temp.getUID());
				nameField.setText(temp.getName());
				descriptionField.setText(temp.getDescription());
				priceField.setText("" + temp.getPrice());
				textArea.setText(textArea.getText().concat("Item: [" + name + "] found\n"));
				
				count++;
			}	
		}
		if(count == 0)
		{
			textArea.append("Item doesn't exist.\n");
		}
	}
	public void create()
	{
		int uid = Integer.parseInt(uidField.getText());
		String name = nameField.getText();
		String description = descriptionField.getText();
		double price = Double.parseDouble(priceField.getText());
		arrayList.add(new Item(name, uid, description, price));
		textArea.setText(textArea.getText().concat("Item: [" + name + "] added successfully\n"));
		enterField.setText("");
		uidField.setText("");
		nameField.setText("");
		descriptionField.setText("");
		priceField.setText("");
	}
	
	public void delete()
	{
		int count = 0;
		for(int i = 0; i < arrayList.size(); i++)
		{
			if(arrayList.get(i).getName().equalsIgnoreCase(enterField.getText()))
			{
				arrayList.remove(i);
				textArea.setText(textArea.getText().concat("Item deleted successfully\n"));
				enterField.setText("");
				uidField.setText("");
				nameField.setText("");
				descriptionField.setText("");
				priceField.setText("");
				count++;
			}
		}
		if(count == 0)
		{
			textArea.append("Item doesn't exist\n");
		}
	}
	public void display()
	{
		textArea.setText("UID\tName\tDescription\tPrice\n");
		for (int i = 0; i < arrayList.size(); i++)
		{
			textArea.append(arrayList.get(i).toString() + "\n");
		}
		enterField.setText("");
		uidField.setText("");
		nameField.setText("");
		descriptionField.setText("");
		priceField.setText("");
	}
	
	public static void main(String[] args)
	{
		GuiManager frame = new GuiManager();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource().equals(search))
		{
			search(enterField.getText());
		}
		else if(e.getSource().equals(create))
		{
			create();
		}
		else if(e.getSource().equals(display))
		{
			Collections.sort(arrayList);
			display();
		}
		else if(e.getSource().equals(delete))
		{
			delete();
		}
	}
	
}