import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MathsSoft
{
	static JButton primecheck = new JButton("CHECK");
	static JButton primerangeprint = new JButton("PRINT");
	static JButton powercheck = new JButton("CHECK");
	static JButton powerrangeprint = new JButton("PRINT");
	static JButton tableprint = new JButton("PRINT");
	static JButton factcheck = new JButton("CHECK");
	static JButton factprint = new JButton("PRINT");
	static JTextArea output = new JTextArea();
	static JTextField primeonetext = new JTextField();
	static JTextField primerangestarttext = new JTextField();
	static JTextField primerangeendtext = new JTextField();
	static JTextField poweronetext = new JTextField();
	static JTextField poweronetext2 = new JTextField();
	static JTextField powerrangestarttext = new JTextField();
	static JTextField powerrangeendtext = new JTextField();
	static JTextField powerrangevaltext =  new JTextField();
	static JTextField tablenumtext = new JTextField();
	static JTextField factonetext = new JTextField();
	static JTextField factrangestarttext = new JTextField();
	static JTextField factrangeendtext = new JTextField();
	static JButton reset = new JButton("RESET");
	
	public static void main(String[] args)
	{
		//DESIGNING AREA
		
		JFrame frame = new JFrame();
		JPanel outputpanel = new JPanel();
		JPanel outputmsg = new JPanel();
		JLabel msg = new JLabel("OUTPUT WINDOW");
		JPanel primePanel = new JPanel();
		JPanel primeheader = new JPanel();
		JLabel primelabel = new JLabel("PRIME NUMBER");
		JPanel primeone = new JPanel();
		JLabel primeonelabel = new JLabel("Enter number : ");
		JPanel primerange = new JPanel();
		JLabel primerangestart = new JLabel("Enter starting range : ");
		JLabel primerangeend = new JLabel("Enter ending range : ");
		JPanel powerpanel = new JPanel();
		JPanel powerheader = new JPanel();
		JLabel powerlabel = new JLabel("POWER OF A NUMBER");
		JPanel powerone = new JPanel();
		JLabel powernum = new JLabel("Enter number : ");
		JLabel powerval = new JLabel("Enter power : ");
		JPanel powerrange = new JPanel();
		JLabel powerrangestart = new JLabel("Enter starting range : ");
		JLabel powerrangeend = new JLabel("Enter ending range : ");
		JLabel powerrangeval = new JLabel("Enter power : ");
		JPanel tablepanel = new JPanel();
		JPanel tableheader = new JPanel();
		JLabel tablelable = new JLabel("TABLE OF A NUMBER ");
		JLabel tablenum = new JLabel("Enter number :");
		JPanel factpanel = new JPanel();
		JPanel factheader = new JPanel();
		JLabel factlable = new JLabel("     FACTORIAL");
		JPanel factone = new JPanel();
		JLabel factonelable = new JLabel("Enter number : ");
		JPanel factrange = new JPanel();
		JLabel factrangestart = new JLabel("Enter starting range : ");
		JLabel factrangeend = new JLabel("Enter ending range : ");
		
		frame.setVisible(true);
		frame.setBounds(50,10,1288,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cntr = frame.getContentPane();
		cntr.setLayout(null);
		
		cntr.add(outputpanel);
		outputpanel.setBounds(460,15,350,635);
		outputpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		outputpanel.setLayout(null);
		
		outputpanel.add(outputmsg);
		outputmsg.setBounds(25,5,300,50);
		outputmsg.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		outputmsg.setLayout(null);
		
		outputpanel.add(output);
		output.setBounds(25,65,300,500);
		output.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		outputpanel.add(reset);
		reset.setBounds(100,575,150,50);
		Font f = new Font("Times New Roman",Font.BOLD,25);
		reset.setFont(f);
		
		msg.setFont(f);
		outputmsg.add(msg);
		msg.setBounds(35,7,240,30);
	
		cntr.add(primePanel);
		primePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		primePanel.setBounds(10,15,435,200);
		primePanel.setLayout(null);
		
		primePanel.add(primeheader);
		primeheader.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		primeheader.setBounds(75,5,235,30);
		primeheader.setLayout(null);
		
		primelabel.setFont(f);
		primeheader.add(primelabel);
		primelabel.setBounds(20,5,250,20);
		
		Font f2 = new Font("Times New Roman",Font.BOLD,16);
		
		primePanel.add(primeone);
		primeone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		primeone.setBounds(10,40,415,50);
		primeone.setLayout(null);
		
		primeone.add(primeonelabel);
		primeonelabel.setBounds(5,10,135,20);
		Font f3 = new Font("Times New Roman",Font.BOLD,20);
		primeonelabel.setFont(f3);
		
		primeone.add(primeonetext);
		primeonetext.setBounds(140,10,150,25);
		
		primeone.add(primecheck);
		primecheck.setFont(f2);
		primecheck.setBounds(320,10,90,25);
		
		primePanel.add(primerange);
		primerange.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		primerange.setBounds(10,100,415,85);
		primerange.setLayout(null);
		
		primerange.add(primerangestart);
		primerangestart.setBounds(5,5,190,25);
		primerangestart.setFont(f3);
		
		primerange.add(primerangestarttext);
		primerangestarttext.setBounds(190,5,120,25);
		
		primerange.add(primerangeend);
		primerangeend.setBounds(5,50,190,25);
		primerangeend.setFont(f3);
		
		primerange.add(primerangeendtext);
		primerangeendtext.setBounds(190,50,120,25);
		
		primerange.add(primerangeprint);
		primerangeprint.setBounds(320,20,90,30);
		primerangeprint.setFont(f2);
		
		cntr.add(powerpanel);
		powerpanel.setLayout(null);
		powerpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		powerpanel.setBounds(10,230,435,275);
		
		powerpanel.add(powerheader);
		powerheader.setLayout(null);
		powerheader.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		powerheader.setBounds(50,5,300,30);
		
		powerheader.add(powerlabel);
		powerlabel.setFont(f);
		powerlabel.setBounds(5,0,280,30);
		
		powerpanel.add(powerone);
		powerone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		powerone.setBounds(10,45,415,75);
		powerone.setLayout(null);
		
		powerone.add(powernum);
		powernum.setFont(f3);
		powernum.setBounds(5,5,135,20);
		
		powerone.add(poweronetext);
		poweronetext.setBounds(140,5,150,25);
		
		powerone.add(powerval);
		powerval.setBounds(5,35,135,20);
		powerval.setFont(f3);
		
		powerone.add(poweronetext2);
		poweronetext2.setBounds(140,35,150,25);
		
		powerone.add(powercheck);
		powercheck.setBounds(320,18,90,25);
		powercheck.setFont(f2);
		
		powerpanel.add(powerrange);
		powerrange.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		powerrange.setBounds(10,130,415,125);
		powerrange.setLayout(null);
		
		powerrange.add(powerrangestart);
		powerrangestart.setFont(f3);
		powerrangestart.setBounds(5,5,190,25);
		
		powerrange.add(powerrangestarttext);
		powerrangestarttext.setBounds(190,5,120,25);
		
		powerrange.add(powerrangeend);
		powerrangeend.setFont(f3);
		powerrangeend.setBounds(5,50,190,25);
		
		powerrange.add(powerrangeendtext);
		powerrangeendtext.setBounds(190,50,120,25);
		
		powerrange.add(powerrangeval);
		powerrangeval.setBounds(5,85,190,25);
		powerrangeval.setFont(f3);
		
		powerrange.add(powerrangevaltext);
		powerrangevaltext.setBounds(190,85,120,25);
		
		powerrange.add(powerrangeprint);
		powerrangeprint.setBounds(320,20,90,30);
		powerrangeprint.setFont(f2);
		
		cntr.add(tablepanel);
		tablepanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tablepanel.setBounds(10,520,435,125);
		tablepanel.setLayout(null);
		
		tablepanel.add(tableheader);
		tableheader.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tableheader.setBounds(40,5,330,30);
		tableheader.setLayout(null);
		
		tableheader.add(tablelable);
		tablelable.setBounds(30,5,300,20);
		tablelable.setFont(f);
		
		tablepanel.add(tablenum);
		tablenum.setBounds(10,50,150,25);
		tablenum.setFont(f3);
		
		tablepanel.add(tablenumtext);
		tablenumtext.setBounds(150,55,150,25);
		
		tablepanel.add(tableprint);
		tableprint.setBounds(320,50,90,30);
		tableprint.setFont(f2);
		
		cntr.add(factpanel);
		factpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		factpanel.setBounds(825,15,435,200);
		factpanel.setLayout(null);
		
		factpanel.add(factheader);
		factheader.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		factheader.setBounds(95,5,235,30);
		factheader.setLayout(null);
		
		factheader.add(factlable);
		factlable.setBounds(20,5,250,20);
		factlable.setFont(f);
		
		factpanel.add(factone);
		factone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		factone.setBounds(10,40,415,50);
		factone.setLayout(null);
		
		factone.add(factonelable);
		factonelable.setFont(f3);
		factonelable.setBounds(5,10,135,20);
		
		factone.add(factonetext);
		factonetext.setBounds(140,10,150,25);
		
		factone.add(factcheck);
		factcheck.setBounds(320,10,90,25);
		factcheck.setFont(f2);
		
		factpanel.add(factrange);
		factrange.setLayout(null);
		factrange.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		factrange.setBounds(10,100,415,85);
		
		factrange.add(factrangestart);
		factrangestart.setBounds(5,5,190,25);
		factrangestart.setFont(f3);
		
		factrange.add(factrangestarttext);
		factrangestarttext.setBounds(190,5,120,25);
		
		factrange.add(factrangeend);
		factrangeend.setFont(f3);
		factrangeend.setBounds(5,50,190,25);
		
		factrange.add(factrangeendtext);
		factrangeendtext.setBounds(190,50,120,25);
		
		factrange.add(factprint);
		factprint.setFont(f2);
		factprint.setBounds(320,20,90,30);
		
		//DEVLOPING AREA
		
		primecheck.addActionListener(new ActionListener() //primecheck action 
			{
				public void actionPerformed(ActionEvent event)
				{
					primecheck_action(event);
				}
			}
		);
		
		primerangeprint.addActionListener(new ActionListener() //primeprint
			{
				
				public void actionPerformed(ActionEvent event)
				{
					Primerangeprint_action(event);
				}
			}
		);
		
		powercheck.addActionListener(new ActionListener() //powercheck
			{
				
				public void actionPerformed(ActionEvent event)
				{
					powercheck_action(event);
				}
			}
		);
		
		powerrangeprint.addActionListener(new ActionListener() //powerprint
		{
			public void actionPerformed(ActionEvent event)
			{
					powerrangeprint_action(event);
			}
		}
		);
		
		tableprint.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					tableprint_action(event);
				}
			}
		);
		
		factcheck.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					factcheck_action(event);
				}
			}
		);
		
		factprint.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					factprint_action(event);
				}
			}
		);
		
		reset.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					reset_action(event);
				}
			}
		);
	}
	
	public static void primecheck_action(ActionEvent event)
	{
		String primestr = primeonetext.getText();
		
		int num = Integer.parseInt(primestr);
		
		int flag=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag++;
				
				output.setText(output.getText()+" "+num+" is divided by "+i+"\n");
			}
		}
		
		if(flag==0)
		{
			output.setText(num+" is a prime number");
		}
		
		else
		{
			output.setText(output.getText()+" "+num+" is not a prime number");
		}
	}
	
	public static void Primerangeprint_action(ActionEvent event)
	{
		
		String primestr1 = primerangestarttext.getText();
		String primestr2 = primerangeendtext.getText();
		
		int start = Integer.parseInt(primestr1);
		int end = Integer.parseInt(primestr2);
		int count = 0 ;
		
		int flag=0;
		int j=0;
		int i=0;
		int space=0;
		
		output.setText("Prime numbers from "+start+" to "+end+" are following : \n");
		
		for(j=start;j<=end;j++)
		{
			flag=0;
			for(i=2;i<j;i++)
			{
				if(j%i==0)
				{
					flag++;
				}
			}
			
			if(flag==0)
			{
				count++;
				output.setText(output.getText()+" "+j+"\t");
				space++;
				if(space>4)
				{
					output.setText(output.getText()+"\n");
					space=0;
				}
			}
			
			
		}
		output.setText(output.getText()+"\n There are "+count+" prime numbers from "+start+" to "+end);
	}
	
	public static void powercheck_action(ActionEvent event)
	{
		String powerstr1 = poweronetext.getText();
		String powerstr2 = poweronetext2.getText();
		
		int base = Integer.parseInt(powerstr1);
		int exp = Integer.parseInt(powerstr2);
		
		output.setText(base+" raised to power "+exp+" is "+Math.pow(base,exp));
	}
	
	public static  void powerrangeprint_action(ActionEvent event)
	{
		String powerrangestr1 = powerrangestarttext.getText();
		String powerrangestr2 = powerrangeendtext.getText();
		String powerrangestr3 = powerrangevaltext.getText();
		
		int num1 = Integer.parseInt(powerrangestr1);
		int num2 = Integer.parseInt(powerrangestr2);
		int num3 = Integer.parseInt(powerrangestr3);
		
		for(int i=num1;i<=num2;i++)
		{
			output.setText(output.getText()+" "+i+" raised to power "+num3+" is "+Math.pow(i,num3)+"\n");
		}
	}
	
	public static void tableprint_action(ActionEvent event)
	{
		String tablestr = tablenumtext.getText();
		int num = Integer.parseInt(tablestr);
		
		for(int i=1;i<11;i++)
		{
			output.setText(output.getText()+"\n"+num+" * "+i+" = "+(num*i));
		}
	}
	
	public static void factcheck_action(ActionEvent event)
	{
		String factstr = factonetext.getText();
		
		int num = Integer.parseInt(factstr);
		
		int fact=1;
		
		for(int i=num;i>=1;i--)
		{
			fact = fact*i;
			
		}
		output.setText(output.getText()+" \nFactorial of "+num+" is "+fact);
	}
	
	public static void factprint_action(ActionEvent event)
	{
		String factstart = factrangestarttext.getText();
		String factend = factrangeendtext.getText();
		
		int start = Integer.parseInt(factstart);
		int end = Integer.parseInt(factend);
		
		for(int j=start;j<=end;j++)
		{
			int fact=1;
		
			for(int i=j;i>=1;i--)
			{
				fact = fact*i;
			}
			
			output.setText(output.getText()+" \nFactorial of "+j+" is "+fact);
		}
	}
	
	public static void reset_action(ActionEvent event)
	{
		 primeonetext.setText("");
		 primerangestarttext.setText("");
		 primerangeendtext.setText("");
		 poweronetext.setText(""); 
		 poweronetext2.setText(""); 
		 powerrangestarttext.setText(""); 
		 powerrangeendtext.setText(""); 
		 powerrangevaltext.setText("");
		 tablenumtext.setText(""); 
		 factonetext.setText("");
		 factrangestarttext.setText("");
		 factrangeendtext.setText("");
		 output.setText("");
	}
}