Different Types of Layout Managers in Java AWT
In Java AWT, layout managers are used to arrange components (Buttons, TextFields, Labels, etc.) inside a container 
like Frame, Panel, or Applet. They automatically manage the size and position of components based on the screen size and window changes.
Java provides the following commonly used layout managers:
1️.FlowLayout
Arranges components in a row, left to right
Moves to the next line if space ends
Default layout for Applet & Panel
Example:
setLayout(new FlowLayout());
2️.BorderLayout
Divides the container into 5 regions:
North, South, East, West, Center
Only one component per region
Example:
setLayout(new BorderLayout());
add(button1, BorderLayout.NORTH);
3.GridLayout
Arranges components in a grid (rows & columns)
Each cell has equal size
Example:
setLayout(new GridLayout(2, 3));
4️.CardLayout
Allows multiple components to share the same space
Only one component visible at a time (like sliding cards)
Used in tab structure, step forms
Example:
CardLayout cl = new CardLayout();
setLayout(cl);
5️.GridBagLayout
Most flexible layout
Allows different component sizes and positions
Hardest to configure
Example:
setLayout(new GridBagLayout());
