# Java Calculator App

## Overview
This is a simple calculator application built using Java AWT (Abstract Window Toolkit). The calculator provides basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Features
- **Addition (+)**
- **Subtraction (-)**
- **Multiplication (*)**
- **Division (/)**
- **Clear (C)**: Clears the current input.
- **Equals (=)**: Computes the result of the current expression.

## Technologies Used
- **Java AWT (Abstract Window Toolkit)**: For building the GUI.
- **Java Event Handling**: For managing user interactions with the buttons.

## Demo Video
[Download Project Demo Video](Demo.mp4)

## Code Explanation
## GUI Components 
- TextField display: Displays the input and result.
- Buttons: For digits (0-9), operations (+, -, *, /), equals (=), and clear (C).

## Event Handling
- Each button triggers an ActionEvent, which is handled using the actionPerformed method. Based on the source of the event (the button clicked), the corresponding action (such as appending a number or operator) is performed.

## Expression Evaluation
- The app parses the string from the display and evaluates it when the equals button is clicked. It extracts the numbers and operator from the expression and computes the result based on the operator.

## Code Walkthrough
The application is structured as follows:

- Main Class: The Calculator class extends the Frame class to create the GUI.
- Buttons: Each button (digits 0-9 and operators) is added to the frame. An action listener is attached to each button to handle click events.
- Display: A text field is used to show the current input and results. It is updated whenever a button is pressed.
- Event Handling: When a button is clicked, it triggers an ActionEvent. The event is handled by the actionPerformed method, where the text field is updated with the corresponding number or operator.
- Evaluation: The app uses basic string parsing to evaluate the arithmetic expression when the equals button is pressed. It splits the string by the operator and converts the operands from strings to integers for calculation.
## Future Enhancements
- Add more complex operations (e.g., square root, power).
- Implement error handling for invalid inputs (e.g., division by zero).
- Improve the UI design with more advanced layouts or frameworks like Swing.
