package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class HashmapApplication {

    public static void main(String[] args) {
        SpringApplication.run(HashmapApplication.class, args);


        Map <Integer,String> myFavoriteColors = new HashMap <Integer,String> ();
        Map <Integer,String> myFriendsFavoriteColors = new HashMap <Integer,String> ();

        myFavoriteColors.put(1, "Red");
        myFavoriteColors.put(2, "Green");
        myFavoriteColors.put(3, "Black");
        //System.out.println("Values in first map: " + myFavoriteColors);
        myFriendsFavoriteColors.put(4, "White");
        myFriendsFavoriteColors.put(5, "Blue");
        myFriendsFavoriteColors.put(6, "Orange");
        //System.out.println("Values in second map: " + myFriendsFavoriteColors);

        Map <Integer,String> ourFavoriteColors = new HashMap <Integer,String> ();

        //System.out.println(myFavoriteColors.entrySet());
        for(Map.Entry<Integer,String> entry : myFavoriteColors.entrySet()) {
            ourFavoriteColors.put(entry.getKey(),entry.getValue());
        }

        for(Map.Entry<Integer,String> entry : myFriendsFavoriteColors.entrySet()) {
            ourFavoriteColors.put(entry.getKey(),entry.getValue());
        }

        System.out.println("Values in merged map: " + ourFavoriteColors);


    }

}
