package com.headfirstjava.beer;

public class BeerSong {
    
    public static void main(String[] args) {
        
        int beerNumber = 99;
        String beerWord = "";
        
        while( beerNumber > 0 ) {
            
            if( beerNumber < 10 || beerNumber > 20 ) {
                int numberRemain = beerNumber%10;
                if( numberRemain == 1 ) {
                    beerWord = "бутылка";
                } else if( numberRemain == 2 || numberRemain == 3 || numberRemain == 4 ) {
                    beerWord = "бутылки";
                } else {
                    beerWord = "бутылок";
                }
            } else {
                beerWord = "бутылок";
            }
            System.out.println(beerNumber + " " + beerWord + " пива на стене,");
            System.out.println(beerNumber + " " + beerWord + " пива.");
            System.out.println("Возьми одну,");
            System.out.println("Пусти по кругу.");
            --beerNumber;
            if( beerNumber > 0 ) {
                System.out.println(beerNumber + " " + beerWord + " пива на стене.");
                System.out.println();
            } else {
                System.out.println("Нет бутылок пива на стене.");
            }
        }
        
    }
}
