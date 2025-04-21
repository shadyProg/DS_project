# Infix to Postfix Converter

This project implements an **Infix to Postfix Expression Converter** in Java. It takes a mathematical expression in infix notation (e.g., `A + B * C`) and converts it into postfix notation (e.g., `A B C * +`) using a stack-based approach.

## Features

- **Tokenization**: Splits the input expression into tokens (operands, operators, and parentheses).
- **Operator Precedence Handling**: Correctly handles operator precedence and associativity.
- **Parentheses Support**: Processes expressions with nested parentheses.
- **Custom Stack Implementation**: Uses a linked-list-based stack (`StackLL`) for flexibility.

## Folder Structure

- `src`: Contains the source code for the project.
- `lib`: Contains any external dependencies (if applicable).
- `bin`: Stores compiled output files (generated automatically).

## How It Works

1. The input expression is tokenized using the `Token` class.
2. The `infixToPostfix` class processes the tokens using a stack to convert the expression to postfix notation.
3. The result is displayed as a postfix expression.

## Usage

1. Clone the repository.
2. Open the project in your favorite Java IDE (e.g., VS Code).
3. Run the `infixToPostfix` class with your input expression.

## Example

Input:  
`23 + 5 * ( 7 - 9 )`

Output:  
`23 5 7 9 - * +`

## Dependencies

- Java Development Kit (JDK) 8 or higher.

## Contributing

Feel free to fork this repository and submit pull requests for improvements or bug fixes.

## License

This project is open-source and available under the [MIT License](LICENSE).
