package com.example;

import java.util.Arrays;
import java.util.List;

public class LionAlex extends Lion {

    private List<String> friends = Arrays.asList("Марти", "Глория", "Мелман");
    private String placeOfLiving = "Нью-Йоркский зоопарк";

    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends(){
        return friends;
    }

    public String getPlaceOfLiving(){
        return placeOfLiving;
    }

@Override
public int getKittens(){
        return 0;
}

}
