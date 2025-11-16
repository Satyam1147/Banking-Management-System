package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener { // extend Jframe to create frame

    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); //import image
        Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT); // set size of icon image
        JLabel label=new JLabel(new ImageIcon(i2)); // convert image into imageicon and put it into jlabel
        label.setBounds(70,10,100,100);
        add(label); // put image on frame

        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno=new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,200,40);
        add(cardno);

        cardTextField=new JTextField();
        cardTextField.setBounds(300,150,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);

        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Osward",Font.BOLD,28));
        pin.setBounds(120,220,250,40);
        add(pin);

        pinTextField=new JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

        login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        signup=new JButton("SIGNUP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);

        setSize(800,480); // set size of frame
        setVisible(true); //set visibility to true
        setLocation(350,200); //change default location to open it in centre
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            Conn conn=new Conn();
            String cardnumber=cardTextField.getText();
            String pinnumber=pinTextField.getText();
            String query="select * from login where cardnumber='"+cardnumber+"' and pin='"+pinnumber+"'";
            try {
                ResultSet rs =conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect card number or Pin");
                }
            }catch (Exception ae){
                System.out.println(ae);
            }
        }else if(e.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }else if(e.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
    }
    public static void main(String[] args) {

        new Login();
    }
}
