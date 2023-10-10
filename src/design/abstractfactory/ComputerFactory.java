package design.abstractfactory;

import design.model.Computer;

public class ComputerFactory {
    /**
     * Creates and returns a `Computer` object using a specified factory.
     *
     * @param factory The `ComputerAbstractFactory` responsible for creating the computer.
     * @return A `Computer` object created by the provided factory.
     */
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
