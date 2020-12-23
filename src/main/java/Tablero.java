//extends PiezaA,PiezaB,PiezaC,PiezaD,PiezaE,PiezaF,PiezaG,PiezaH

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

public class Tablero {
    private static final int ALTO= 9;
    private static final int ANCHO = 9;
    private static final int LOG = 3;
    ArrayList<int[][]> listaDePiezas = new ArrayList<>();
    int [][]tablero = new int[ALTO][ANCHO];
    int[][] AuxPieza = new int [LOG][LOG];
    static final Logger logger = Logger.getLogger(Tablero.class.getName());
    private static final Scanner scan = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);

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

    private void mostrarTablero(){
        for(int i = 0 ;i < ALTO ; i++){
            for(int j = 0 ; j  < ANCHO ; j++){
                if(tablero[i][j] == 0){
                    logger.info("X");
                }else{
                    logger.info(" ");
                }
            }
            logger.info("\n");
        }
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
    public static void main(String[] args){
        logger.info("Ingresa para jugar (digita 0) o juega de forma anónima ( digita 1)");
        int opcion = scan.nextInt();
        String nameUser = "";
        if(opcion == 0) {
            logger.info("Ingresa tu nombre de usuario: ");
            nameUser = scan.nextLine();
        }
        else{ nameUser = "firstPlayer";}
        logger.info("Acaba de ingresar" + nameUser +" felicidades");
    }
}
