package br.com.empresa;

import javax.swing.*;

import br.com.empresa.lib.Calculadora;

import java.awt.*;
import java.awt.event.*;

public class FormCalculadora {

	public static void main(String[] args) {
		 JFrame frame = new JFrame("Test");
		  frame.setVisible(true);
		  frame.setSize(500,200);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		  JPanel panel = new JPanel();
		  frame.add(panel);
		  JButton button = new JButton("hello agin1");
		  panel.add(button);
		  button.addActionListener (new Action1());
		  
		  Calculadora calc = new Calculadora(100);
		  calc.Somar(50);
		  
		  JLabel label = new JLabel("Resultado: "+ calc.getResultado());		  
		  panel.add(label);       
		  

	}

	static class Action1 implements ActionListener {        
		  public void actionPerformed (ActionEvent e) {     
		           
		  }
		}   

}
