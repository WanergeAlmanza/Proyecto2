/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author David.gomez
 */

public class ejercicio2 implements control.Ejercicios{

    public ejercicio2() {
    }
    
    @Override
    public String calculateCube(int n){
        int impar;
        int acum = 0;
        String result = "";
        for (int i = 1; i < n+1; i++) {
            impar = (i*(i-1))+1;
            for (int j = 1; j <= i; j++) {
                if (j!=i){
                    result += String.valueOf(impar) + " + ";
                } else {
                    result += String.valueOf(impar);
                }
                acum += impar;
                impar += 2;
            }
            result += " el cubo del numero " +i+ "^3  es: "+acum+".\n";
            acum = 0;
        }     
        return result;
    }
    
    @Override
    public String calculateSquare(int n){
        int acum;
        String result = "";
        int answer;
         for (int i = 0; i < n; i++) {
             answer = 1;
             acum = 1;
             String Sume = "1";
            for (int j = 1; j <= i; j++) {
                acum += 2;
                answer +=  acum;
                Sume += " + " + String.valueOf(acum);
            }
             result = result+String.valueOf(answer)+"^2 " + " = " + Sume + " *\n " ;
        }
         return result;
    }
    
    @Override
    public ArrayList<Double> calculateSalary(ArrayList<Integer> Horas ,ArrayList<Double> PrecioHora,int n){
        ArrayList<Double> arraySalary = new ArrayList<>();
        for (int i = 0; i < n; i++) {
             if(Horas.get(i) > 48){
                int HorasExtra = Horas.get(i)-48; 
                arraySalary.add((48*PrecioHora.get(i)+HorasExtra*PrecioHora.get(i)*1.35));
             }
             else{
                arraySalary.add(Horas.get(i)*PrecioHora.get(i));
             }
        }
      return arraySalary;
    }
    
    @Override
    public String OrganizeSalary(ArrayList<String> Nombres ,ArrayList<Double> Salario,int n){
        double suma = 0;
        String result = "";
         for (int i = 0; i < n; i++) {
             result += Nombres.get(i)+" gano en este mes la cantidad de: "+Salario.get(i)+ "$ . \n";
             suma += Salario.get(i);
        }
         result += "El Gasto total de la empresa en los empleados fue de: "+suma+" $";
      return result;
    }
    
    @Override
    public String CalculateMoney(int Money){
        int [] Billetes={100000,50000,20000,10000,5000,2000,1000,500,200,100,50};
        int x;
        String result = "";
        for (int i = 0; i < Billetes.length; i++) {
            x = Money/Billetes[i];
            if(x != 0){
                if(Billetes[i] > 1000){
                    result += x+" Billetes de "+Billetes[i]+" \n";}
                else{
                    result += x+" Monedas de "+Billetes[i]+" \n";}
            }
            Money %= Billetes[i];
        }
        if(Money != 0){
            result += "con un residuo de "+Money;
        }
        return result;
    } 
    
}
