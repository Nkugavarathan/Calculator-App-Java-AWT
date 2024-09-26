
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField display;
    Button btnClear,btnDot,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPlus,btnMinus,btnMultiply,btnDivide,btnEquals,btnReset;
    Calculator(){
        //button,textfield background color
        Color btnback=new Color(224, 97, 97);

        display =new TextField("");
        display.setBounds(50,50,200,30);
        Font font=new Font("arial",Font.PLAIN,18);

        display.setFont(font);
        display.setBackground(btnback);
        display.setForeground(Color.WHITE);
        add(display);

        //button font
        Font btnfont=new Font("arial",Font.PLAIN,18);

        btn1=new Button("1");
        btn1.setBounds(50,100,30,30);
        btn1.setFont(btnfont);


        btn1.setForeground(Color.WHITE);
        btn1.setBackground(btnback);
        add(btn1);
        btn1.addActionListener(this);

        btn2=new Button("2");
        btn2.setBounds(100,100,30,30);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(btnback);
        btn2.setFont(btnfont);
        add(btn2);
        btn2.addActionListener(this);

        btn3=new Button("3");
        btn3.setBounds(150,100,30,30);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(btnback);
        btn3.setFont(btnfont);
        add(btn3);
        btn3.addActionListener(this);

        btnClear=new Button("C");
        btnClear.setBounds(200,100,30,30);
        btnClear.setForeground(Color.WHITE);
        btnClear.setBackground(btnback);
        btnClear.setFont(btnfont);
        add(btnClear);
        btnClear.addActionListener(this);

        btn4=new Button("4");
        btn4.setBounds(50,150,30,30);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(btnback);
        btn4.setFont(btnfont);
        add(btn4);
        btn4.addActionListener(this);

        btn5=new Button("5");
        btn5.setBounds(100,150,30,30);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(btnback);
        btn5.setFont(btnfont);
        add(btn5);
        btn5.addActionListener(this);

        btn6=new Button("6");
        btn6.setBounds(150,150,30,30);
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(btnback);
        btn6.setFont(btnfont);
        add(btn6);
        btn6.addActionListener(this);

        btnDivide=new Button("/");
        btnDivide.setBounds(200,150,30,30);
        btnDivide.setForeground(Color.WHITE);
        btnDivide.setBackground(btnback);
        btnDivide.setFont(btnfont);
        add(btnDivide);
        btnDivide.addActionListener(this);

        btn7=new Button("7");
        btn7.setBounds(50,200,30,30);
        btn7.setForeground(Color.WHITE);
        btn7.setBackground(btnback);
        btn7.setFont(btnfont);
        add(btn7);
        btn7.addActionListener(this);

        btn8=new Button("8");
        btn8.setBounds(100,200,30,30);
        btn8.setForeground(Color.WHITE);
        btn8.setBackground(btnback);
        btn8.setFont(btnfont);
        add(btn8);
        btn8.addActionListener(this);

        btn9=new Button("9");
        btn9.setBounds(150,200,30,30);
        btn9.setForeground(Color.WHITE);
        btn9.setBackground(btnback);
        btn9.setFont(btnfont);
        add(btn9);
        btn9.addActionListener(this);

        btnMultiply=new Button("*");
        btnMultiply.setBounds(200,200,30,30);
        btnMultiply.setForeground(Color.WHITE);
        btnMultiply.setBackground(btnback);
        btnMultiply.setFont(btnfont);
        add(btnMultiply);
        btnMultiply.addActionListener(this);

        btn0=new Button("0");
        btn0.setBounds(50,250,30,30);
        btn0.setForeground(Color.WHITE);
        btn0.setBackground(btnback);
        btn0.setFont(btnfont);
        add(btn0);
        btn0.addActionListener(this);

        btnMinus=new Button("-");
        btnMinus.setBounds(100,250,30,30);
        btnMinus.setForeground(Color.WHITE);
        btnMinus.setBackground(btnback);
        btnMinus.setFont(btnfont);
        add(btnMinus);
        btnMinus.addActionListener(this);

        btnPlus=new Button("+");
        btnPlus.setBounds(150,250,30,30);
        btnPlus.setForeground(Color.WHITE);
        btnPlus.setBackground(btnback);
        btnPlus.setFont(btnfont);
        add(btnPlus);
        btnPlus.addActionListener(this);

        btnEquals=new Button("=");
        btnEquals.setBounds(200,250,30,30);
        btnEquals.setForeground(Color.WHITE);
        btnEquals.setBackground(btnback);
        btnEquals.setFont(btnfont);
        add(btnEquals);
        btnEquals.addActionListener(this);

        // set Frame
        setLayout(null);
        setTitle("Calculator");
        setSize(300,400);

        //set background color
        Color frameBack=new Color(192, 185, 185);
        setBackground(frameBack);

        setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn0){
            String expression =display.getText();
            expression+="0";
            display.setText(expression);
        }
        if(e.getSource()==btn1){
            String expression =display.getText();
            expression+="1";
            display.setText(expression);
        }
        if(e.getSource()==btn2){
            String expression =display.getText();
            expression+="2";
            display.setText(expression);
        }
        if(e.getSource()==btn3){
            String expression =display.getText();
            expression+="3";
            display.setText(expression);
        }
        if(e.getSource()==btn4){
            String expression =display.getText();
            expression+="4";
            display.setText(expression);
        }

        if(e.getSource()==btn5){
            String expression =display.getText();
            expression+="5";
            display.setText(expression);
        }
        if(e.getSource()==btn6){
            String expression =display.getText();
            expression+="6";
            display.setText(expression);
        }
        if(e.getSource()==btn7){
            String expression =display.getText();
            expression+="7";
            display.setText(expression);
        }
        if(e.getSource()==btn8){
            String expression =display.getText();
            expression+="8";
            display.setText(expression);
        }
        if(e.getSource()==btn9){
            String expression =display.getText();
            expression+="9";
            display.setText(expression);
        }
        if(e.getSource()==btnClear){
            display.setText("");
        }
        if(e.getSource()==btnPlus){
            String expression =display.getText();
            expression+="+";
            display.setText(expression);
        }
        if(e.getSource()==btnMinus){
            String expression =display.getText();
            expression+="-";
            display.setText(expression);
        }
        if(e.getSource()==btnDivide){
            String expression =display.getText();
            expression+="/";
            display.setText(expression);
        }
        if(e.getSource()==btnMultiply){
            String expression =display.getText();
            expression+="*";
            display.setText(expression);
        }

        if(e.getSource()==btnEquals){
            int a,b,i;
            char operator='+';

            String expression=display.getText();
            String tempA="",tempB="";
            for( i=0;i<expression.length();i++){
                if(Character.isDigit(expression.charAt(i))){
                    tempA+=expression.charAt(i);
                }
                else {
                    operator=expression.charAt(i);
                    break;
                }
            }
            tempB=expression.substring(i+1);
            a=Integer.parseInt(tempA);
            b=Integer.parseInt(tempB);

            int result=0;
            switch (operator){
                case '+':
                    result=a+b;
                    break;
                case '-':
                    result=a-b;
                    break;
                case '/':
                    result=a/b;
                    break;
                case '*':
                    result=a*b;
                    break;

            }
            display.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }


}
