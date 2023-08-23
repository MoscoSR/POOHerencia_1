package org.smosquera.poo;

public class Empleado extends Persona {
    public Empleado(String name, String lastName) {
        super(name, lastName);
    }

    public Empleado (String name, String lastName, String numFiscal, String address, Double remuneration, int employeeId) {
        super(name, lastName, numFiscal, address);
        this.remuneration = remuneration;
        this.employeeId = employeeId;
    }

    public Double getRemuneration() {
        return remuneration;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void increaseRemuneration (int porcentaje) {
        this.remuneration = remuneration * porcentaje /100;
    }


    @Override
    public String toString() {
        return  "Empleado id: " + employeeId  + "Remuneracion: " + remuneration + ", " + super.toString();
    }

    private Double remuneration;
    private int employeeId;
}
