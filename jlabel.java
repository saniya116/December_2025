What is JLabel?
JLabel is a Swing component used to display text, images, or both in a GUI.
It cannot take user input, only shows information.
Package:
javax.swing.JLabel
Why use JLabel?
Display text messages
Show images/icons
Add captions to text fields
Improve UI readability
Constructors of JLabel
JLabel()
JLabel(String text)
JLabel(Icon icon)
JLabel(String text, Icon icon, int alignment)
Example:
JLabel label = new JLabel("Welcome");
Important Methods of JLabel
Method	Purpose
setText()	Sets text
getText()	Gets text
setIcon()	Sets image
setFont()	Changes font
setForeground()	Changes text color
setBackground()	Sets background color
setHorizontalAlignment()	Aligns text
setVerticalAlignment()	Aligns text
setBounds()	Sets position & size
Text Alignment Constants
JLabel.LEFT
JLabel.CENTER
JLabel.RIGHT
Simple JLabel Program
import javax.swing.*;
class JLabelExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("JLabel Demo");
        JLabel l = new JLabel("Hello Saniya 😊");
        l.setBounds(50, 50, 200, 30);
        f.add(l);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
Output:
A window appears showing text: Hello Saniya 😊
JLabel with Image
ImageIcon icon = new ImageIcon("photo.png");
JLabel imgLabel = new JLabel(icon);
Set Font & Color
l.setFont(new Font("Arial", Font.BOLD, 16));
l.setForeground(Color.BLUE);
