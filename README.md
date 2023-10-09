# Testing Factory Design Pattern in Java

## Project Overview
This Java project is dedicated to testing and demonstrating the Factory Design Pattern, a creational design pattern that provides an interface for creating objects but allows subclasses to alter the type of objects that will be created. In this project, we'll explore its application in the context of computer manufacturing.

## Project Structure
The project structure is organized as follows:


src<br>
├── design<br>
│&nbsp;&nbsp;&nbsp;&nbsp;├── abstractfactory<br>
│&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── Computer.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── ComputerAbstractFactory.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── ComputerFactory.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── PCFactory.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;└── ServerFactory.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;├── factory<br>
│&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;└── ComputerFactory.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;└── model<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── Computer.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── PC.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── Server.java<br>
└──── test<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── TestDesignPatterns.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── TestFactory.java<br>


