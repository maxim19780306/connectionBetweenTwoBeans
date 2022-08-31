package org.example.main;

import lombok.Data;

@Data
public class Parrot {
    private String name;

    @Override
    public String toString(){
        return "Parrot : " + name;
    }
}
