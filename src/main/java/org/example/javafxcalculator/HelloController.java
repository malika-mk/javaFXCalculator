package org.example.javafxcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField display;

    private Calculator calculator = new Calculator();
    private StringBuilder input = new StringBuilder();
    private boolean newCalculation = true;

    // Method to handle digit button clicks
    @FXML
    private void onDigitButtonClicked(ActionEvent event) {
        Button button = (Button) event.getSource();  // Get the button that was clicked
        String digit = button.getText();  // Get the text (digit) from the button
        if (newCalculation) {
            input.setLength(0);  // Clear input if it's a new calculation
            newCalculation = false;
        }
        input.append(digit);  // Append the digit to the input
        display.setText(input.toString());  // Display the updated input
    }

    // Method to handle operator button clicks (+, -, *, /)
    @FXML
    private void onOperatorButtonClicked(ActionEvent event) {
        Button button = (Button) event.getSource();  // Get the operator button clicked
        char operator = button.getText().charAt(0);  // Get the operator from the button text
        calculator.setOperand1(Double.parseDouble(display.getText()));  // Set the first operand
        calculator.setOperator(operator);  // Set the operator in the calculator
        input.setLength(0);  // Clear the input for the next number
        display.setText("");  // Clear the display
    }

    // Method to handle the equals button click (=)
    @FXML
    private void onEqualsButtonClicked(ActionEvent event) {
        calculator.setOperand2(Double.parseDouble(display.getText()));  // Set the second operand
        calculator.calculate();  // Perform the calculation
        if (calculator.isError()) {
            display.setText("Error");  // Handle error cases, like division by zero
        } else {
            display.setText(String.valueOf(calculator.getResult()));  // Display the result
        }
        newCalculation = true;  // Mark the calculation as complete
    }

    // Method to handle the clear button click (C)
    @FXML
    private void onClearButtonClicked(ActionEvent event) {
        calculator.reset();  // Reset the calculator
        display.setText("");  // Clear the display
        input.setLength(0);  // Clear the input
    }
}
