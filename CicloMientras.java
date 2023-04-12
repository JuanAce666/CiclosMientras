/*Hacer un programa que lea un numero desconocido de registros (identificación, nombre, salario y dependencia), debe calcular e imprimir la nómina de la empresa y la cantidad de empleados de sistemas que ganan mas de 3000000 de pesos*/
package ciclomientras;

import java.util.Scanner;

public class CicloMientras {

    public static void main(String[] args) {
        // Definicion
        Scanner objread=new Scanner(System.in);
        String name,departament, op;
        int id;
        float salary;
        Boolean flag=true;
        while (flag==true) {    
            System.out.print("\n Digite su nombre ");
            name=objread.next();
            System.out.print("Digite su salario ");
            salary=objread.nextFloat();
            System.out.print("Digite la dependencia ");
            departament=objread.next();
            System.out.print("¿Cual es la identificacion?");
            id=objread.nextInt();
            
            System.out.println(name+", "+id+", "+departament+", "+salary);

            
            System.out.println("¿quieres continuar?");
            op=objread.next ();
            if (op.equals ("y")){
             flag=true;   
            } else if (op.equals ("n")){
              flag=false;
            }else{
                System.out.println("respuesta invalida");
            }
        }
    }
}
