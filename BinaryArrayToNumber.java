package array_binario_a_entero;

import java.util.ArrayList;
import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int sum;
        int tamaño= binary.size()-2; 
        int elemento;
        
        if (binary.get(binary.size()-1) == 1) sum= 1; //evaluo el ultimo elemento independiente
        else
            sum= 0;
      
        for (int i= tamaño, k= 1 ; i>=0; i--, k++)
        {
            elemento= 1;
            if ((binary.get(i) == 1)) {
              for (int x=0; x<k; x++)
                elemento*= 2;
              
              sum+= elemento;
            }
        }

      return sum;
    }
}

/**    Solución alternativa
 *     public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return Integer.parseInt(binary.stream().map(Object::toString)
                .collect(Collectors.joining("")),2);
    }

 */

class principal {
    public static void main (String[] args) {
        List<Integer> listaBinaria= new ArrayList<>();

        listaBinaria.add(1);
        listaBinaria.add(0);
        listaBinaria.add(1);
        listaBinaria.add(1);
        listaBinaria.add(1);
        
        
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(listaBinaria));
        
        
    } 

}
