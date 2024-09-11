package com.mycompany.project1;

public class Chefe extends Empregado {
    
    private double salario;

    public Chefe(String n, String f, double s) {
        super(n, f);
        setSalario(s);
    }

    private void setSalario(double s) {
        
        salario =( s > 0 ? s:0.0);
        
    }
    
    @Override
    public double ganhar() {return salario;}
    private void SetSalario(double s){  
    }
}
