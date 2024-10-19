# javaFXCalculator

How to Use the Calculator
Once the application is running, here’s how you can use it:

Enter Numbers:
Use the number buttons (0-9) to input numbers. The numbers will be displayed in the TextField (display) at the top.
Perform Operations:
Click one of the operator buttons (+, -, x, /) after entering a number. This will prepare the calculator for the next input.
Example: To calculate 5 + 3, press 5, then +, then 3.
Get Results:
After entering the second number, press the = button. The result will be displayed in the TextField.
Clear Display:
To reset the calculator, click the C (Clear) button, which will reset the display to 0.

Special Instructions
Ensure the Correct JavaFX Version:
Ensure that you have JavaFX properly configured. If using Maven, it will automatically pull the required dependencies.
JavaFX SDK should match the version in your pom.xml. For example, if you are using JavaFX 22, ensure the JavaFX libraries in your classpath are version 22.
Handling Zero Division:
The calculator should display an Error message if you try to divide by zero (e.g., 5 / 0). This prevents crashes.
Supported Operations:
The current version supports addition, subtraction, multiplication, and division. Any other operations will need to be implemented.

Known Issues
Display Overflow:
If the result is too long to fit in the display, the number may not be fully visible. You could fix this by adjusting the size of the display field or limiting the number of digits shown.
No Decimal Support:
The calculator currently doesn’t handle decimal numbers. If you press the decimal button (e.g., , or .), it might not work as expected. You can add support for floating-point numbers by adjusting the input logic.
No Operator Chaining:
Currently, if you want to chain operations (e.g., 5 + 3 - 2), you need to press = after each operation. This can be improved by modifying the calculation logic to store multiple operations.
Clear Button Doesn't Fully Reset:
If pressing the C (Clear) button only clears the display but doesn’t reset internal values (like firstOperand or currentOperator), the next operation might behave unexpectedly. This can be fixed by ensuring C resets all variables.


![Image alt](https://github.com/malika-mk/javaFXCalculator/blob/main/Снимок%20экрана%202024-10-19%20в%2016.29.11.png)
![Image alt](https://github.com/malika-mk/javaFXCalculator/blob/main/Снимок%20экрана%202024-10-19%20в%2016.29.23.png)
![Image alt](https://github.com/malika-mk/javaFXCalculator/blob/main/Снимок%20экрана%202024-10-19%20в%2016.29.33.png)
![Image alt](https://github.com/malika-mk/javaFXCalculator/blob/main/Снимок%20экрана%202024-10-19%20в%2016.29.56.png)
![Image alt](https://github.com/malika-mk/javaFXCalculator/blob/main/Снимок%20экрана%202024-10-19%20в%2016.30.07.png)
![Image alt](https://github.com/malika-mk/javaFXCalculator/blob/main/Снимок%20экрана%202024-10-19%20в%2016.30.11.png)
![Image alt](https://github.com/malika-mk/javaFXCalculator/blob/main/Снимок%20экрана%202024-10-19%20в%2016.30.58.png)
![Image alt](https://github.com/malika-mk/javaFXCalculator/blob/main/Снимок%20экрана%202024-10-19%20в%2016.31.06.png)
![Image alt](https://github.com/malika-mk/javaFXCalculator/blob/main/Снимок%20экрана%202024-10-19%20в%2016.31.10.png)
![Image alt](https://github.com/malika-mk/javaFXCalculator/blob/main/Снимок%20экрана%202024-10-19%20в%2016.31.22.png)
![Image alt](https://github.com/malika-mk/javaFXCalculator/blob/main/Снимок%20экрана%202024-10-19%20в%2016.40.20.png)
![Image alt](https://github.com/malika-mk/javaFXCalculator/blob/main/Снимок%20экрана%202024-10-19%20в%2016.31.29.png)
![Image alt](https://github.com/{username}/{repository}/raw/{branch}/{path}/image.png)
