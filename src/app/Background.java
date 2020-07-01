package app;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Background extends JFrame implements ActionListener{
	public JPanel panel;
	JButton boton1 = new JButton();
	JButton boton2 = new JButton();
	JButton boton3 = new JButton();
	Boton boton11 = new Boton();
	Boton boton12 = new Boton();
	Boton boton13 = new Boton();
 
	public Background () {
		this.setSize(500,500);
		this.getContentPane().setBackground(Color.white);
		init();
	}
	
	private void botones(){
		 boton1.setText("azul");
		 boton1.setBounds(100, 100, 100, 40);
		 panel.add(boton1);
		 boton2.setText("rojo");
		 boton2.setBounds(200, 100, 100, 40);
		 panel.add(boton2);
		 boton3.setText("amarillo");
		 boton3.setBounds(300, 100, 100, 40);
		 boton1.addActionListener(this);
		 boton2.addActionListener(this);
		 boton3.addActionListener(this);
		 panel.add(boton3);
	 }
	
	public void init() {
		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		botones();
	}
	
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		 if (e.getSource()== boton1) {
			 panel.setBackground(Color.blue);
			 boton11.setColor("blue");
		 }
		 if (e.getSource()== boton2) {
			 panel.setBackground(Color.red);
			 boton12.setColor("blue");
		 }
		 if (e.getSource()== boton3) {
			 panel.setBackground(Color.yellow);
			 boton13.setColor("blue");
		 }
	}
}