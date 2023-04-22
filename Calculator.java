import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator {

    private JFrame frame;
    private JTextField textField;
    private double FirstNumber;
    private double SecondNumber;
    private double Result;
    private String action;
    private String answer;
    private final ButtonGroup buttonGroup = new ButtonGroup();

    public Calculator() {
        initialize();
    }

    public double compute(double num1, double num2, String operation) throws CalculatorException {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new DivideByZeroException("Division by zero detected. Cannot divide by zero.");
                }
                return num1 / num2;
            default:
                throw new IllegalInputException("Invalid input detected. Please enter a valid expression.");
        }
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 371, 515);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setFont(new Font("Calibri", Font.BOLD, 32));
        textField.setBounds(10, 33, 334, 72);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + btn0.getText());
            }
        });
        btn0.setFont(new Font("Calibri", Font.BOLD, 22));
        btn0.setBounds(10, 403, 77, 54);
        frame.getContentPane().add(btn0);

        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + btn1.getText());
            }
        });
        btn1.setFont(new Font("Calibri", Font.BOLD, 22));
        btn1.setBounds(10, 339, 77, 54);
        frame.getContentPane().add(btn1);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + btn2.getText());
            }
        });
        btn2.setFont(new Font("Calibri", Font.BOLD, 22));
        btn2.setBounds(97, 339, 77, 54);
        frame.getContentPane().add(btn2);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + btn3.getText());
            }
        });
        btn3.setFont(new Font("Calibri", Font.BOLD, 22));
        btn3.setBounds(180, 339, 77, 54);
        frame.getContentPane().add(btn3);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + btn4.getText());
            }
        });
        btn4.setFont(new Font("Calibri", Font.BOLD, 22));
        btn4.setBounds(10, 275, 77, 54);
        frame.getContentPane().add(btn4);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + btn5.getText());
            }
        });
        btn5.setFont(new Font("Calibri", Font.BOLD, 22));
        btn5.setBounds(97, 275, 77, 54);
        frame.getContentPane().add(btn5);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + btn6.getText());
            }
        });
        btn6.setFont(new Font("Calibri", Font.BOLD, 22));
        btn6.setBounds(180, 275, 77, 54);
        frame.getContentPane().add(btn6);

        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + btn7.getText());
            }
        });
        btn7.setFont(new Font("Calibri", Font.BOLD, 22));
        btn7.setBounds(10, 211, 77, 54);
        frame.getContentPane().add(btn7);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + btn8.getText());
            }
        });
        btn8.setFont(new Font("Calibri", Font.BOLD, 22));
        btn8.setBounds(97, 211, 77, 54);
        frame.getContentPane().add(btn8);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + btn9.getText());
            }
        });
        btn9.setFont(new Font("Calibri", Font.BOLD, 22));
        btn9.setBounds(180, 211, 77, 54);
        frame.getContentPane().add(btn9);

        JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + btnDot.getText());
            }
        });
        btnDot.setFont(new Font("Calibri", Font.BOLD, 22));
        btnDot.setBounds(97, 403, 77, 54);
        frame.getContentPane().add(btnDot);

        JButton btnAdd = new JButton("+");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FirstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                action = "+";
            }
        });
        btnAdd.setFont(new Font("Calibri", Font.BOLD, 22));
        btnAdd.setBounds(267, 339, 77, 54);
        frame.getContentPane().add(btnAdd);

        JButton btnSub = new JButton("-");
        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FirstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                action = "-";
            }
        });
        btnSub.setFont(new Font("Calibri", Font.BOLD, 22));
        btnSub.setBounds(267, 275, 77, 54);
        frame.getContentPane().add(btnSub);

        JButton btnMult = new JButton("x");
        btnMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FirstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                action = "x";
            }
        });
        btnMult.setFont(new Font("Calibri", Font.BOLD, 22));
        btnMult.setBounds(267, 211, 77, 54);
        frame.getContentPane().add(btnMult);

        JButton btnDiv = new JButton("/");
        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FirstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                action = "/";
            }
        });
        btnDiv.setFont(new Font("Calibri", Font.BOLD, 22));
        btnDiv.setBounds(267, 147, 77, 54);
        frame.getContentPane().add(btnDiv);

        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SecondNumber = Double.parseDouble(textField.getText());

                try {
                    if (action == "+") {
                        Result = compute(FirstNumber, SecondNumber, action);
                        answer = String.format("%.1f + %.1f = %.2f", FirstNumber, SecondNumber, Result);
                        textField.setText(answer);
                    } else if (action == "-") {
                        Result = compute(FirstNumber, SecondNumber, action);
                        answer = String.format("%.1f - %.1f = %.2f", FirstNumber, SecondNumber, Result);
                        textField.setText(answer);
                    } else if (action == "x") {
                        Result = compute(FirstNumber, SecondNumber, action);
                        answer = String.format("%.1f x %.1f = %.2f", FirstNumber, SecondNumber, Result);
                        textField.setText(answer);
                    } else if (action == "/") {
                        Result = compute(FirstNumber, SecondNumber, action);
                        answer = String.format("%.1f / %.1f = %.2f", FirstNumber, SecondNumber, Result);
                        textField.setText(answer);
                    } else {
                        throw new IllegalInputException("Invalid input detected. Please enter a valid expression.");
                    }
                    FirstNumber = 0;
                    SecondNumber = 0;
                    action = "";

                } catch (CalculatorException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    textField.setText(null);
                    FirstNumber = 0;
                    SecondNumber = 0;
                    action = "";
                }

            }
        });
        btnEqual.setFont(new Font("Calibri", Font.BOLD, 22));
        btnEqual.setBounds(180, 403, 164, 54);
        frame.getContentPane().add(btnEqual);

        JButton btnDel = new JButton("Del");
        btnDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bck = null;
                if (textField.getText().length() > 0) {
                    StringBuilder str = new StringBuilder(textField.getText());
                    str.deleteCharAt(textField.getText().length() - 1);
                    bck = str.toString();
                    textField.setText(bck);
                }
            }
        });
        btnDel.setFont(new Font("Calibri", Font.BOLD, 22));
        btnDel.setBounds(97, 147, 77, 54);
        frame.getContentPane().add(btnDel);

        JButton btnC = new JButton("C");
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
                FirstNumber = 0;
                SecondNumber = 0;
                action = "";
                answer = "";
            }
        });
        btnC.setFont(new Font("Calibri", Font.BOLD, 22));
        btnC.setBounds(180, 147, 77, 54);
        frame.getContentPane().add(btnC);

        JRadioButton rdbtnON = new JRadioButton("ON");
        rdbtnON.setSelected(true);
        buttonGroup.add(rdbtnON);
        rdbtnON.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                btn0.setEnabled(true);
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                btnSub.setEnabled(true);
                btnMult.setEnabled(true);
                btnDiv.setEnabled(true);
                btnAdd.setEnabled(true);
                btnDel.setEnabled(true);
                btnC.setEnabled(true);
                btnDot.setEnabled(true);
                btnEqual.setEnabled(true);
                textField.setEnabled(true);
            }
        });
        rdbtnON.setBounds(20, 147, 52, 21);
        frame.getContentPane().add(rdbtnON);

        JRadioButton rdbtnOFF = new JRadioButton("OFF");
        buttonGroup.add(rdbtnOFF);
        rdbtnOFF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (answer.isEmpty()) {
                    btn0.setEnabled(false);
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);
                    btnSub.setEnabled(false);
                    btnMult.setEnabled(false);
                    btnDiv.setEnabled(false);
                    btnAdd.setEnabled(false);
                    btnDel.setEnabled(false);
                    btnC.setEnabled(false);
                    btnDot.setEnabled(false);
                    btnEqual.setEnabled(false);
                    textField.setText(null);
                    textField.setEnabled(false);
                } else {
                    rdbtnON.setSelected(true);
                    try {
                        throw new QuitException();
                    } catch (QuitException ex) {
                        JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        rdbtnOFF.setBounds(20, 170, 52, 21);
        frame.getContentPane().add(rdbtnOFF);
        frame.setVisible(true);
    }
}
