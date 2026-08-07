package Practicoll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventanaP extends JFrame {

	public ventanaP() {

		this.setTitle("Registrar Usuario"); // Establece titulo de ventana
		this.setSize(270, 250); // Tamaño en px, primero ancho luego largo
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // accion default al cerrar
		this.setLocationRelativeTo(null); // Posicion en la que inicia la ventana
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel.setLayout(new FlowLayout());
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label1 = new JLabel("Nombre");
		JLabel label2 = new JLabel("Apellido");
		JLabel label3 = new JLabel("Cedula  ");
		JLabel label4 = new JLabel("Edad      ");
		JLabel label5 = new JLabel("  Rol     ");
		
		JTextField campo1 = new JTextField(15);
		JTextField campo2 = new JTextField(15);
		JTextField campo3 = new JTextField(15);
		JTextField campo4 = new JTextField(15);
		
		panel.setPreferredSize(new Dimension(250, 150));
		panel2.setPreferredSize(new Dimension(250, 150));
		
		String[] opciones = { "Propietario", "Encargado", "Cocinero", "Mozo" };
		
		JComboBox combo = new JComboBox(opciones);
		
		combo.setPreferredSize(new Dimension(180, 20));
		
		JButton boton1 = new JButton("Registrar");
		
		
		
		this.add(panel);
		this.add(panel2);
		
		
		panel.add(label1);
		panel.add(campo1);
		panel.add(label2);
		panel.add(campo2);
		panel.add(label3);
		panel.add(campo3);
		panel.add(label4);
		panel.add(campo4);
		panel.add(label5);
		panel.add(combo);
		panel2.add(boton1);
		
		//panel.setBackground(Color.blue);
		//panel2.setBackground(Color.gray);
		
	}
	

}
