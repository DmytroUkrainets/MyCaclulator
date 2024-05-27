package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/** A class that describes the graphical component of the calculator. */
public class CalculatorGraphic extends JFrame implements KeyListener {
    private static final int WIDTH_BASIC = 420; // Program width
    private static final int WIDTH_STEM = 600; // Program width
    private static final int HEIGHT = 450; // Program height

    /** Designer of the graphic component of the calculator. */
    CalculatorGraphic(int n) {
        super("Calculator"); // Creating a window with a name

        getContentPane().setBackground(Color.BLACK); // Background color

        setLayout(new BorderLayout()); // The manager of placement of the composition

        setImageIcon("CalculatorFiles\\Images\\Icon.png"); // Installing the program icon
        setOutputInfo(); // Setting up the output panel

        // Creating a menu bar
        JPanel menuPanel = new JPanel(new FlowLayout());
        menuPanel.setBackground(Color.DARK_GRAY);

        basic = new JButton("Standard");
        basic.setBackground(Color.BLACK);
        basic.setForeground(Color.WHITE);
        basic.setFocusPainted(false);

        stem = new JButton("Trigonometric");
        stem.setBackground(Color.BLACK);
        stem.setForeground(Color.WHITE);
        stem.setFocusPainted(false);

        switch (n) {
            case 1 -> {
                setSize(WIDTH_BASIC, HEIGHT); // Window size
                int x = (Toolkit.getDefaultToolkit().getScreenSize().width - WIDTH_BASIC) / 2; // Placement on x
                int y = (Toolkit.getDefaultToolkit().getScreenSize().height - HEIGHT) / 2; // Placement on у
                setLocation(x, y); // Setting the location
                setFunctionalPanelBasic(); // Installation of the functional panel
                setMinimumSize(new Dimension(WIDTH_BASIC, HEIGHT)); // Minimum size
                stem.addActionListener(e -> {
                    this.setVisible(false);
                    new CalculatorGraphic(2);
                });
            }
            case 2 -> {
                setSize(WIDTH_STEM, HEIGHT); // Window size
                int x = (Toolkit.getDefaultToolkit().getScreenSize().width - WIDTH_STEM) / 2; // Placement on x
                int
                        y = (Toolkit.getDefaultToolkit().getScreenSize().height - HEIGHT) / 2; // Placement on y
                setLocation(x, y); // Setting the location
                setFunctionalPanelStem(); // Installation of the functional panel
                setMinimumSize(new Dimension(WIDTH_STEM, HEIGHT)); // Minimum size
                basic.addActionListener(e -> {
                    this.setVisible(false);
                    new CalculatorGraphic(1);
                });
            }
        }

        menuPanel.add(basic);
        menuPanel.add(stem);
        add(menuPanel, BorderLayout.NORTH);

        setFocusable(true); // Focusing
        requestFocus();

        addKeyListener(this); // Key listener

        pack(); // Placement settings

        setVisible(true);
    }

    /** A method that sets the application icon. */
    private void setImageIcon(String imageName){
        ImageIcon icon = new ImageIcon(imageName);
        setIconImage(icon.getImage());
    }

    /** A method that configures the calculator output panel. */
    private void setOutputInfo(){
        outputInfo = new JLabel("0");
        outputInfo.setHorizontalAlignment(SwingConstants.RIGHT); // text on the right edge
        outputInfo.setVerticalAlignment(SwingConstants.BOTTOM); // text on the bottom edge
        outputInfo.setFont(new Font("Arial", Font.PLAIN, 60));
        outputInfo.setForeground(Color.WHITE);
        add(outputInfo, BorderLayout.CENTER);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == '0')
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("0");
            else if (outputInfo.getText().charAt(outputInfo.getText().length() - 1) != '!') outputInfo.setText(outputInfo.getText() + "0");
            else outputInfo.setText("0");
        if (e.getKeyChar() == '1')
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("1");
            else if (outputInfo.getText().charAt(outputInfo.getText().length() - 1) != '!') outputInfo.setText(outputInfo.getText() + "1");
            else outputInfo.setText("1");
        if (e.getKeyChar() == '2')
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("2");
            else if (outputInfo.getText().charAt(outputInfo.getText().length() - 1) != '!') outputInfo.setText(outputInfo.getText() + "2");
            else outputInfo.setText("2");
        if (e.getKeyChar() == '3')
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("3");
            else if (outputInfo.getText().charAt(outputInfo.getText().length() - 1) != '!') outputInfo.setText(outputInfo.getText() + "3");
            else outputInfo.setText("3");
        if (e.getKeyChar() == '4')
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("4");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "4");
            else outputInfo.setText("4");
        if (e.getKeyChar() == '5')
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("5");
            else if (outputInfo.getText().charAt(outputInfo.getText().length() - 1) != '!') outputInfo.setText(outputInfo.getText() + "5");
            else outputInfo.setText("5");
        if (e.getKeyChar() == '6')
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("6");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "6");
            else outputInfo.setText("6");
        if (e.getKeyChar() == '7')
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("7");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "7");
            else outputInfo.setText("7");
        if (e.getKeyChar() == '8')
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("8");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "8");
            else outputInfo.setText("8");
        if (e.getKeyChar() == '9')
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("9");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "9");
            else outputInfo.setText("9");
    }
    @Override
    public void keyPressed(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}

    /** A method that creates a standard toolbar at the bottom of the application. */
    private void setFunctionalPanelBasic(){
        JPanel panel = new JPanel(); // Announcing the panel
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new GridLayout(6, 4));

        JButton btn0 = new JButton("0"); // We create buttons
        btn0.setForeground(Color.WHITE);
        btn0.setBackground(Color.BLACK);
        btn0.setFont(new Font("Arial", Font.PLAIN, 21));
        btn0.setFocusPainted(false);
        btn0.addActionListener(e -> {
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("0");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "0");
            else outputInfo.setText("0");
        });

        JButton btn1 = new JButton("1");
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.BLACK);
        btn1.setFont(new Font("Arial", Font.PLAIN, 21));
        btn1.setFocusPainted(false);
        btn1.addActionListener(e -> {
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("1");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "1");
            else outputInfo.setText("1");
        });

        JButton btn2 = new JButton("2");
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.BLACK);
        btn2.setFont(new Font("Arial", Font.PLAIN, 21));
        btn2.setFocusPainted(false);
        btn2.addActionListener(e -> {
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("2");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "2");
            else outputInfo.setText("2");
        });

        JButton btn3 = new JButton("3");
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.BLACK);
        btn3.setFont(new Font("Arial", Font.PLAIN, 21));
        btn3.setFocusPainted(false);
        btn3.addActionListener(e -> {
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("3");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "3");
            else outputInfo.setText("3");
        });

        JButton btn4 = new JButton("4");
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.BLACK);
        btn4.setFont(new Font("Arial", Font.PLAIN, 21));
        btn4.setFocusPainted(false);
        btn4.addActionListener(e -> {
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("4");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "4");
            else outputInfo.setText("4");
        });

        JButton btn5 = new JButton("5");
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.BLACK);
        btn5.setFont(new Font("Arial", Font.PLAIN, 21));
        btn5.setFocusPainted(false);
        btn5.addActionListener(e -> {
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("5");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "5");
            else outputInfo.setText("5");
        });

        JButton btn6 = new JButton("6");
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(Color.BLACK);
        btn6.setFont(new Font("Arial", Font.PLAIN, 21));
        btn6.setFocusPainted(false);
        btn6.addActionListener(e -> {
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("6");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "6");
            else outputInfo.setText("6");
        });

        JButton btn7 = new JButton("7");
        btn7.setForeground(Color.WHITE);
        btn7.setBackground(Color.BLACK);
        btn7.setFont(new Font("Arial", Font.PLAIN, 21));
        btn7.setFocusPainted(false);
        btn7.addActionListener(e -> {
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("7");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "7");
            else outputInfo.setText("7");
        });

        JButton btn8 = new JButton("8");
        btn8.setForeground(Color.WHITE);
        btn8.setBackground(Color.BLACK);
        btn8.setFont(new Font("Arial", Font.PLAIN, 21));
        btn8.setFocusPainted(false);
        btn8.addActionListener(e -> {
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("8");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "8");
            else outputInfo.setText("8");
        });

        JButton btn9 = new JButton("9");
        btn9.setForeground(Color.WHITE);
        btn9.setBackground(Color.BLACK);
        btn9.setFont(new Font("Arial", Font.PLAIN, 21));
        btn9.setFocusPainted(false);
        btn9.addActionListener(e -> {
            if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("9");
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!')
                outputInfo.setText(outputInfo.getText() + "9");
            else outputInfo.setText("9");
        });

        JButton btnPlus_Minus = new JButton("-/+");
        btnPlus_Minus.setForeground(Color.WHITE);
        btnPlus_Minus.setBackground(Color.BLACK);
        btnPlus_Minus.setFont(new Font("Arial", Font.PLAIN, 21));
        btnPlus_Minus.setFocusPainted(false);
        btnPlus_Minus.addActionListener(e -> {
            if (outputInfo.getText().charAt(0) == '-') {
                StringBuilder number = new StringBuilder();
                for(int i=1; i<outputInfo.getText().length(); i++) number.append(outputInfo.getText().charAt(i));
                outputInfo.setText(number.toString());
            }
            else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!')
                outputInfo.setText('-' + outputInfo.getText());
        });

        JButton btnPoint = new JButton(".");
        btnPoint.setForeground(Color.WHITE);
        btnPoint.setBackground(Color.BLACK);
        btnPoint.setFont(new Font("Arial", Font.PLAIN, 21));
        btnPoint.setFocusPainted(false);
        btnPoint.addActionListener(e -> {
            boolean pointPressed = false;
            for (int i=0; i<outputInfo.getText().length(); i++)
                if (outputInfo.getText().charAt(i) == '.'){
                    pointPressed = true;
                    break;
                }
            if (!pointPressed && outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!')
                outputInfo.setText(outputInfo.getText() + ".");
        });

        JButton btnPlus = new JButton("+");
        btnPlus.setForeground(Color.WHITE);
        btnPlus.setBackground(Color.BLACK);
        btnPlus.setFont(new Font("Arial", Font.PLAIN, 21));
        btnPlus.setFocusPainted(false);
        btnPlus.addActionListener(e -> {
            try {
                num1 = Double.parseDouble(outputInfo.getText());
                outputInfo.setText("0");
                plusPressed = true;
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        JButton btnMinus = new JButton("-");
        btnMinus.setForeground(Color.WHITE);
        btnMinus.setBackground(Color.BLACK);
        btnMinus.setFont(new Font("Arial", Font.PLAIN, 21));
        btnMinus.setFocusPainted(false);
        btnMinus.addActionListener(e -> {
            try {
                num1 = Double.parseDouble(outputInfo.getText());
                outputInfo.setText("0");
                minusPressed = true;
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        JButton btnMulti = new JButton("×");
        btnMulti.setForeground(Color.WHITE);
        btnMulti.setBackground(Color.BLACK);
        btnMulti.setFont(new Font("Arial", Font.PLAIN, 21));
        btnMulti.setFocusPainted(false);
        btnMulti.addActionListener(e -> {
            try {
                num1 = Double.parseDouble(outputInfo.getText());
                outputInfo.setText("0");
                multiPressed = true;
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        JButton btnDivide = new JButton("÷");
        btnDivide.setForeground(Color.WHITE);
        btnDivide.setBackground(Color.BLACK);
        btnDivide.setFont(new Font("Arial", Font.PLAIN, 21));
        btnDivide.setFocusPainted(false);
        btnDivide.addActionListener(e -> {
            try {
                num1 = Double.parseDouble(outputInfo.getText());
                outputInfo.setText("0");
                dividePressed = true;
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        JButton btnEqual = new JButton("=");
        btnEqual.setForeground(Color.WHITE);
        btnEqual.setBackground(Color.ORANGE);
        btnEqual.setFont(new Font("Arial", Font.PLAIN, 21));
        btnEqual.setFocusPainted(false);
        btnEqual.addActionListener(e -> {
            if (plusPressed){
                try {
                    num2 = Double.parseDouble(outputInfo.getText());
                    outputInfo.setText(cs.addition(num1, num2));
                    plusPressed = false;
                } catch (NumberFormatException nfe) {
                    outputInfo.setText("0");
                }
            } else if (minusPressed){
                try {
                    num2 = Double.parseDouble(outputInfo.getText());
                    outputInfo.setText(cs.subtraction(num1, num2));
                    minusPressed = false;
                } catch (NumberFormatException nfe){
                    outputInfo.setText("0");
                }
            } else if (multiPressed){
                try {
                    num2 = Double.parseDouble(outputInfo.getText());
                    outputInfo.setText(cs.multiplication(num1, num2));
                    multiPressed = false;
                } catch (NumberFormatException nfe){
                    outputInfo.setText("0");
                }
            } else if (dividePressed){
                try {
                    num2 = Double.parseDouble(outputInfo.getText());
                    outputInfo.setText(cs.dividing(num1, num2));
                    dividePressed = false;
                } catch (NumberFormatException nfe){
                    outputInfo.setText("0");
                }
            } else if (percentPressed){
                try {
                    num2 = Double.parseDouble(outputInfo.getText());
                    outputInfo.setText(cs.getPercent(num1, num2));
                    dividePressed = false;
                } catch (NumberFormatException nfe){
                    outputInfo.setText("0");
                }
            }
        });

        JButton btnDelete = new JButton("Delete");
        btnDelete.setForeground(Color.WHITE);
        btnDelete.setBackground(Color.BLACK);
        btnDelete.setFont(new Font("Arial", Font.PLAIN, 21));
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(e -> {
            if (outputInfo.getText().length() > 1){
                StringBuilder number = new StringBuilder();
                for (int i=0; i<outputInfo.getText().length() - 1; i++) number.append(outputInfo.getText().charAt(i));
                outputInfo.setText(number.toString());
            } else outputInfo.setText("0");
        });

        JButton btnPercent = new JButton("%");
        btnPercent.setForeground(Color.WHITE);
        btnPercent.setBackground(Color.BLACK);
        btnPercent.setFont(new Font("Arial", Font.PLAIN, 21));
        btnPercent.setFocusPainted(false);
        btnPercent.addActionListener(e -> {
            try {
                num1 = Double.parseDouble(outputInfo.getText());
                outputInfo.setText("0");
                percentPressed = true;
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        JButton btnClean = new JButton("C");
        btnClean.setForeground(Color.WHITE);
        btnClean.setBackground(Color.BLACK);
        btnClean.setFont(new Font("Arial", Font.PLAIN, 21));
        btnClean.setFocusPainted(false);
        btnClean.addActionListener(e -> {
            outputInfo.setText("0");
            num1 = 0.0;
            num2 = 0.0;
            plusPressed = false;
            minusPressed = false;
            multiPressed = false;
            dividePressed = false;
            percentPressed = false;
        });

        JButton btnCE = new JButton("CE");
        btnCE.setForeground(Color.WHITE);
        btnCE.setBackground(Color.BLACK);
        btnCE.setFont(new Font("Arial", Font.PLAIN, 21));
        btnCE.setFocusPainted(false);
        btnCE.addActionListener(e -> {
            outputInfo.setText("0");
        });

        JButton btnRoot = new JButton("√");
        btnRoot.setForeground(Color.WHITE);
        btnRoot.setBackground(Color.BLACK);
        btnRoot.setFont(new Font("Arial", Font.PLAIN, 21));
        btnRoot.setFocusPainted(false);
        btnRoot.addActionListener(e -> {
            try {
                outputInfo.setText(cs.getRoot(Double.parseDouble(outputInfo.getText())));
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        JButton btnPow = new JButton("^2");
        btnPow.setForeground(Color.WHITE);
        btnPow.setBackground(Color.BLACK);
        btnPow.setFont(new Font("Arial", Font.PLAIN, 21));
        btnPow.setFocusPainted(false);
        btnPow.addActionListener(e -> {
            try {
                outputInfo.setText(cs.getPower(Double.parseDouble(outputInfo.getText())));
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        JButton btnOneOfSomething = new JButton("1/?");
        btnOneOfSomething.setForeground(Color.WHITE);
        btnOneOfSomething.setBackground(Color.BLACK);
        btnOneOfSomething.setFont(new Font("Arial", Font.PLAIN, 21));
        btnOneOfSomething.setFocusPainted(false);
        btnOneOfSomething.addActionListener(e -> {
            try {
                outputInfo.setText(cs.getOneOfSomething(Double.parseDouble(outputInfo.getText())));
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        addComponentListener(new ComponentListener() { // Changing the font size depending on the size of the program window
            @Override
            public void componentResized(ComponentEvent e) {
                if(getWidth() < getHeight()) {
                    int newFontSize1 = e.getComponent().getWidth() / 15; // Set the font size
                    Font font1 = new Font("Arial", Font.PLAIN, newFontSize1); // New font
                    btn0.setFont(font1); // Changing the panel button font
                    btn1.setFont(font1);
                    btn2.setFont(font1);
                    btn3.setFont(font1);
                    btn4.setFont(font1);
                    btn5.setFont(font1);
                    btn6.setFont(font1);
                    btn7.setFont(font1);
                    btn8.setFont(font1);
                    btn9.setFont(font1);
                    btnPlus.setFont(font1);
                    btnPlus_Minus.setFont(font1);
                    btnMinus.setFont(font1);
                    btnMulti.setFont(font1);
                    btnDelete.setFont(new Font("Arial", Font.PLAIN, e.getComponent().getWidth() / 20));
                    btnDivide.setFont(font1);
                    btnPercent.setFont(font1);
                    btnPow.setFont(font1);
                    btnPoint.setFont(font1);
                    btnCE.setFont(font1);
                    btnClean.setFont(font1);
                    btnEqual.setFont(font1);
                    btnOneOfSomething.setFont(font1);
                    btnRoot.setFont(font1);
                }
                else {
                    int newFontSize1 = e.getComponent().getHeight() / 15; // Set the font size
                    Font font1 = new Font("Arial", Font.PLAIN, newFontSize1);// New font
                    btn0.setFont(font1); // Changing the panel button font
                    btn1.setFont(font1);
                    btn2.setFont(font1);
                    btn3.setFont(font1);
                    btn4.setFont(font1);
                    btn5.setFont(font1);
                    btn6.setFont(font1);
                    btn7.setFont(font1);
                    btn8.setFont(font1);
                    btn9.setFont(font1);
                    btnPlus.setFont(font1);
                    btnPlus_Minus.setFont(font1);
                    btnMinus.setFont(font1);
                    btnMulti.setFont(font1);
                    btnDelete.setFont(new Font("Arial", Font.PLAIN, e.getComponent().getHeight() / 20));
                    btnDivide.setFont(font1);
                    btnPercent.setFont(font1);
                    btnPow.setFont(font1);
                    btnPoint.setFont(font1);
                    btnCE.setFont(font1);
                    btnClean.setFont(font1);
                    btnEqual.setFont(font1);
                    btnOneOfSomething.setFont(font1);
                    btnRoot.setFont(font1);
                }
            }
            @Override
            public void componentMoved(ComponentEvent e) {}
            @Override
            public void componentShown(ComponentEvent e) {}
            @Override
            public void componentHidden(ComponentEvent e) {}
        });

        panel.add(btnPercent); // Add buttons to the function panel
        panel.add(btnCE);
        panel.add(btnClean);
        panel.add(btnDelete);
        panel.add(btnOneOfSomething);
        panel.add(btnPow);
        panel.add(btnRoot);
        panel.add(btnDivide);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnMulti);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btnMinus);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btnPlus);
        panel.add(btnPlus_Minus);
        panel.add(btn0);
        panel.add(btnPoint);
        panel.add(btnEqual);

        add(panel, BorderLayout.SOUTH); // Add a panel to the program window
    }

    /** A method that creates a trigonometric function panel at the bottom of the application. */
    private void setFunctionalPanelStem(){
            JPanel panel = new JPanel(); // Declare the panel
            panel.setBackground(Color.DARK_GRAY);
            panel.setLayout(new GridLayout(6, 5));

            JButton btn0 = new JButton("0"); // Create buttons
            btn0.setForeground(Color.WHITE);
            btn0.setBackground(Color.BLACK);
            btn0.setFont(new Font("Arial", Font.PLAIN, 21));
            btn0.setFocusPainted(false);
            btn0.addActionListener(e -> {
                if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("0");
                else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "0");
                else outputInfo.setText("0");
            });

            JButton btn1 = new JButton("1");
            btn1.setForeground(Color.WHITE);
            btn1.setBackground(Color.BLACK);
            btn1.setFont(new Font("Arial", Font.PLAIN, 21));
            btn1.setFocusPainted(false);
            btn1.addActionListener(e -> {
                if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("1");
                else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "1");
                else outputInfo.setText("1");
            });

            JButton btn2 = new JButton("2");
            btn2.setForeground(Color.WHITE);
            btn2.setBackground(Color.BLACK);
            btn2.setFont(new Font("Arial", Font.PLAIN, 21));
            btn2.setFocusPainted(false);
            btn2.addActionListener(e -> {
                if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("2");
                else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "2");
                else outputInfo.setText("2");
            });

            JButton btn3 = new JButton("3");
            btn3.setForeground(Color.WHITE);
            btn3.setBackground(Color.BLACK);
            btn3.setFont(new Font("Arial", Font.PLAIN, 21));
            btn3.setFocusPainted(false);
            btn3.addActionListener(e -> {
                if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("3");
                else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "3");
                else outputInfo.setText("3");
            });

            JButton btn4 = new JButton("4");
            btn4.setForeground(Color.WHITE);
            btn4.setBackground(Color.BLACK);
            btn4.setFont(new Font("Arial", Font.PLAIN, 21));
            btn4.setFocusPainted(false);
            btn4.addActionListener(e -> {
                if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("4");
                else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "4");
                else outputInfo.setText("4");
            });

            JButton btn5 = new JButton("5");
            btn5.setForeground(Color.WHITE);
            btn5.setBackground(Color.BLACK);
            btn5.setFont(new Font("Arial", Font.PLAIN, 21));
            btn5.setFocusPainted(false);
            btn5.addActionListener(e -> {
                if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("5");
                else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "5");
                else outputInfo.setText("5");
            });

            JButton btn6 = new JButton("6");
            btn6.setForeground(Color.WHITE);
            btn6.setBackground(Color.BLACK);
            btn6.setFont(new Font("Arial", Font.PLAIN, 21));
            btn6.setFocusPainted(false);
            btn6.addActionListener(e -> {
                if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("6");
                else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "6");
                else outputInfo.setText("6");
            });

            JButton btn7 = new JButton("7");
            btn7.setForeground(Color.WHITE);
            btn7.setBackground(Color.BLACK);
            btn7.setFont(new Font("Arial", Font.PLAIN, 21));
            btn7.setFocusPainted(false);
            btn7.addActionListener(e -> {
                if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("7");
                else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "7");
                else outputInfo.setText("7");
            });

            JButton btn8 = new JButton("8");
            btn8.setForeground(Color.WHITE);
            btn8.setBackground(Color.BLACK);
            btn8.setFont(new Font("Arial", Font.PLAIN, 21));
            btn8.setFocusPainted(false);
            btn8.addActionListener(e -> {
                if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("8");
                else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!') outputInfo.setText(outputInfo.getText() + "8");
                else outputInfo.setText("8");
            });

            JButton btn9 = new JButton("9");
            btn9.setForeground(Color.WHITE);
            btn9.setBackground(Color.BLACK);
            btn9.setFont(new Font("Arial", Font.PLAIN, 21));
            btn9.setFocusPainted(false);
            btn9.addActionListener(e -> {
                if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("9");
                else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!')
                    outputInfo.setText(outputInfo.getText() + "9");
                else outputInfo.setText("9");
            });

            JButton btnPlus_Minus = new JButton("-/+");
            btnPlus_Minus.setForeground(Color.WHITE);
            btnPlus_Minus.setBackground(Color.BLACK);
            btnPlus_Minus.setFont(new Font("Arial", Font.PLAIN, 21));
            btnPlus_Minus.setFocusPainted(false);
            btnPlus_Minus.addActionListener(e -> {
                if (outputInfo.getText().charAt(0) == '-') {
                    StringBuilder number = new StringBuilder();
                    for(int i=1; i<outputInfo.getText().length(); i++) number.append(outputInfo.getText().charAt(i));
                    outputInfo.setText(number.toString());
                }
                else if (outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!')
                    outputInfo.setText('-' + outputInfo.getText());
            });

            JButton btnPoint = new JButton(".");
            btnPoint.setForeground(Color.WHITE);
            btnPoint.setBackground(Color.BLACK);
            btnPoint.setFont(new Font("Arial", Font.PLAIN, 21));
            btnPoint.setFocusPainted(false);
            btnPoint.addActionListener(e -> {
                boolean pointPressed = false;
                for (int i=0; i<outputInfo.getText().length(); i++)
                    if (outputInfo.getText().charAt(i) == '.'){
                        pointPressed = true;
                        break;
                    }
                if (!pointPressed && outputInfo.getText().charAt(outputInfo.getText().length()-1) != '!')
                    outputInfo.setText(outputInfo.getText() + ".");
            });

            JButton btnPlus = new JButton("+");
            btnPlus.setForeground(Color.WHITE);
            btnPlus.setBackground(Color.BLACK);
            btnPlus.setFont(new Font("Arial", Font.PLAIN, 21));
            btnPlus.setFocusPainted(false);
            btnPlus.addActionListener(e -> {
                try {
                    num1 = Double.parseDouble(outputInfo.getText());
                    outputInfo.setText("0");
                    plusPressed = true;
                } catch (NumberFormatException nfe){
                    outputInfo.setText("0");
                }
            });

            JButton btnMinus = new JButton("-");
            btnMinus.setForeground(Color.WHITE);
            btnMinus.setBackground(Color.BLACK);
            btnMinus.setFont(new Font("Arial", Font.PLAIN, 21));
            btnMinus.setFocusPainted(false);
            btnMinus.addActionListener(e -> {
                try {
                    num1 = Double.parseDouble(outputInfo.getText());
                    outputInfo.setText("0");
                    minusPressed = true;
                } catch (NumberFormatException nfe){
                    outputInfo.setText("0");
                }
            });

            JButton btnMulti = new JButton("×");
            btnMulti.setForeground(Color.WHITE);
            btnMulti.setBackground(Color.BLACK);
            btnMulti.setFont(new Font("Arial", Font.PLAIN, 21));
            btnMulti.setFocusPainted(false);
            btnMulti.addActionListener(e -> {
                try {
                    num1 = Double.parseDouble(outputInfo.getText());
                    outputInfo.setText("0");
                    multiPressed = true;
                } catch (NumberFormatException nfe){
                    outputInfo.setText("0");
                }
            });

            JButton btnDivide = new JButton("÷");
            btnDivide.setForeground(Color.WHITE);
            btnDivide.setBackground(Color.BLACK);
            btnDivide.setFont(new Font("Arial", Font.PLAIN, 21));
            btnDivide.setFocusPainted(false);
            btnDivide.addActionListener(e -> {
                try {
                    num1 = Double.parseDouble(outputInfo.getText());
                    outputInfo.setText("0");
                    dividePressed = true;
                } catch (NumberFormatException nfe){
                    outputInfo.setText("0");
                }
            });

            JButton btnEqual = new JButton("=");
            btnEqual.setForeground(Color.WHITE);
            btnEqual.setBackground(Color.ORANGE);
            btnEqual.setFont(new Font("Arial", Font.PLAIN, 21));
            btnEqual.setFocusPainted(false);
            btnEqual.addActionListener(e -> {
                if (plusPressed){
                    try {
                        num2 = Double.parseDouble(outputInfo.getText());
                        outputInfo.setText(cs.addition(num1, num2));
                        plusPressed = false;
                    } catch (NumberFormatException nfe) {
                        outputInfo.setText("0");
                    }
                } else if (minusPressed){
                    try {
                        num2 = Double.parseDouble(outputInfo.getText());
                        outputInfo.setText(cs.subtraction(num1, num2));
                        minusPressed = false;
                    } catch (NumberFormatException nfe){
                        outputInfo.setText("0");
                    }
                } else if (multiPressed){
                    try {
                        num2 = Double.parseDouble(outputInfo.getText());
                        outputInfo.setText(cs.multiplication(num1, num2));
                        multiPressed = false;
                    } catch (NumberFormatException nfe){
                        outputInfo.setText("0");
                    }
                } else if (dividePressed){
                    try {
                        num2 = Double.parseDouble(outputInfo.getText());
                        outputInfo.setText(cs.dividing(num1, num2));
                        dividePressed = false;
                    } catch (NumberFormatException nfe){
                        outputInfo.setText("0");
                    }
                } else if (percentPressed){
                    try {
                        num2 = Double.parseDouble(outputInfo.getText());
                        outputInfo.setText(cs.getPercent(num1, num2));
                        dividePressed = false;
                    } catch (NumberFormatException nfe){
                        outputInfo.setText("0");
                    }
                }
            });

            JButton btnDelete = new JButton("Delete");
            btnDelete.setForeground(Color.WHITE);
            btnDelete.setBackground(Color.BLACK);
            btnDelete.setFont(new Font("Arial", Font.PLAIN, 21));
            btnDelete.setFocusPainted(false);
            btnDelete.addActionListener(e -> {
                if (outputInfo.getText().length() > 1){
                    StringBuilder number = new StringBuilder();
                    for (int i=0; i<outputInfo.getText().length() - 1; i++) number.append(outputInfo.getText().charAt(i));
                    outputInfo.setText(number.toString());
                } else outputInfo.setText("0");
            });

            JButton btnPercent = new JButton("%");
            btnPercent.setForeground(Color.WHITE);
            btnPercent.setBackground(Color.BLACK);
            btnPercent.setFont(new Font("Arial", Font.PLAIN, 21));
            btnPercent.setFocusPainted(false);
            btnPercent.addActionListener(e -> {
                try {
                    num1 = Double.parseDouble(outputInfo.getText());
                    outputInfo.setText("0");
                    percentPressed = true;
                } catch (NumberFormatException nfe){
                    outputInfo.setText("0");
                }
            });

            JButton btnClean = new JButton("C");
            btnClean.setForeground(Color.WHITE);
            btnClean.setBackground(Color.BLACK);
            btnClean.setFont(new Font("Arial", Font.PLAIN, 21));
            btnClean.setFocusPainted(false);
            btnClean.addActionListener(e -> {
                outputInfo.setText("0");
                num1 = 0.0;
                num2 = 0.0;
                plusPressed = false;
                minusPressed = false;
                multiPressed = false;
                dividePressed = false;
                percentPressed = false;
            });

            JButton btnCE = new JButton("CE");
            btnCE.setForeground(Color.WHITE);
            btnCE.setBackground(Color.BLACK);
            btnCE.setFont(new Font("Arial", Font.PLAIN, 21));
            btnCE.setFocusPainted(false);
            btnCE.addActionListener(e -> {
                outputInfo.setText("0");
            });

            JButton btnRoot = new JButton("√");
            btnRoot.setForeground(Color.WHITE);
            btnRoot.setBackground(Color.BLACK);
            btnRoot.setFont(new Font("Arial", Font.PLAIN, 21));
            btnRoot.setFocusPainted(false);
            btnRoot.addActionListener(e -> {
                try {
                    outputInfo.setText(cs.getRoot(Double.parseDouble(outputInfo.getText())));
                } catch (NumberFormatException nfe){
                    outputInfo.setText("0");
                }
            });

            JButton btnPow = new JButton("^2");
            btnPow.setForeground(Color.WHITE);
            btnPow.setBackground(Color.BLACK);
            btnPow.setFont(new Font("Arial", Font.PLAIN, 21));
            btnPow.setFocusPainted(false);
            btnPow.addActionListener(e -> {
                try {
                    outputInfo.setText(cs.getPower(Double.parseDouble(outputInfo.getText())));
                } catch (NumberFormatException nfe){
                    outputInfo.setText("0");
                }
            });

            JButton btnOneOfSomething = new JButton("1/?");
            btnOneOfSomething.setForeground(Color.WHITE);
            btnOneOfSomething.setBackground(Color.BLACK);
            btnOneOfSomething.setFont(new Font("Arial", Font.PLAIN, 21));
            btnOneOfSomething.setFocusPainted(false);
            btnOneOfSomething.addActionListener(e -> {
                try {
                    outputInfo.setText(cs.getOneOfSomething(Double.parseDouble(outputInfo.getText())));
                } catch (NumberFormatException nfe){
                    outputInfo.setText("0");
                }
            });

        JButton btnE = new JButton("e");
        btnE.setForeground(Color.WHITE);
        btnE.setBackground(Color.BLACK);
        btnE.setFont(new Font("Arial", Font.PLAIN, 21));
        btnE.setFocusPainted(false);
        btnE.addActionListener(e -> {
            try {
                if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0') outputInfo.setText("2.718");
                else {
                    double num = Double.parseDouble(outputInfo.getText());
                    outputInfo.setText(cs.multiplication(num, Math.E));
                }
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        JButton btnPI = new JButton("π");
        btnPI.setForeground(Color.WHITE);
        btnPI.setBackground(Color.BLACK);
        btnPI.setFont(new Font("Arial", Font.PLAIN, 21));
        btnPI.setFocusPainted(false);
        btnPI.addActionListener(e -> {
            try {
                if (outputInfo.getText().length() == 1 && outputInfo.getText().charAt(0) == '0')
                    outputInfo.setText("3.141");
                else {
                    double num = Double.parseDouble(outputInfo.getText());
                    outputInfo.setText(cs.multiplication(num, Math.PI));
                }
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        JButton btnSin = new JButton("Sin");
        btnSin.setForeground(Color.WHITE);
        btnSin.setBackground(Color.BLACK);
        btnSin.setFont(new Font("Arial", Font.PLAIN, 21));
        btnSin.setFocusPainted(false);
        btnSin.addActionListener(e -> {
            try {
                outputInfo.setText(cs.getSin(Double.parseDouble(outputInfo.getText())));
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        JButton btnCos = new JButton("Cos");
        btnCos.setForeground(Color.WHITE);
        btnCos.setBackground(Color.BLACK);
        btnCos.setFont(new Font("Arial", Font.PLAIN, 21));
        btnCos.setFocusPainted(false);
        btnCos.addActionListener(e -> {
            try {
                outputInfo.setText(cs.getCos(Double.parseDouble(outputInfo.getText())));
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        JButton btnTg = new JButton("Tg");
        btnTg.setForeground(Color.WHITE);
        btnTg.setBackground(Color.BLACK);
        btnTg.setFont(new Font("Arial", Font.PLAIN, 21));
        btnTg.setFocusPainted(false);
        btnTg.addActionListener(e -> {
            try {
                outputInfo.setText(cs.getTg(Double.parseDouble(outputInfo.getText())));
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        JButton btnCtg = new JButton("Ctg");
        btnCtg.setForeground(Color.WHITE);
        btnCtg.setBackground(Color.BLACK);
        btnCtg.setFont(new Font("Arial", Font.PLAIN, 21));
        btnCtg.setFocusPainted(false);
        btnCtg.addActionListener(e -> {
            try {
                outputInfo.setText(cs.getCtg(Double.parseDouble(outputInfo.getText())));
            } catch (NumberFormatException nfe){
                outputInfo.setText("0");
            }
        });

        addComponentListener(new ComponentListener() { // Changing the font size depending on the size of the program window
            @Override
            public void componentResized(ComponentEvent e) {
                if(getWidth() < getHeight()) {
                    int newFontSize1 = e.getComponent().getWidth() / 15; // Set the font size
                    Font font1 = new Font("Arial", Font.PLAIN, newFontSize1); // New font
                    btn0.setFont(font1); // Change panel button font
                    btn1.setFont(font1);
                    btn2.setFont(font1);
                    btn3.setFont(font1);
                    btn4.setFont(font1);
                    btn5.setFont(font1);
                    btn6.setFont(font1);
                    btn7.setFont(font1);
                    btn8.setFont(font1);
                    btn9.setFont(font1);
                    btnPlus.setFont(font1);
                    btnPlus_Minus.setFont(font1);
                    btnMinus.setFont(font1);
                    btnMulti.setFont(font1);
                    btnDelete.setFont(new Font("Arial", Font.PLAIN, e.getComponent().getWidth() / 20));
                    btnDivide.setFont(font1);
                    btnPercent.setFont(font1);
                    btnPow.setFont(font1);
                    btnPoint.setFont(font1);
                    btnCE.setFont(font1);
                    btnClean.setFont(font1);
                    btnEqual.setFont(font1);
                    btnOneOfSomething.setFont(font1);
                    btnRoot.setFont(font1);
                }
                else {
                    int newFontSize1 = e.getComponent().getHeight() / 15; // Set the font size
                    Font font1 = new Font("Arial", Font.PLAIN, newFontSize1); // New font
                    btn0.setFont(font1); // Change panel button font
                    btn1.setFont(font1);
                    btn2.setFont(font1);
                    btn3.setFont(font1);
                    btn4.setFont(font1);
                    btn5.setFont(font1);
                    btn6.setFont(font1);
                    btn7.setFont(font1);
                    btn8.setFont(font1);
                    btn9.setFont(font1);
                    btnPlus.setFont(font1);
                    btnPlus_Minus.setFont(font1);
                    btnMinus.setFont(font1);
                    btnMulti.setFont(font1);
                    btnDelete.setFont(new Font("Arial", Font.PLAIN, e.getComponent().getHeight() / 20));
                    btnDivide.setFont(font1);
                    btnPercent.setFont(font1);
                    btnPow.setFont(font1);
                    btnPoint.setFont(font1);
                    btnCE.setFont(font1);
                    btnClean.setFont(font1);
                    btnEqual.setFont(font1);
                    btnOneOfSomething.setFont(font1);
                    btnRoot.setFont(font1);
                }
            }
            @Override
            public void componentMoved(ComponentEvent e) {}
            @Override
            public void componentShown(ComponentEvent e) {}
            @Override
            public void componentHidden(ComponentEvent e) {}
        });

        panel.add(btnE); // Add buttons to the function panel
        panel.add(btnPercent);
        panel.add(btnCE);
        panel.add(btnClean);
        panel.add(btnDelete);
        panel.add(btnPI);
        panel.add(btnOneOfSomething);
        panel.add(btnPow);
        panel.add(btnRoot);
        panel.add(btnDivide);
        panel.add(btnSin);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnMulti);
        panel.add(btnCos);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btnMinus);
        panel.add(btnTg);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btnPlus);
        panel.add(btnCtg);
        panel.add(btnPlus_Minus);
        panel.add(btn0);
        panel.add(btnPoint);
        panel.add(btnEqual);

        add(panel, BorderLayout.SOUTH); // Add a panel to the program window
    }

    private final CalculatorSystem cs = new CalculatorSystem(); // Create a calculator object for performing mathematical operations
    public JLabel outputInfo; // Output field
    private double num1, num2; // The number entered before/after the operator button was pressed
    private boolean dividePressed, percentPressed, multiPressed, minusPressed, plusPressed = false; // Was the "-", "%", "+" button pressed
    public JButton basic, stem;
}
