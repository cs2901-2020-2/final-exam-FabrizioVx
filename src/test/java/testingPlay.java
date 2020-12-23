import org.testng.annotations.Test;
import org.testng.Assert;
public class testingPlay {
    @Test
    void testPiezaA() {
        Pieza piezaA = new PiezaA();
        int [][] auxPiezaA = piezaA.creacion('a');
        int [][] exactA = {{1,0,0},{1,0,0},{1,1,1}};
        Assert.assertEquals(auxPiezaA,exactA);
    }
    @Test
    void testPiezaB() {
        Pieza piezaB = new PiezaB();
        int [][] auxPiezaB = piezaB.creacion('b');
        int [][] exactB = {{1,1,1},{0,0,1},{0,0,1}};
        Assert.assertEquals(auxPiezaB,exactB);
    }
    @Test
    void testPiezaC() {
        Pieza piezaC = new PiezaC();
        int [][] auxPiezaC = piezaC.creacion('c');
        int [][] exactC = {{1,1,1},{0,0,0},{0,0,0}};
        Assert.assertEquals(auxPiezaC,exactC);
    }
    @Test
    void testPiezaD() {
        Pieza piezaD = new PiezaD();
        int [][] auxPiezaD = piezaD.creacion('d');
        int [][] exactD = {{1,0,0},{1,0,0},{1,0,0}};
        Assert.assertEquals(auxPiezaD,exactD);
    }
    @Test
    void testPiezaE() {
        Pieza piezaE = new PiezaE();
        int [][] auxPiezaE = piezaE.creacion('e');
        int [][] exactE = {{0,1,0},{0,1,0},{1,1,1}};
        Assert.assertEquals(auxPiezaE,exactE);
    }
    @Test
    void testPiezaF() {
        Pieza piezaF = new PiezaF();
        int [][] auxPiezaF = piezaF.creacion('f');
        int [][] exactF = {{1,1,1},{0,1,0},{0,1,0}};
        Assert.assertEquals(auxPiezaF,exactF);
    }
    @Test
    void testPiezaG() {

        Pieza piezaG = new PiezaG();
        int [][] auxPiezaG = piezaG.creacion('g');
        int [][] exactG = {{1,0,0},{1,0,0},{1,1,0}};
        Assert.assertEquals(auxPiezaG,exactG);
    }
    @Test
    void testPiezaH() {
        Pieza piezaH = new PiezaH();
        int [][] auxPiezaH = piezaH.creacion('h');
        int [][] exactH = {{1,1,0},{1,0,0},{1,0,0}};
        Assert.assertEquals(auxPiezaH,exactH);
    }

    @Test
    void test0(){
        Pieza piezaA = new PiezaA();
        int [][] auxPiezaA = piezaA.creacion('a');
        int [][] exactA = {{1,0,0},{1,0,0},{1,1,1}};
        Assert.assertEquals(auxPiezaA,exactA);
        Pieza piezaB = new PiezaB();
        int [][] auxPiezaB = piezaB.creacion('b');
        int [][] exactB = {{1,1,1},{0,0,1},{0,0,1}};
        Assert.assertEquals(auxPiezaB,exactB);
        Pieza piezaC = new PiezaC();
        int [][] auxPiezaC = piezaC.creacion('c');
        int [][] exactC = {{1,1,1},{0,0,0},{0,0,0}};
        Assert.assertEquals(auxPiezaC,exactC);
        Pieza piezaD = new PiezaD();
        int [][] auxPiezaD = piezaD.creacion('d');
        int [][] exactD = {{1,0,0},{1,0,0},{1,0,0}};
        Assert.assertEquals(auxPiezaD,exactD);
        Pieza piezaE = new PiezaE();
        int [][] auxPiezaE = piezaE.creacion('e');
        int [][] exactE = {{0,1,0},{0,1,0},{1,1,1}};
        Assert.assertEquals(auxPiezaE,exactE);
        Pieza piezaF = new PiezaF();
        int [][] auxPiezaF = piezaF.creacion('f');
        int [][] exactF = {{1,1,1},{0,1,0},{0,1,0}};
        Assert.assertEquals(auxPiezaF,exactF);
        Pieza piezaG = new PiezaG();
        int [][] auxPiezaG = piezaG.creacion('g');
        int [][] exactG = {{1,0,0},{1,0,0},{1,1,0}};
        Assert.assertEquals(auxPiezaG,exactG);
        Pieza piezaH = new PiezaH();
        int [][] auxPiezaH = piezaH.creacion('h');
        int [][] exactH = {{1,1,0},{1,0,0},{1,0,0}};
        Assert.assertEquals(auxPiezaH,exactH);
    }
    @Test
    void Test1() throws Exception {
        Tablero tablero = new Tablero();
        tablero.posicionar('a');
        Assert.assertTrue(tablero.mostrarTablero());
    }

    @Test(invocationCount = 100, threadPoolSize = 100)
    void Test2(){
        long startTime = System.currentTimeMillis();
        test0();
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        Assert.assertTrue(time <= 2000);
    }
}
