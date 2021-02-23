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
    public JTextField textOutput;
    public JButton btConversion;

    public Temperature() {

        super ("Temperature Conversion");

        setLayout(new FlowLayout());

        //Set colors
        Color colorBg = new Color(237,125,49);
        Color colorblue = new Color(68,114,196);
        getContentPane().setBackground(colorBg);

        // add checkboxes
        checkCelsius = new JCheckBox("Celsius");
        checkCelsius.setBackground(colorBg);
        add(checkCelsius);

        checkFahrenheit = new JCheckBox("Fahrenheit");
        checkFahrenheit.setBackground(colorBg);
        add(checkFahrenheit);

        //add text field to input information
        textInsert = new JTextField(20);
        textInsert.setBackground(colorblue);
        textInsert.setForeground(Color.WHITE);
        textInsert.setFont(new Font("Serif", Font.PLAIN, 15));
        add(textInsert);

        //add text field to output information
        textOutput = new JTextField(20);
        textOutput.setBackground(colorblue);
        textOutput.setForeground(Color.WHITE);
        textOutput.setFont(new Font("Serif", Font.PLAIN, 15));
        add(textOutput);

        //button to convert
        btConversion = new JButton("Conversion");
        btConversion.setBackground(colorblue);
        btConversion.setForeground(Color.WHITE);
        add(btConversion);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btConversion);
        add(buttonPanel, BorderLayout.SOUTH);

        /*JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.add(checkCelsius);
        panel.add(checkFahrenheit);
        panel.add(textInsert);
        panel.add(textOutput);
        add(panel, BorderLayout.SOUTH);*/

        btConversion.addActionListener(new ActionOne());
        btConversion.addActionListener(new ActionTwo());

    } // end constructor

    //function to calculate the conversion of celsius to fahrenheit
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

    //function to calculate the conversion of fahrenheit to celsius
    private class ActionTwo implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            if (checkFahrenheit.isSelected()) {
                int fahrToCelsius = (int) ((5.0 / 9.0 * (((Double.parseDouble(textInsert.getText())) - 32))));
                textOutput.setText(fahrToCelsius + " °C");
                textOutput.requestFocus();
                textOutput.selectAll();
            }
        }


    }

}
