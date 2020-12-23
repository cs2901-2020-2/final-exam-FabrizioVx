package finalexam;
//extends PiezaA,PiezaB,PiezaC,PiezaD,PiezaE,PiezaF,PiezaG,PiezaH

import java.util.ArrayList;
import java.util.Random;

public class Tablero {
    int alto,ancho;
    private static final int ALTO= 9;
    private static final int ANCHO = 9;
    private static final int LOG = 3;
    ArrayList<int[][]> listaDePiezas = new ArrayList<int[][]>();
    int [][]tablero = new int[alto][ancho];
    int[][] AuxPieza = new int [LOG][LOG];
    Pieza pieza;

    public boolean creacionTablero(){
        this.tablero = new int[ALTO][ANCHO];
        this.AuxPieza = new int[LOG][LOG];
        return true;
    }

    public boolean fijarPiezaEnTablero(int [][] piezaSinPosicionar){
        Random rand = new Random();
        for(int i = 0 ;i < 9 ; i++){
            for(int j = 0 ; j  < 9 ; j++){
                if (rand.nextInt(8) == i && rand.nextInt(8) == j) {
                    if(piezaSinPosicionar[i][j] != 0){
                        tablero[i][j] = piezaSinPosicionar[i][j];
                    }
                }
            }
        }
        return true;
    }

    boolean posicionar(char option) throws Exception {
        switch (option){
            case 'a':
            case 'b':
            case 'c':
            case 'd':

            case 'e':

            case 'f':

            case 'g':

            case 'h':
                AuxPieza = pieza.creacion(option);
                fijarPiezaEnTablero(AuxPieza);
                listaDePiezas.add(AuxPieza);
                return true;

            default:
                throw new Exception("ERROR EN LA OPCION");
        }
    }
}
