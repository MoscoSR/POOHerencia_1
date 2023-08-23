package org.smosquera.poo;

public class Gerente  extends Empleado{
     public Gerente (String name, String lastName) {
         super(name, lastName);
     }

     public Gerente (String name, String lastName, String numFiscal, String address, Double remuneration, int employeeId) {
      super(name, lastName, numFiscal, address, remuneration, employeeId);
     }

     public Gerente (String name, String lastName, String numFiscal, String address, Double remuneration, int employeeId, Double budget ) {
         super(name, lastName, numFiscal, address, remuneration, employeeId);
         this.budget = budget;
     }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
         this.budget = budget;
    }

    @Override
    public String toString() {
        return  "Presupuesto: " + budget + ", " + super.toString();
    }

    private  Double budget;
}