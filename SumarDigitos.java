import java.util.Scanner;//  Se importa la libreria para agregar el numero desde el teclado

public class SumarDigitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// Se declara la variable sc, en la cual se va a guardar el numero que el usuario introducira
        System.out.print("Introduce un número para sumar sus digitos ");
        String num =sc.nextLine(); // La cadena num guardara el numero que el usuario digite
        int numero=(new Integer(num)).intValue();//Se convierte el String a int
        int suma = 0;//La varible suma va a realizar la suma de los digitos del numero

          
        

       

        while(numero > 0) {//repetira estas acciones hasta que el numero sea igual a 0 y ya no tenga digitos que sumar

            suma=suma + numero % 10;/*Hace esta operacion para sacar el digito de derecha a izquierda ya que tomara el residuo de la division
            por separado, por ejemplo, el numero 155 entre 10 es 15.5 y tomara 5 asi irá sumando cada digito*/

            numero = numero / 10;/* Aqui el numero se divide entre de 10 para poder tomar los numeros que estan antes del punto decimal
            ,por ejemplo, 155 entre de 10 es 15, entonces el la otra vuelta del ciclo sacara el digito que sigue*/
            
        }
        while(suma>9){//ciclo para el caso de que el resultado de la suma sea de dos digitos
        
           numero=suma;//El numero se vuelve igual a la suma para poder sumar sus digitos
           suma=0;//La suma se inicializa en 0
           while(numero>0){//Se repite el ciclo de arriba para sacar los digitos
           suma=suma + numero % 10;

            numero = numero / 10;}
            }
            

        System.out.println("La suma de sus digitos es : " + suma);

    }
    }
    
    
    