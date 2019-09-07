
package Calculadora;

import java.util.Arrays;

public class ClasseCalculadora {
    String num1;// representa o primeiro valor
    String num2;// representa o segundo valor
    String op; // representa a operação que vai ser realizada
    String resultado;// representa o resultado e econ. mem.
    char array[] = new char[35];// recolhe os valores digitados
    int cont; // trabalha junto com o arry
    boolean bo1; // controla qual valor deve ser modificado
    boolean bo2;
    boolean neg;
    boolean virgula;
    
    
    ClasseCalculadora(){
        op = " ";
        limpararray();
        cont = 0;
        virgula = false;
    }
    
    void limpararray(){
        for(int i = 0; i<array.length;i++){
            array[i] = 'n';
            neg = false;
            virgula = false;
        }
    }
    void zerar(){
        num1 = "0";
        limpararray();
        num2 = "0";
        op = " ";
        bo1 = false;
        bo2 = false;
        cont = 0;
        virgula = false;
    }
    void negativar(){
        if(bo1){
            double temp1 = Double.valueOf(num2);
            temp1 = temp1 *(-1);
            num2 = String.valueOf(temp1);
        }else{
            double temp1 = Double.valueOf(num1);
            temp1 = temp1 *(-1);
            num1 = String.valueOf(temp1);
        }
    }
    void virgula(){
        if(!virgula){
            if(bo1){
                array[cont] = '.';
                num2 = cleararray(array);
                bo2 = true;
                cont++;
                virgula = true;
            }else{
                array[cont] = '.';
                num1 = cleararray(array);
                cont++;
                virgula = true;
            }
        }
    }
    void ce(){
        if(bo1){
            num2 = "0";
            cont = 0;
            limpararray();
        }else{
            num1 = "0";
            cont = 0;
            limpararray();
        }
    }
    
    void igual(){
        num1 = resultado;
        limpararray();
        num2 = "0";
        op = " ";
        cont = 0;
        bo2 = false;
    }
    
    void recebernum(char numero){
        if(bo1){
            array[cont] = numero;
            num2 = cleararray(array);
            bo2 = true;
            cont++;
        }else{
            array[cont] = numero;
            num1 = cleararray(array);
            cont++;
        }
    }
    void receberop(String operação){
        if(bo2){
            igual();
            op = operação;
        }else{
            op = operação;
            limpararray();
            bo1 = true;
            cont = 0;
        }
        
    }
    
    String operar(){
        if(op == " "){
            if(virgula){
                return num1;
            }else{
                return num1 + ".0";
            }
        }else{
            String resultado = new String();
            resultado = String.valueOf(transformar());
            return resultado;
        }
    }
    
    String resultado(){
        resultado = operar();
        return resultado;
    }
    
    double transformar(){
        double nu1 = Double.valueOf(num1);
        double nu2 = Double.valueOf(num2);
        double temp;
        switch(op){
            case "+":
                temp = nu1 + nu2;
                return temp;
            case "-":
                temp = nu1 - nu2;
                return temp;
            case "/":
                temp = nu1 / nu2;
                return temp;
            case "*":
                temp = nu1 * nu2;
                return temp;
            case "^":
                double temp1 = nu1;
                if(nu2 == 0){
                return 0;
            }
                for(int i = 1; i < nu2; i++){
                    temp1 = temp1 * nu1;
                }
                return temp1;
        }
        return 0;
    }
    
    String cleararray(char v[]){
        String temp = Arrays.toString(v);
        String num = temp.replace(" ", "");
        temp = num.replace("[", "");
        num = temp.replace(",", "");
        temp = num.replace("]", "");
        num = temp.replace("n", "");
        if(neg){
            double temp1 = Double.valueOf(num);
            temp1 = temp1 *(-1);
            num = String.valueOf(temp1);
            return num;
            
        }else{
            return num;
        }
    }
    
}
