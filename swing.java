Swing in Java — Simple Explanation
Swing is a GUI (Graphical User Interface) toolkit in Java used to create windows, buttons, forms, menus, tables, and other desktop applications.
It is part of Java Foundation Classes (JFC).
Main Points (Very Easy to Remember)
1. Swing is used to build desktop applications
Example: forms, calculators, editors, games, etc.
2. It is built on top of AWT
Swing is more powerful than AWT because:
Swing components are lightweight
Swing has more components
Swing looks the same on all operating systems
3. Swing components start with 'J'
Examples:
JFrame – window
JButton – button
JLabel – text label
JTextField – text box
JPanel – panel
4. Swing supports pluggable look and feel
You can change how the UI looks without changing the code.
5. Event handling is same as AWT
Button clicks → events → handled by listeners.
Small Example (Perfect for understanding)
import javax.swing.*;
public class SimpleSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing App");
        JButton btn = new JButton("Click Me");
        btn.setBounds(80, 100, 100, 40);
        frame.add(btn);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
Why Swing is Better Than AWT
AWT	Swing
Heavyweight	Lightweight
Limited UI components	Many UI components
OS-dependent look	Same look across OS
Slower	Faster & Flexible
