public class PiezaB implements Pieza{
    //PiezaB(){}
    @Override
    public int[][] creacion(char option) {
        int [][] piecitas = new int [LOG][LOG];
        for(int i = 0 ;i < 3 ; i++){
            for(int j = 0 ; j  < 3 ; j++){
                if( i == 0 || j==2 && i == 1 || j==2 && i == 2){
                    piecitas[i][j] = 1;
                }
            }
        }
        return piecitas;
    }
}
