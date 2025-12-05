VM Architecture (Java Virtual Machine) — Full Detailed Explanation
The Java Virtual Machine (JVM) is a virtual runtime environment that executes Java bytecode.
It is the main reason why Java is called Platform Independent — because JVM is available for many Operating Systems (Windows, Linux, Mac etc.).
Java program → compiled into Bytecode (.class file) → executed by JVM.
JVM Architecture
JVM mainly consists of:
1️. Class Loader Subsystem
2️.Runtime Data Areas (Memory Areas)
3️.Execution Engine
4️.Java Native Interface (JNI)
5️. Native Method Libraries
1️.Class Loader Subsystem

It loads the .class files into JVM.
Loading: Finds and loads the bytecode
Linking
 • Verification → checks bytecode is safe and valid
 • Preparation → allocates memory for static variables & default values
 • Resolution → converts symbolic references to direct references
 Initialization: Assign actual values to static variables and run static blocks
2️. Runtime Data Areas (JVM Memory)
JVM memory is divided into multiple parts:
Memory Area	Purpose
Method Area	Stores class code, static variables, method info
Heap	Stores objects and instance variables
Java Stack	One stack per thread; stores method calls + local variables
PC Register	Stores current executing instruction address per thread
Native Method Stack	Supports native (C/C++) method execution
Heap and Method Area are shared by all threads
Stack, PC register, Native stack are private to thread
3️.Execution Engine
It executes bytecode line by line.
Interpreter — executes bytecode line-by-line (slow but immediate)
JIT (Just-In-Time Compiler) — converts frequently executed code into machine code → makes Java faster
Garbage Collector (GC) — automatically removes unused objects from heap → memory managed automatically
4️.Java Native Interface (JNI)
When Java needs to use functions written in other languages (like C/C++), JVM uses JNI to communicate.
5️.Native Method Libraries
These are actual system-level libraries (DLL in Windows or .so in Linux) used by native methods.

