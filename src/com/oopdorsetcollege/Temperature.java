//Alessandra Silva dos Reis - ID 21565

package com.oopdorsetcollege;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature extends JFrame {

    public JCheckBox checkCelsius;
    public JCheckBox checkFahrenheit;
    public JTextField textInsert;
    public JTextField textOutput; //private JLabel labelOutput
    public JButton btConversion;

    public Temperature() {

        super("Temperature Conversion");


        setLayout(new FlowLayout());

        // add checkboxes
        checkCelsius = new JCheckBox("Celsius");
        checkFahrenheit = new JCheckBox("Fahrenheit");
        add(checkCelsius);
        add(checkFahrenheit);

        //add text field to input information
        textInsert = new JTextField(20);
        textInsert.setFont(new Font("Serif", Font.PLAIN, 15));
        add(textInsert);

        //add text field to output information
        textOutput = new JTextField(20);
        textOutput.setFont(new Font("Serif", Font.PLAIN, 15));
        add(textOutput);

        //button to convert
        btConversion = new JButton("Conversion");
        add(btConversion);


        JPanel panel = new JPanel(new GridLayout(3, 2, 12, 6));
        panel.add(checkCelsius);
        panel.add(checkFahrenheit);
        panel.add(textInsert);
        panel.add(textOutput);
        add(panel, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btConversion);
        add(buttonPanel, BorderLayout.SOUTH);

        //To organize the panel layout

        btConversion.addActionListener(new ActionOne());
        btConversion.addActionListener(new ActionTwo());

    } // end constructor


    private class ActionOne implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (checkCelsius.isSelected()) {
                int celsiusToFahr = (int) ((9.0 / 5.0 * (((Double.parseDouble(textInsert.getText())) + 32))));
                textOutput.setText(celsiusToFahr + " °F");
                textOutput.requestFocus();
                textOutput.selectAll();
            }


        }

    }

    private class ActionTwo implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            if (checkFahrenheit.isSelected()) {
                int fahrToCelsius = (int) ((5.0 / 9.0 * (((Double.parseDouble(textInsert.getText())) - 32))));
                textOutput.setText(fahrToCelsius + " °C");
                textOutput.requestFocus();
                textOutput.selectAll();
            }
        }

    /*private class CelListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == checkCelsius) {
                int celsiusToFahr = (int) ((9.0 / 5.0 * (((Double.parseDouble(textInsert.getText())) + 32))));
                textInsert.setText(celsiusToFahr + " °F");
                textOutput.requestFocus();
                textOutput.selectAll();
            }

        }
    }

    private class FahrListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == checkFahrenheit){
                int fahrToCelsius = (int) ((5.0/9.0 * (((Double.parseDouble(textInsert.getText())) -32))));
                textInsert.setText(fahrToCelsius + " °C");
                textOutput.requestFocus();
                textOutput.selectAll();
            }

        }
    }
*/

    }

}
