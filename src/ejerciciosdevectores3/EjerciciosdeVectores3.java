/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdevectores3;

/**
 *
 * @author FERNEY JARAMILLO
 */
public class EjerciciosdeVectores3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
   int v1[]=constructor(3);
   
   System.out.println(v1[0]);
     System.out.println(v1[1]);
      System.out.println(v1[2]);
    
    }

/*Metodo que crea un vector de N pocisones con numeros aleatorios
 * @param n : numero de pocsiones del vector
 */
    public static int[] constructor(int n) {
        int v[] = new int[n];

        for (int i = 0; i < v.length; i++) {
            int dato = (int) (Math.random() * 20);
            v[i] = dato;
        }
        return v;
    }

    /**
     * Metodo Que añade un dato al fin del vector
     *
     * @param n elemento que se desea agrgear
     * @param v1 vector al cual se le añadira el elemnto
     * @return
     */
    public static int[] addElementoFin(int n, int v1[]) {

        int vnuevo[] = new int[v1.length + 1];

        int a;
        int j = 0;
        for (int i = 0; i < v1.length; i++) {

            a = v1[0];
            vnuevo[j] = a;
            j++;
            vnuevo[vnuevo.length - 1] = n;
        }
        return vnuevo;

    }

    /**
     * Metodo Que añade un dato al inicio del vector
     *
     * @param n elemento que se desea agrgear
     * @param v1 vector al cual se le añadira el elemnto
     * @return
     */
    public static int[] addElementoInicio(int n, int v1[]) {

        int vnuevo[] = new int[v1.length + 1];

        vnuevo[0] = n;
        int a;
        int j = 1;
        for (int i = 0; i < v1.length; i++) {

            a = v1[i];
            vnuevo[j] = a;
            j++;

        }
        return vnuevo;

    }

    /**
     * Metodo Que ordena un vector
     *
     * @param vector :vector al cual se desea ordenar
     * @return
     */
    public static int[] ordenar(int vector[]) {

        int aux = 0;
        for (int i = 0; i < vector.length; i++) {

            for (int j = i + 1; j < vector.length; j++) {
                aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;

            }

        }
        return vector;
    }
    
  /**
   * Metodo Que inserta un elemnto y lo va adiccionando ordenado
   * @param vector vector al que se van añadiendo los datos
   * @param dato : dato que se desea ingresar
   * @return 
   */
    public static int[] addOrdenado (int vector[], int dato ) {
       
        int v1[]=addElementoFin(dato, vector);
        int v2[]=ordenar(v1);
       
        return v2;
 
    } 
    
}

