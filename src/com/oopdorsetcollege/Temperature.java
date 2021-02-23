//Alessandra Silva dos Reis - ID 21565

package com.oopdorsetcollege;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Temperature extends JFrame {

    JButton FahrToCelsius;
    JButton CelsiusToFahr;
    JLabel lblCelsius;
    JLabel lblFahr;
    JTextField textCelsius;
    JTextField textFahrenheit;

    public Temperature () {

        super ("Convert Temperature");
        setLayout (new FlowLayout ());

        lblCelsius = new JLabel ("Celsius: ", SwingConstants.CENTER);
        add (lblCelsius);
        textCelsius = new JTextField (10);
        add (textCelsius);

        lblFahr = new JLabel ("Fahrenheit: ", SwingConstants.CENTER);
        add (lblFahr);
        textFahrenheit = new JTextField (10);
        add (textFahrenheit);

        CelsiusToFahr = new JButton ("Celsius to Fahrenheit");
        add (CelsiusToFahr);
        FahrToCelsius = new JButton ("Fahrenheit to Celsius");
        add (FahrToCelsius);

        JPanel panel = new JPanel(new GridLayout(2, 2, 30, 15));
        panel.add(lblCelsius);
        panel.add(lblFahr);
        panel.add(textCelsius);
        panel.add(textFahrenheit);
        add(panel, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(CelsiusToFahr);
        buttonPanel.add(FahrToCelsius);
        add(buttonPanel, BorderLayout.SOUTH);

        CelsiusToFahr.addActionListener(new CelsiusListener ());
        FahrToCelsius.addActionListener(new FahrenheitListener ());

    }

        private class CelsiusListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == CelsiusToFahr){
                int CelsiusToFahr = (int) (( 9.0/5.0 * (((Double.parseDouble(textCelsius.getText())) + 32))));
                textFahrenheit.setText(CelsiusToFahr + " °F");
                textCelsius.requestFocus();
                textCelsius.selectAll();
            }

        }
    }

    private class FahrenheitListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == FahrToCelsius){
                int FahrToCelsius = (int) ((5.0/9.0 * (((Double.parseDouble(textFahrenheit.getText())) -32))));
                textCelsius.setText(FahrToCelsius + " °C");
                textFahrenheit.requestFocus();
                textFahrenheit.selectAll();
            }

        }
    }

}

