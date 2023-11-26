import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrintTicket1 extends JFrame {
    public PrintTicket1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime) {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel panel2 = new JPanel(null);

        panel2.setPreferredSize(new Dimension(500, 200));

        JLabel lTitle = new JLabel("<html><b><font color=\"#C71585\",size=\"7\">Airline Ticket</font></b></html>");
        JLabel lFrom = new JLabel("<html><b><font color=\"#000000\">From &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></b><font color=\"#778899\">" + sFrom + "</font></html>");
        JLabel lTo = new JLabel("<html><font color=\"#000000\">To &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">" + sTo + "</font></html>");
        JLabel lClass = new JLabel("<html><font color=\"#000000\">Class &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">" + sClass + "</font></html>");
        JLabel lBookingDate = new JLabel("<html><font color=\"#000000\">Traveling Date &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">" + sBookingDate + "</font></html>");
        JLabel lPrice = new JLabel("<html><font color=\"#000000\">Total Price &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">" + iPrice + "</font></html>");
        JLabel lTime = new JLabel("<html><font color=\"#000000\">Departure Time  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">" + sTime + "</font></html>");
        JLabel lAdult = new JLabel("<html><font color=\"#000000\">Adult &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">" + iAdult + "</font></html>");
        JLabel lChildren = new JLabel("<html><font color=\"#000000\">Children &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : &nbsp;</font><font color=\"#778899\">" + iChildren + "</font></html>");
        JLabel lInfant = new JLabel("<html><font color=\"#000000\">Infant &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">" + iInfant + "</font></html>");
        JLabel lWishes = new JLabel("<html><body><I><font color=\"#D2B48C\">Wish you a happy journey</font></I></body></html>");

        JLabel lTicketNo = new JLabel("<html><font color=\"#000000\">Ticket Number &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></html>");
        JLabel lBookedBy = new JLabel("<html><font color=\"#000000\">Booked By &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></html>");

        JLabel lEmpty = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        JLabel lDemo = new JLabel("<html><U><font color=\"#8FBC8F\">Airline-Project Developed By</font></U></html>");
        JLabel lFranklin = new JLabel("<html><I><font color=\"#8FBC8F\">R Franklin Bourgia Singh</font></I></html>");
        JLabel lRavi = new JLabel("<html><I><font color=\"#8FBC8F\">V.R Ravi Sankar</font></I></html>");
        JLabel lMayuran = new JLabel("<html><I><font color=\"#8FBC8F\">B Mayuran</font></I></html>");
        JLabel lSathya = new JLabel("<html><I><font color=\"#8FBC8F\">Sathyaraj</font></I></html>");

        lTitle.setBounds(170, 15, 500, 45);
        lFrom.setBounds(20, 80, 300, 20);

        lTo.setBounds(20, 125, 300, 20);
        lClass.setBounds(20, 170, 300, 20);
        lBookingDate.setBounds(20, 215, 300, 20);
        lPrice.setBounds(20, 260, 300, 20);
        lTime.setBounds(20, 305, 300, 20);
        lAdult.setBounds(20, 345, 300, 20);
        lChildren.setBounds(20, 385, 300, 20);
        lInfant.setBounds(20, 430, 300, 20);

        lWishes.setBounds(530, 435, 300, 20);

        lTicketNo.setBounds(320, 80, 300, 20);
        lBookedBy.setBounds(320, 125, 300, 20);

        lEmpty.setBounds(3, 445, 1000, 20);

        lDemo.setBounds(280, 465, 300, 20);
        lFranklin.setBounds(285, 485, 300, 20);
        lRavi.setBounds(285, 505, 300, 20);
        lMayuran.setBounds(285, 525, 300, 20);
        lSathya.setBounds(285, 545, 300, 20);

        panel2.add(lTitle);
        panel2.add(lFrom);
        panel2.add(lTo);
        panel2.add(lClass);
        panel2.add(lBookingDate);
        panel2.add(lAdult);
        panel2.add(lChildren);
        panel2.add(lInfant);
        panel2.add(lPrice);
        panel2.add(lTime);
        // panel2.add(lEmpty);

        panel2.add(lWishes);

        panel2.add(lTicketNo);

        panel2.add(lBookedBy);
        panel2.add(lEmpty);
        panel2.add(lDemo);
        panel2.add(lFranklin);
        panel2.add(lRavi);
        panel2.add(lMayuran);
        panel2.add(lSathya);

        panel2.setBackground(Color.white);

        c.add(panel2, BorderLayout.CENTER);

        // Set the default close operation and make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Example usage:
        new PrintTicket1("CityA", "CityB", "Business", 2, 1, 0, "2023-11-23", 500, "12:00 PM");
    }
}
