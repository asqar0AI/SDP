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



## How the Factory Design Pattern is Used
In this project, the Factory Design Pattern is applied to create different types of computers, including PCs and Servers. The pattern provides an abstract factory interface (ComputerAbstractFactory) and concrete factory implementations (PCFactory and ServerFactory) to produce instances of these computers. The ComputerFactory class is responsible for creating the computer objects.

## Project Files

### design/abstractfactory/Computer.java

#### Class Description
- This class, `Computer`, is the abstract base class for different computer models in the Factory Design Pattern implementation.
- It defines a basic computer structure with abstract methods to retrieve information about RAM, HDD, and CPU.
- Additionally, it provides a `toString()` method to display the computer's specifications.

#### Methods
- `public abstract String getRAM()`: An abstract method to get the RAM specification of the computer.
- `public abstract String getHDD()`: An abstract method to get the HDD specification of the computer.
- `public abstract String getCPU()`: An abstract method to get the CPU specification of the computer.
- `@Override public String toString()`: Overrides the `toString()` method to return a string representation of the computer's specifications, including RAM, HDD, and CPU.

### design/abstractfactory/ComputerAbstractFactory.java

#### Interface Description
- The `ComputerAbstractFactory` interface is a part of the Factory Design Pattern implementation in this project.
- It defines a contract for creating instances of `Computer` objects.
- The purpose of this interface is to allow concrete factories to produce computer objects with specific configurations while adhering to a common factory pattern.

#### Methods
- `Computer createComputer()`: This method is responsible for creating and returning a `Computer` object. Concrete classes implementing this interface will provide their own implementation of this method, producing different types of computers, such as PCs or Servers.

### design/abstractfactory/ComputerFactory.java

#### Class Description
- The `ComputerFactory` class is a key component in the Factory Design Pattern implementation of this project.
- It acts as a client and provides a method for creating `Computer` objects through the use of a `ComputerAbstractFactory`.
- This class promotes the decoupling of the client code from the specific details of creating different computer models.

#### Methods
- `public static Computer getComputer(ComputerAbstractFactory factory)`: This static method takes a `ComputerAbstractFactory` as a parameter and uses it to create a `Computer` object. It delegates the creation of the computer to the provided factory, adhering to the Factory Design Pattern.
