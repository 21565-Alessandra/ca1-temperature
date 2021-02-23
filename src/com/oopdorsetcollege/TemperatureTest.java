//Alessandra Silva dos Reis - ID 21565

/*package com.oopdorsetcollege;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class TemperatureTest extends JFrame {

    JButton fahrToCelsius;
    JButton celsiusToFahr;
    JLabel lblCelsius;
    JLabel lblFahr;
    JTextField textCelsius;
    JTextField textFahrenheit;

    public TemperatureTest () {

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

        celsiusToFahr = new JButton ("Celsius to Fahrenheit");
        add (celsiusToFahr);
        fahrToCelsius = new JButton ("Fahrenheit to Celsius");
        add (fahrToCelsius);

        JPanel panel = new JPanel(new GridLayout(2, 2, 30, 15));
        panel.add(lblCelsius);
        panel.add(lblFahr);
        panel.add(textCelsius);
        panel.add(textFahrenheit);
        add(panel, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(celsiusToFahr);
        buttonPanel.add(fahrToCelsius);
        add(buttonPanel, BorderLayout.SOUTH);

        celsiusToFahr.addActionListener(new CelsiusListener ());
        fahrToCelsius.addActionListener(new FahrenheitListener ());


    }

        public class CelsiusListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == celsiusToFahr){
                int celsiusToFahr = (int) (( 9.0/5.0 * (((Double.parseDouble(textCelsius.getText())) + 32))));
                textFahrenheit.setText(celsiusToFahr + " °F");
                textCelsius.requestFocus();
                textCelsius.selectAll();
            }

        }
    }

    private class FahrenheitListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == fahrToCelsius){
                int fahrToCelsius = (int) ((5.0/9.0 * (((Double.parseDouble(textFahrenheit.getText())) -32))));
                textCelsius.setText(fahrToCelsius + " °C");
                textFahrenheit.requestFocus();
                textFahrenheit.selectAll();
            }

        }
    }

}*/

