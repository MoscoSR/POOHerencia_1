package org.smosquera.poo;

public class Persona {

        public Persona (String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Persona(String name, String lastName, String numFiscal) {
            this(name, lastName);
            this.numFiscal = numFiscal;
        }

        public Persona (String name, String lastName, String numFiscal, String address) {
            this(name, lastName, numFiscal);
            this.address = address;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumFiscal() {
        return numFiscal;
    }

    public void setNumFiscal(String numFiscal) {
        this.numFiscal = numFiscal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return  "nombre: " + name
                + " lastname: "  + lastName
                + " numero Fiscal: " +  numFiscal
                +  " direccion: " +  address;
    }

    private String name;
    private String lastName;
    private String numFiscal;
    private String address;

}
