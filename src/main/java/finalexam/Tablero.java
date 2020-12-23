package finalexam;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablero {
    private static final int ALTO= 9;
    private static final int ANCHO = 9;
    private static final int LOG = 3;
    ArrayList<int[][]> listaDePiezas = new ArrayList<>();
    int [][] table = new int[ALTO][ANCHO];
    int[][] piecita = new int [LOG][LOG];
    static final Logger logger = Logger.getLogger(Tablero.class.getName());
    private static final Scanner scan = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    Pieza pieza;
    private Random rand = SecureRandom.getInstanceStrong();
    Tablero() throws NoSuchAlgorithmException {
    }

    public void creacionTablero(){
        this.table = new int[ALTO][ANCHO];
        this.piecita = new int[LOG][LOG];

    }

    public boolean fijarPiezaEnTablero(int [][] piezaSinPosicionar){
        for(int i = 0 ;i < 9 ; i++){
            for(int j = 0 ; j  < 9 ; j++){
                if (rand.nextInt(3) == i && rand.nextInt(3) == j) {
                    if(piezaSinPosicionar[i][j] != 0 && i < 3 && j < 3){
                        table[i][j] = piezaSinPosicionar[i][j];
                    }
                }
            }
        }
        return true;
    }

    public boolean mostrarTablero(){
        for(int i = 0 ;i < ALTO ; i++){
            for(int j = 0 ; j  < ANCHO ; j++){
                if(table[i][j] == 0){
                    logger.info("X");
                }else{
                    logger.info(" ");
                }
            }
            logger.info("\n");
        }
        return true;
    }

    boolean posicionar(char option) throws TooManyException {
        switch (option){
            case 'a':
                pieza = new PiezaA();
                piecita = pieza.creacion(option);
                fijarPiezaEnTablero(piecita);
                listaDePiezas.add(piecita);
                return true;
            case 'b':
                pieza = new PiezaB();
                piecita = pieza.creacion(option);
                fijarPiezaEnTablero(piecita);
                listaDePiezas.add(piecita);
                return true;
            case 'c':
                pieza = new PiezaC();
                piecita = pieza.creacion(option);
                fijarPiezaEnTablero(piecita);
                listaDePiezas.add(piecita);
                return true;
            case 'd':
                pieza = new PiezaD();
                piecita = pieza.creacion(option);
                fijarPiezaEnTablero(piecita);
                listaDePiezas.add(piecita);
                return true;
            case 'e':
                pieza = new PiezaE();
                piecita = pieza.creacion(option);
                fijarPiezaEnTablero(piecita);
                listaDePiezas.add(piecita);
                return true;
            case 'f':
                pieza = new PiezaF();
                piecita = pieza.creacion(option);
                fijarPiezaEnTablero(piecita);
                listaDePiezas.add(piecita);
                return true;
            case 'g':
                pieza = new PiezaG();
                piecita = pieza.creacion(option);
                fijarPiezaEnTablero(piecita);
                listaDePiezas.add(piecita);
                return true;
            case 'h':
                pieza = new PiezaH();
                piecita = pieza.creacion(option);
                fijarPiezaEnTablero(piecita);
                listaDePiezas.add(piecita);
                return true;

            default:
                throw new TooManyException("ERROR EN LA OPCION");
        }
    }
    public static void main(String[] args) throws Exception {
        logger.info("Ingresa para jugar (digita 0) o juega de forma anónima ( digita 1)");
        int opcion = scan.nextInt();
        String nameUser = "";
        if(opcion == 0) {
            logger.info("Ingresa tu nombre de usuario: ");
            nameUser = scan.nextLine();
        }
        else{ nameUser = "firstPlayer";}
        logger.log(Level.SEVERE,"Acaba de ingresar {0} felicidades",nameUser);
        Tablero tablero = new Tablero();
        tablero.creacionTablero();
        tablero.posicionar('a');
        tablero.posicionar('b');
        tablero.mostrarTablero();

    }
}
