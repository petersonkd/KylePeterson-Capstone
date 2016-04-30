package com.example.kyle.qookbook;

/**
 * Created by Kyle on 4/19/2016.
 */
public class reci {
    public String name;
    public String linky;
    public reci(String name, String link){
        super();
        this.name=name;
        this.linky=link;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getLink(){
        return linky;
    }
    public void setLink(String link){
        this.linky=link;
    }
}
