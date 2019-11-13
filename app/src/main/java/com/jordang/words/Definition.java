package com.jordang.words;

public class Definition {
    String definition;
    String pronunciation;
    String image_url;
    String example;
    String type;


    @Override
    public String toString() {
        return "Definition{" +
                "definition='" + definition + '\'' +
                ", pronunciation'" + pronunciation + '\'' +
                ", image_url='" + image_url + '\'' +
                ", example='" + example + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
