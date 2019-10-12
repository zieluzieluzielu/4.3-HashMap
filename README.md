# 4.3-HashMap
Merged HashMap

Zadanie: HashMap
W tym zadaniu przypomnimy sobie HashMapy.

Napisz program, który przekopiuje wszystkie wartości z HashMapy myFavoriteColors i myFriendsFavoriteColors do HashMapy ourFavoriteColors:


Map <Integer,String> myFavoriteColors = new HashMap <Integer,String> ();

Map <Integer,String> myFriendsFavoriteColors = new HashMap <Integer,String> ();

myFavoriteColors.put(1, "Red");

myFavoriteColors.put(2, "Green");

myFavoriteColors.put(3, "Black");

System.out.println("Values in first map: " + myFavoriteColors);

myFriendsFavoriteColors.put(4, "White");

myFriendsFavoriteColors.put(5, "Blue");

myFriendsFavoriteColors.put(6, "Orange");

System.out.println("Values in second map: " + myFriendsFavoriteColors);


Map <Integer,String> ourFavoriteColors = new HashMap <Integer,String> ();

