
package algoritmos;

import java.util.Vector;

public class CalcTempoVetor {
    static Vector<String> vec = new Vector<>();
    public static void calcularTempoVetor10(){
        long start = System.currentTimeMillis();
        int n = 10;
        for(int i =1; i<=n; i++){
            vec.add(Integer.toString(i));
        }
        String p = vec.get(n-1);
        imprimirTempo(start, System.currentTimeMillis());
    }

    public static void calcularTempoVetor100(){
        long start = System.currentTimeMillis();
        int n = 100;
        for(int i =1; i<=n; i++){
            vec.add(Integer.toString(i));
        }
        String p = vec.get(n-1);
        imprimirTempo(start, System.currentTimeMillis());
    }

    public static void calcularTempoVetor1000(){
        long start = System.currentTimeMillis();
        int n = 1000;
        for(int i =1; i<=n; i++){
            vec.add(Integer.toString(i));
        }
        String p = vec.get(n-1);
       imprimirTempo(start, System.currentTimeMillis());
    }

    public static void calcularTempoVetor10000(){
        long start = System.currentTimeMillis();
        int n = 10000;

        for(int i =1; i<=n; i++){
            vec.add(Integer.toString(i));
        }
        String p = vec.get(n-1);
        imprimirTempo(start, System.currentTimeMillis());
    }

    private static void imprimirTempo(Long start, Long currentMs){
        System.out.println("Tempo decorrido: " + (currentMs - start) + " ms");
    }
}
