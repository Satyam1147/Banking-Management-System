package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    JLabel additionalDetails,religionlevel,categorylevel,dob,genderlevel,qualificationlevel,occupationlevel,panlevel,aadharlevel,citizenlevel,pin;
    JTextField pan,aadhar;
    JComboBox religion,category,income,education,occupation;
    JRadioButton syes,sno,eyes,eno;
    ButtonGroup citizengroup,existinggroup;
    JButton clear,next;
    String formno;

    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);

        setTitle("New Account Application Form- Page 2");

        additionalDetails=new JLabel("Page 2: Additional Details: ");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        religionlevel=new JLabel("Religion: ");
        religionlevel.setFont(new Font("Raleway",Font.BOLD,20));
        religionlevel.setBounds(100,140,100,30);
        add(religionlevel);

        String[] valReligion={"Hindu","Muslim","Christian","Others"};
        religion=new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);

        categorylevel=new JLabel("Categories: ");
        categorylevel.setFont(new Font("Raleway",Font.BOLD,20));
        categorylevel.setBounds(100,190,200,30);
        add(categorylevel);

        String[] valcategory={"General","OBC","SC","ST","Others"};
        category=new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);

        dob=new JLabel("Income: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        String[] incomecategory={"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        income=new JComboBox(incomecategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);

        genderlevel=new JLabel("Educational: ");
        genderlevel.setFont(new Font("Raleway",Font.BOLD,20));
        genderlevel.setBounds(100,290,200,30);
        add(genderlevel);

        qualificationlevel=new JLabel("Qualification: ");
        qualificationlevel.setFont(new Font("Raleway",Font.BOLD,20));
        qualificationlevel.setBounds(100,315,200,30);
        add(qualificationlevel);

        String[] educationaValues={"Non-Graduation","Graduate","Post-Graduation","Doctorate","Others"};
        education=new JComboBox(educationaValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);

        occupationlevel=new JLabel("Occupation: ");
        occupationlevel.setFont(new Font("Raleway",Font.BOLD,20));
        occupationlevel.setBounds(100,390,200,30);
        add(occupationlevel);

        String[] occupationValues={"Salaried","Self-Employed","Business","Student","Others"};
        occupation=new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        panlevel=new JLabel("Pan Number: ");
        panlevel.setFont(new Font("Raleway",Font.BOLD,20));
        panlevel.setBounds(100,440,400,30);
        add(panlevel);

        pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);

        aadharlevel=new JLabel("Aadhar Number: ");
        aadharlevel.setFont(new Font("Raleway",Font.BOLD,20));
        aadharlevel.setBounds(100,490,400,30);
        add(aadharlevel);

        aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);

        citizenlevel=new JLabel("Senior Citizen: ");
        citizenlevel.setFont(new Font("Raleway",Font.BOLD,20));
        citizenlevel.setBounds(100,540,400,30);
        add(citizenlevel);

        syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.white);
        add(syes);

        sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.white);
        add(sno);

        citizengroup=new ButtonGroup();
        citizengroup.add(syes);
        citizengroup.add(sno);


        pin=new JLabel("Existing Account: ");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,590,400,30);
        add(pin);

        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.white);
        add(eyes);

        eno=new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.white);
        add(eno);

        existinggroup=new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);

        clear=new JButton("CLEAR");
        clear.setBounds(500,660,80,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String sreligion= (String) religion.getSelectedItem();
        String scategory= (String) category.getSelectedItem();
        String sincome= (String) income.getSelectedItem();
        String seducation= (String) education.getSelectedItem();
        String soccupation= (String) occupation.getSelectedItem();
        String seniorcitegen=null;
        if(syes.isSelected())seniorcitegen="Yes";
        else if (sno.isSelected())seniorcitegen="No";

        String existingaccount=null;
        if(eyes.isSelected())existingaccount="Yes";
        else if(eno.isSelected())existingaccount="No";

        String span=pan.getText();
        String saadhar=aadhar.getText();

        try {
            if (e.getSource() == clear) {
                pan.setText("");
                aadhar.setText("");
                religion.setSelectedIndex(-1);
                category.setSelectedIndex(-1);
                income.setSelectedIndex(-1);
                education.setSelectedIndex(-1);
                occupation.setSelectedIndex(-1);
                citizengroup.clearSelection();
                existinggroup.clearSelection();
            } if (e.getSource() == next) {
                if (span.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Pan is required");
                } if (saadhar.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Aadhar is required");
                } if (seniorcitegen == null) {
                    JOptionPane.showMessageDialog(null, "All fields are required");
                } if (existingaccount == null) {
                    JOptionPane.showMessageDialog(null, "All fields are required");
                } else {

                    Conn c = new Conn();
                    String query = "insert into signuptwo values('" + formno + "', '" + sreligion + "', '" + scategory + "', '" + sincome + "', '" + seducation + "', '" + soccupation + "', '" + span + "', '" + saadhar + "', '" + seniorcitegen + "', '" + existingaccount + "')";
                    c.s.executeUpdate(query);

                    setVisible(false);
                    new SignupThree(formno).setVisible(true);
                }
            }
        }
        catch (Exception a){
                    System.out.println();
                }
            }
    public static void main(String[] args) {
        new SignupTwo("");
    }

}
