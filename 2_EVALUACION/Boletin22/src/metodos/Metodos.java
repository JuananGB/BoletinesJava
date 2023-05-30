
package metodos;

import java.util.Arrays;

public class Metodos {
   
     //EJERCICIO 1.1
    private int golesMarcados[][] = new int[2][3];
    private String xornada[] = {"x1", "x2", "x3"};
    private String equipo[] = {"celta", "depor"};

    public int golesEquipo[] = new int[2];

    
    public int[][] creaArray() {
        for (int i = 0; i < golesMarcados.length; i++) {
            for (int j = 0; j < golesMarcados[i].length; j++) {
                golesMarcados[i][j] = PedirDatos.getNumeroRandom(0, 5);
            }
        }
        return golesMarcados;
    }

    /**
      EJERCICIO 1.2
     */
    public void mostrarArray() {
        System.out.print("    ");
        for (int j = 0; j < golesMarcados[0].length; j++) {
            System.out.print(" " + xornada[j]);
        }
        System.out.println();

        for (int i = 0; i < golesMarcados.length; i++) {
            System.out.print(equipo[i]);

            for (int j = 0; j < golesMarcados[i].length; j++) {
                System.out.print(" ");
                System.out.print(golesMarcados[i][j]); // NO utiliza println()
                System.out.print(" ");
            }
            System.out.println();

        }

    }

    //EJERCICIO 1.3
    public int[] equiposGoles() {
        System.out.println("***metodo equipoGOles**");
        System.out.print("    ");
        System.out.println();

        for (int i = 0; i < golesMarcados.length; i++) {
            System.out.print(equipo[i] + " = "); // encabezado eje x

            for (int j = 0; j < golesMarcados[i].length; j++) {
                golesEquipo[i] = golesEquipo[i] + golesMarcados[i][j];

            }

            System.out.print(golesEquipo[i]);
            System.out.println();

        }
        return golesEquipo;

    }

    public void ordenarMatriz_v2(int golesEquipo[]) {
        this.golesEquipo = golesEquipo;
        int auxGoles;
        String auxEquipo;

        if (golesEquipo[0] > golesEquipo[1]) {
            // ORDENAR GOLES TOTALES
            auxGoles = golesEquipo[0];
            golesEquipo[0] = golesEquipo[1];
            golesEquipo[1] = auxGoles;

            auxEquipo = equipo[0];
            equipo[0] = equipo[1];
            equipo[1] = auxEquipo;

            for (int i = 0; i < golesMarcados[0].length; i++) {
                int auxArrayBi[][] = new int[2][3]; // se declara aqui para que cada vez que lea una fila se reinicie
                for (int x = 0; x < golesMarcados.length; x++) { // max los golesMarcados y no los goleEquipo pq si no solo ordena el eje y
                    for (int y = x + 1; y < golesMarcados.length; y++) { // max los golesMarcados por la misma razon

                        // RESULTADO
                        auxArrayBi[x][i] = golesMarcados[x][i];
                        golesMarcados[x][i] = golesMarcados[y][i];
                        golesMarcados[y][i] = auxArrayBi[x][i];

                    }

                }
            }
        }
    }

    public void ordenarMatriz(int golesEquipo[]) {
        this.golesEquipo = golesEquipo;
        int aux;
        String aux2;
        for (int x = 0; x < golesEquipo.length; x++) {
            for (int y = x + 1; y < golesEquipo.length; y++) {

                // GOLES TOTALES
                if (golesEquipo[x] > golesEquipo[y]) {
                    aux = golesEquipo[x];
                    golesEquipo[x] = golesEquipo[y];
                    golesEquipo[y] = aux;

                    // ORDENAR RESULTADO NOMBRE EQUIPO
                    aux2 = equipo[x];
                    equipo[x] = equipo[y];
                    equipo[y] = aux2;

                }
                System.out.println("Despues de entrar");
                System.out.println("golesEquipo = " + equipo[x] + equipo[y]);

            }
        }
    }

    public void verGolesEquipos() {
        System.out.println("**ver goles");
        for (int i = 0; i < golesMarcados.length; i++) {
            System.out.println("golesEquipo[i] = " + golesEquipo[i]);
        }
    }

}
