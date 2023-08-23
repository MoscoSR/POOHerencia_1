package org.smosquera.poo;

public class Cliente extends Persona {
    public Cliente (String name, String lastName, String numFiscal, String address, int clienteId) {
        super(name, lastName, numFiscal, address);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return  "Cliente id: " + clienteId + ", " + super.toString();
    }

    private int clienteId;
}
