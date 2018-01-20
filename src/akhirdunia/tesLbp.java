/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhirdunia;

import java.util.Random;

/**
 *
 * @author zorokunti
 */
import java.util.Random;

/**
 *
 * @author zorokunti
 */
public class tesLbp {

    public static void main(String[] ar) {

        int width = 4;
        int height = 4;
        
        int x,y=0;
        
        Random rand = new Random();
        
        
        
        int[][] data = new int[width][height];

        for (int a=0; a<width; a++){
            for (int b=0; b<height; b++){
                x=rand.nextInt(255);
                y=rand.nextInt(255);
                data[a][b]=x;
            }
        }
        
        AlgoritmaLbp start = new AlgoritmaLbp(data,width,height);

        
       // start.printMatrix(data);

    }

}
