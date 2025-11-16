package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {

    JLabel l1,type,card,number,pin,pinnumber,carddetail,pindetail,services;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    ButtonGroup groupaccount;
    JButton clear,cancel,submit;

    String formno;

    SignupThree(String formno){
        this.formno=formno;

        setLayout(null);


        l1=new JLabel("PAGE 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        type=new JLabel("Account Type:");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);

        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,180,150,20);
        r1.setBackground(Color.WHITE);
        add(r1);

        r2=new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(350,180,250,20);
        r2.setBackground(Color.WHITE);
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100,220,250,20);
        r3.setBackground(Color.WHITE);
        add(r3);

        r4=new JRadioButton("Recurring Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350,220,250,20);
        r4.setBackground(Color.WHITE);
        add(r4);

        groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        card=new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);

        number=new JLabel("XXXX-XXXX-XXXX-XXXX");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);

        carddetail=new JLabel("Your 16 digit card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(330,330,200,20);
        add(carddetail);

        pin=new JLabel("PIN: ");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);

        pinnumber=new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pinnumber.setBounds(330,370,300,30);
        add(pinnumber);

        pindetail=new JLabel("Your 4 digit PIN Number");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(330,400,200,20);
        add(pindetail);

        services =new JLabel("Services Required: ");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,400,20);
        add(services);

        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(300,500,200,30);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4=new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(300,550,200,30);
        add(c4);

        c5=new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(300,600,200,30);
        add(c6);

        c7=new JCheckBox("I hereby declares that the above entered detals are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,650,600,30);
        add(c7);

        clear=new JButton("CLEAR");
        clear.setBounds(500,700,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        submit=new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(620,700,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel=new JButton("CANCEL");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(380,700,100,30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupThree("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }else if (e.getSource()==clear){
            System.out.println(" ");
        } else if (e.getSource()==submit) {
            String accountType=null;
            if(r1.isSelected())accountType="Saving Account";
            if(r2.isSelected())accountType="Fixed Deposite Account";
            if(r3.isSelected())accountType="Current Account";
            if(r4.isSelected())accountType="Recurring Account";

            Random random=new Random();
            String cardnumber=""+Math.abs(((random.nextLong())%90000000L+5040936000000000L));
            String pinnumber=""+Math.abs(((random.nextLong())%9000L+1000L));

            String facility="";
            if(c1.isSelected())facility+=" ATM Card";
            if(c2.isSelected())facility+=" Internet Banking";
            if(c3.isSelected())facility+=" Mobile Banking";
            if(c4.isSelected())facility+=" EMAIL & SMS Alerts";
            if(c5.isSelected())facility+=" Check Book";
            if(c6.isSelected())facility+=" E-Statement";

            try{
                if(accountType.equals(""))JOptionPane.showMessageDialog(null,"Account Type is required");
                if (!c7.isSelected())JOptionPane.showMessageDialog(null, "Please confirm that the details are correct.");
                else {
                    Conn conn=new Conn();
                    String query1="insert into signupthree values('" + formno + "', '" + accountType + "', '" + cardnumber + "', '" + pinnumber + "', '" + facility + "')";
                    String query3="insert into login values('" + formno + "', '" + cardnumber + "', '" + pinnumber + "')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query3);

                    JOptionPane.showMessageDialog(null,"Card Number: "+cardnumber+"\n Pin: "+pinnumber);

                    setVisible(false);
                    new Login().setVisible(true);
                }
            }catch (Exception ex){
                System.out.println();
            }
        }

    }
}
