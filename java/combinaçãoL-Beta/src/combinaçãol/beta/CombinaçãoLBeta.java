/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinaçãol.beta;
//import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class CombinaçãoLBeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int v1[] = new int[3]; 
        int v2[] = new int[3];
        int W[] = new int[3];
        int a, b, resA[] = new int[3], resB[] = new int[3];
        int comb[] = new int[3];
        
        System.out.println("-----------Combinação Linear-----------\n");
        System.out.println("Digite os valores dos vetores abaixo:");
        System.out.println("Digite o vetor resultante: ");
        for(int i=0; i<3; i++){
            W[i] = in.nextInt();
        }
        System.out.println("Entre com os valores do vetor v1:");
        for(int i=0; i<3; i++){
            v1[i] = in.nextInt();
        }
        System.out.println("Entre com os valores do vetor v2:");
        for(int i=0; i<3; i++){
            v2[i] = in.nextInt();
        }
        System.out.println("Digite o valor do primeiro coeficiente <a>: ");
        a = in.nextInt();
        System.out.println("Digite o valor do segundo coeficiente <b>: ");
        b = in.nextInt();
        
        /*
        System.out.println("W("+W[0]+","+W[1]+","+W[2]+")");
        System.out.println("v1("+v1[0]+","+v1[1]+","+v1[2]+")");
        System.out.println("v2("+v2[0]+","+v2[1]+","+v2[2]+")");
        */
        
        System.out.println("\nW = a.v1 + b.v2");
        System.out.println("("+W[0]+","+W[1]+","+W[2]+")" + " = " + a + "." + "("+v1[0]+","+v1[1]+","+v1[2]+")" + " + " +
                           b + "." + "("+v2[0]+","+v2[1]+","+v2[2]+")");
        
        for(int i=0; i<3; ++i){
            resA[i] = a * v1[i];
        }    
        for(int i=0; i<3; i++){
            resB[i] = b * v2[i];
        }
        /*
        res[0] = a * v1[0];
        res[1] = a * v1[1];
        res[2] = a * v1[2];
        
        res[3] = b * v2[0];
        res[4] = b * v2[1];
        res[5] = b * v2[2];
        */
        comb[0] = resA[0] + resB[0];
        comb[1] = resA[1] + resB[1];
        comb[2] = resA[2] + resB[2];
        
        if((comb[0] == W[0] && comb[1] == W[1] && comb[2] == W[2]) && (comb[0] != 0 && comb[1] != 0 && comb[2] != 0)){
            System.out.println("\nHá combinação Linear");
        }else{
            System.out.println("\nNão tem combinação linear");
        }

    }
    
}
