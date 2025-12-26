What is an Applet in Java?
An Applet is a small Java program that runs inside a web browser or an applet viewer, not as a standalone application.
Applets are mainly used for GUI-based programs like animations, graphics, and interactive content.
Key Points about Applets
Runs inside a browser
Extends Applet or JApplet
No main() method
Uses AWT for GUI
Executed on client side
Embedded in HTML using <applet> tag
Types of Applets
1. Local Applet
Stored on the local system
Loaded from local file system
2. Remote Applet
Stored on a remote server
Loaded using internet (URL)
Applet Life Cycle
Applet has 4 important methods:
init()
Called once
Used for initialization
start()
Called after init()
Executes when applet starts or restarts
paint(Graphics g)
Used to draw graphics and display output
stop()
Called when applet is stopped
destroy()
Called when applet is removed completely
Life Cycle Flow:
init() → start() → paint()
        ↓
      stop()
        ↓
     destroy()



