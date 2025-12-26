Basic Applet Program
import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello Java Applet", 50, 50);
    }
}
HTML Code to Run Applet
<html>
<body>
<applet code="MyApplet.class" width="300" height="200">
</applet>
</body>
</html>
Applet Tag Attributes
code → Applet class name
width → Width of applet
height → Height of applet
Advantages of Applets
Platform independent
Secure (runs in sandbox)
Supports graphics and animation
Easy client-side execution
Disadvantages of Applets
Requires Java plugin
Slow performance
Security restrictions
Applets are deprecated in modern Java
Difference: Applet vs Application
Applet	Application
No main()	Has main()
Runs in browser	Runs independently
Extends Applet	No need to extend
Client-side	Standalone
Security in Applets
Runs in sandbox
Cannot access local files
Cannot run system commands
Cannot connect to unauthorized servers
Why Applets are Deprecated?
Browser support removed
Security issues
Replaced by JavaFX, HTML5, JavaScript
Viva Tips (Very Important 🔥)
Applet is not used now, but asked for theory
Remember life cycle methods
Know difference between applet and application

