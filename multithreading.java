Multithreading in Java
Multithreading is a feature in Java that allows a program to execute two or more parts of a program simultaneously. 
Each part of the program is called a thread. It improves the performance of programs by using the CPU efficiently.
Key Points
A Thread is the smallest unit of a program that can run independently.
Multithreading helps in multi-tasking within a single program.
Threads share the same memory but run independently, so it saves resources.
How to create Threads in Java?
There are two methods:
1️.By extending Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}
2️.By implementing Runnable interface
class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}
The run() method contains the code which the thread will execute.
To start the thread → use:
start();
Advantages of Multithreading
Advantage	Explanation
Faster Execution	Multiple tasks run at the same time
Better CPU utilization	CPU doesn't sit idle
Efficient Program Execution	Tasks like downloading and playing music can run together
Reduced Response Time	Useful in games, animations, servers
Real Life Examples
Watching YouTube while loading comments
Uploading a file while browsing

Gaming: movement + music + network activity
