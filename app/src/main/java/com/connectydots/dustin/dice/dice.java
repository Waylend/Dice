package com.connectydots.dustin.dice;

/**
 * Created by Dustin on 6/3/2015.
 */
public class dice {

    public dice(int type,int face,int Xpos,int Ypos, int rotation){
        String Folder;
        switch(type){
            case 4:
                Folder = "src\\main\\res\\drawable\\die-4";
                break;
            case 6:
                Folder ="src\\main\\res\\drawable\\die-6";
                break;
            case 8:
                Folder ="src\\main\\res\\drawable\\die-8";
                break;
            case 10:
                Folder ="src\\main\\res\\drawable\\die-10";
                break;
            case 12:
                Folder ="src\\main\\res\\drawable\\die-12";
                break;
            case 20:
                Folder ="src\\main\\res\\drawable\\die-20";
                break;
        }
    }
    //whenever the device is shook
    private void Roll(){

    }
}
