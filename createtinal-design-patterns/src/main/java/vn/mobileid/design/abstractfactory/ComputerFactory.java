package vn.mobileid.design.abstractfactory;

import vn.mobileid.design.model.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
