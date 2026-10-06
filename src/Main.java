import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner ironman=new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos del arreglo:");
        int tamaño=ironman.nextInt();

        int[]numeros =new int[tamaño];

        for (int i=0; i< numeros.length; i++){
            System.out.println("ingrese el numero"+ (i+i)+":");
            numeros[i]=ironman.nextInt();

        }
        System.out.println("      buscando bumerales      ");
        int totalbumeranes=contaryBuscarBumeranes(numeros);
        System.out.println("el numero total de bumerales es:"+totalbumeranes);


    }
    public static  int contaryBuscarBumeranes(int[] arr) {
        int contador = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 2] && arr[i] != arr[i + 1]) {
                System.out.println("bumeran encontrado:[" + arr[i] + "," + arr[i + 1] + "," + arr[i + 2] + "]");
                contador++;


            }
        }
        return contador;


    }
}