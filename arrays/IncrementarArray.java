package arrays;

import java.util.Arrays;

public class IncrementarArray {
    public static void modificarArray (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=5;
        }
        System.out.println("Dentro del metodo el arr es: " + Arrays.toString(arr)); //Imprime arr modificado
    }
    public static void main(String[] args) {
        int [] arr = {2, 4, 8, 10};
        System.out.println("Antes de llamar al metodo el arr es " + Arrays.toString(arr)); //Imprime arr original
        modificarArray(arr);
        System.out.println("Despues de llamar al metodo el arr es " + Arrays.toString(arr)); //Imprime arr modificado debido al paso por referencia
}
}

