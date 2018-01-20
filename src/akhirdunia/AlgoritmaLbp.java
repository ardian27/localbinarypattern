/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhirdunia;

/**
 *
 * @author zorokunti
 */
public class AlgoritmaLbp {
    
    
    
public AlgoritmaLbp(int [][] matrix, int width,int height){
    
    System.out.println("Width Gambar : "+width);
    System.out.println("Height Gambar : "+height);
    System.out.println("Matrix Awal");
    printMatrix(matrix);
    
    resultLBP(matrix,8,1,width,height);
    
    
}

public  void printMatrix(int[][] matrix){
		for (int x = 0; x< matrix.length;++x){
			for (int y = 0; y<matrix[x].length;++y){
				System.out.print(matrix[x][y]+"\t");
			}
			System.out.println();
		}
}
public  void printMatrix1D(int[] matrix){
		for (int x = 0; x< matrix.length+1;++x){
			
				System.out.print(matrix[x]+"\t");
			
			System.out.println();
		}
}
private void resultLBP(int [][] matrix,int jumlahTetangga, int radius,int width , int height){
    
    int [][] oldMatrix=new int[width+1][height+1];
    int [][] newMatrix=new int[width][height];
    int[] tetangga= new int[jumlahTetangga];
    int [][] titikPusat = new int[width+2][height+2];
    
    int [][] newTitikPusat = new int[width][height];
   // int  previous_row=titikPusat[];
    
   
   
    //mengambil nilai array menjadikan titik pusat
    for(int a=1; a<width+1; a++){
        for (int b=1; b<height+1; b++){
            
            oldMatrix[a][b]=matrix[a-1][b-1];
            
           // int t0,t1,t2,t3,t4,t5,t6,t7;
            
        }
    }
   
   
    //mengambil nilai array menjadikan titik pusat
    for(int a=1; a<width+1; a++){
        for (int b=1; b<height+1; b++){
            int nilaiPixelDefault=0;
            int nilaiPixel=oldMatrix[a][b]+0;
            
            titikPusat[a][b]=nilaiPixel;
           // int t0,t1,t2,t3,t4,t5,t6,t7;
        }
    }
    System.out.println("Hasil Penambahan Matrix Border(Titik Pusat)");
    printMatrix(titikPusat);
    System.out.println("");
    
    
    
    
    
    /*
    System.out.println(""+titikPusat[2][2]);
    System.out.println(""+titikPusat[1][1]);
    System.out.println(""+titikPusat[1][2]);
    System.out.println(""+titikPusat[3][1]);
    System.out.println(""+titikPusat[3][2]);
    System.out.println(""+titikPusat[3][3]);
    System.out.println(""+titikPusat[2][3]);
    System.out.println(""+titikPusat[1][3]);
    System.out.println(""+titikPusat[1][2]);
    */
    
    
    for(int a=0; a<width; a++){
            
        for (int b=0; b<height; b++){
            
           int p0,p1,p2,p3,p4,p5,p6,p7;
           int t;
           int t0=0;
           int t1=0;
           int t2=0;
           int t3=0;
           int t4=0;
           int t5=0;
           int t6=0;
           int t7=0;
           int x =a+1;
           int y =b+1;
            //System.out.println("Titik : \n"+x+","+y+"\n");
            
            
            t=titikPusat[x][y];
            p0=titikPusat[x-1][y-1];
            p1=titikPusat[x-1][y];
            p2=titikPusat[x-1][y+1];
            p3=titikPusat[x][x+1];
            p4=titikPusat[x+1][y+1];
            p5=titikPusat[x+1][y];
            p6=titikPusat[x+1][y-1];
            p7=titikPusat[x][y-1];
         
            
//            System.out.println("\n Tnol"+t);
            if(t <= p0){
                t0 += t0+1;
            }
            else if(t < p0){
                t0 = 0;
            }
            
            if(t <= p1){
                t1 += t1+1;
            }
            else if(t < p1){
                t1 = 0;
            }
            
            if(t <= p2){
                t2 += t2+1;
            }
            else if(t < p2){
                t2 = 0;
            }
            
            if(t <= p3){
                t3 += t3+1;
            }
            else if(t < p3){
                t3 = 0;
            }
            
            if(t <= p4){
                t4 += t4+1;
            }
            else if(t < p0){
                t4 = 0;
            }
            
            if(t <= p5){
                t5 += t5+1;
            }
            else if(t < p5){
                t5 = 0;
            }
            
            if(t <= p6){
                t6 += t6+1;
            }
            else if(t < p6){
                t6 = 0;
            }
            
            if(t <= p7){
                t7 += t7+1;
            }
            else if(t < p7){
                t7 = 0;
            }
            
            System.out.println("=============================");
            System.out.println(x+","+y+" "+"Nilai Pixel menjadi  "+t0);
            System.out.println(x+","+y+" "+"Nilai Pixel menjadi  "+t1);
            System.out.println(x+","+y+" "+"Nilai Pixel menjadi  "+t2);
            System.out.println(x+","+y+" "+"Nilai Pixel menjadi  "+t3);
            System.out.println(x+","+y+" "+"Nilai Pixel menjadi  "+t4);
            System.out.println(x+","+y+" "+"Nilai Pixel menjadi  "+t5);
            System.out.println(x+","+y+" "+"Nilai Pixel menjadi  "+t6);
            System.out.println(x+","+y+" "+"Nilai Pixel menjadi  "+t7);
            System.out.println("=============================");
            
            int g0,g1,g2,g3,g4,g5,g6,g7,gtot;
            g0=(int) (t0*(Math.pow(2,0)));
            g1=(int) (t1*(Math.pow(2,1)));
            g2=(int) (t2*(Math.pow(2,2)));
            g3=(int) (t3*(Math.pow(2,3)));
            g4=(int) (t4*(Math.pow(2,4)));
            g5=(int) (t5*(Math.pow(2,5)));
            g6=(int) (t6*(Math.pow(2,6)));
            g7=(int) (t7*(Math.pow(2,7)));
            gtot= g0+g1+g2+g3+g4+g5+g6+g7;
            System.out.println(gtot);
            
            newMatrix [a][b]=gtot;
            
        }
    }
    
    
    
    
    System.out.println("Matrix Akhir");
   printMatrix(newMatrix);
   }


}
