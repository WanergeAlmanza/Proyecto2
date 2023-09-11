/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author david.gomeza
 */

	
public class Calcular implements control.CalcularIF{
    
    public Calcular() {
    }

    @Override
    public float Add(float one, float two) {
        return one + two;
    }

    @Override
    public float Substract(float one, float two) {
        return one - two;
    }

    @Override
    public float Multiply(float one, float two) {
        return one * two;
    }

    @Override
    public float Divide(float one, float two) {
        return two == 0.0 ? 0:one / two;
    }
    
    @Override
    public int Residue(int one, int two) {          
        return two == 0 ? one:one % two;
    } 
    
    @Override
    public int DisplaceBitsLeft(int one, int two) {
        return one << two;
    }
    
    @Override
    public int DisplaceBitsRightWhSig(int one, int two) {
        return one >> two;
    } 
    
    @Override
    public int DisplaceBitsRightWhZero(int one, int two) {
        return one >>> two;
    } 
    
    @Override
    public boolean MinorThat(float one, float two) {
        return one < two;
    }
    
    @Override
    public boolean BiggerThat(float one, float two) {
        return one > two;
    }
    
    @Override
    public boolean MinorOrEqualThat(float one, float two) {
        return one <= two;
    }

    @Override
    public boolean BiggerOrEqualThat(float one, float two) {
        return one >= two;
    }
    
    @Override
    public boolean Equals(float one, float two) {
        return one == two;
    }
    
    @Override
    public boolean DesEquals(float one, float two) {
        return one != two;
    }

    @Override
    public int ProductAnd(int uno, int dos) {
        return (uno & dos);
    }

    @Override
    public int AdditionXor(int uno, int dos) {
        return (uno ^ dos);
    }

    @Override
    public int AdditionOr(int uno, int dos) {
        return (uno | dos);
    }
    
    @Override
    public int IncrementUnit(int one) {
        one++;
        return one;
    }
    
    @Override
    public int DecrementUnit(int one) {
        one--;
        return one;
    } 
    @Override
    public int ChangeOfBits(int one) {
        return ~one;
    } 
    @Override
    public float SumeUnary(float one) {
        return +one;
    } 
    @Override
    public float RestUnary(float one) {
        return -one;
    } 

}
