/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package control;
import java.util.ArrayList;
/**
 *
 * @author gotle
 */
public interface Ejercicios {
   
    public String calculateCube(int n);
    public String calculateSquare(int n);
    public ArrayList<Double> calculateSalary(ArrayList<Integer> Horas ,ArrayList<Double> PrecioHora,int n);
    public String OrganizeSalary(ArrayList<String> Nombres ,ArrayList<Double> Salario,int n);
    public String CalculateMoney(int money);
}
