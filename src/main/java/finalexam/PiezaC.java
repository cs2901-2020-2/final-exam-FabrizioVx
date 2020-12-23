package finalexam;

public class PiezaC implements Pieza{
    @Override
    public int[][] creacion(char option) {
        int [][] piecitas = new int [LOG][LOG];
        for(int i = 0 ;i < 3 ; i++){
            for(int j = 0 ; j  < 3 ; j++){
                if(j == 0 && i == 0 || j == 1 && i == 0 || j == 2 && i == 0){
                    piecitas[i][j] = 1;
                }
            }
        }
        return piecitas;
    }
}
