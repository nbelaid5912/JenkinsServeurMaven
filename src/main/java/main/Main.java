/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author usager
 */
public class Main {
    public static void main(int[] args){
        args[0] = 5;
        args[1] = 5;
        int result = add(args[0],args[1]);
    }
    public static int add(int x, int y){
        return x + y ;
    }
        
}
