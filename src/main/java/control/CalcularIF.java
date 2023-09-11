/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author david.gomeza
 */
public interface  CalcularIF {
    
    public float Add(float uno, float dos); //Sumar dos numeros
    public float Substract(float uno, float dos); //Restar dos numeros
    public float Multiply(float uno ,float dos); //Multiplicar dos numeros
    public float Divide(float uno ,float dos); //Dividir dos numeros
    public int Residue (int uno,int dos); // Residuo al dividir dos numeros
    public int DisplaceBitsLeft (int uno,int dos); //Desplazamiento de bits a la izquierda
    public int DisplaceBitsRightWhSig (int uno,int dos); //Desplazamiento de bits a la derecha con signo
    public int DisplaceBitsRightWhZero (int uno,int dos); //Desplazamiento de bits a la derecha con cero
    public boolean MinorThat (float uno,float dos); //Menor que
    public boolean BiggerThat (float uno,float dos); //Mayor que
    public boolean MinorOrEqualThat (float uno,float dos); //Menor igual que
    public boolean BiggerOrEqualThat (float uno,float dos); //Mayor igual que
    public boolean Equals (float uno,float dos); //Comparacion de igualdad entre dos numeros
    public boolean DesEquals (float uno,float dos); //Comparacion de diferencia entre dos numeros
    public int ProductAnd(int uno,int dos); // cambio de bits and
    public int AdditionXor(int uno,int dos); // cambio de bits xor exclusivo
    public int AdditionOr(int uno,int dos); // cambio de bits or
    public int IncrementUnit(int uno); //Incremento unitario
    public int DecrementUnit(int uno); //Decremento unitario
    public int ChangeOfBits(int uno);
    public float SumeUnary(float uno); //Decremento unitario
    public float RestUnary(float uno);
    
}
