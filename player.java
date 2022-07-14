import java.util.*;

//this file is for tracking the player object
//name, health, sp, skills, 

public class player{
    private String name; //the name of the player
    private int maxhealth; //max health of the player
    private String race; //Race of player (elf,human,dwarf,half-giant)
    private int maxsp;  //max sp of the player
    private String size; //size of the player
    private int spregenrate=10;
    public void playercharacter(String pcname, String pcrace){
        name = pcname;
        race = pcrace;
        maxhealth = 100;
        maxsp = 100;
        if (pcrace=="half-giant")
        {
            size="Large";
        }
        else if (pcrace=="Human"||pcrace=="Orc"||pcrace=="elf")
        {
            size="Medium";
        }
        else{
            size = "Small";
        }


    }

    //Size Functions 
    //***********************************************************************
    //setSize takes any change to size through gameplay and applies it to the player
    public void setSize(int sizechange){
        if (sizechange==1)
        {
            size = "Small";
        }
        else if (sizechange==2){
            size = "Medium";
        }
        else if (sizechange==3){
            size = "Large";
        }
        else{
            size = "Gargantuan";
        }
    } //ends setSize

    public String getSize(String self){
        return size;
    }//ends Setsize
    //***********************************************************************
    //end of size functions   

    //Sp functions
    //***********************************************************************
    public void setmaxsp (int spchange) //setSp modifies the max amount of sp available to the player
    {
        if (spchange>0){
            maxsp =+ spchange;
        }
        else{
            maxsp =- spchange;
        }
    }
    public int getmaxp(){
        return maxsp;
    }
    
    public void regensp(int turn,int currentsp){//regensp regenerates currentsp as long as it's not equal to maxsp and it is an even numbered turn
        if (currentsp!=maxsp && (turn%2==0))
        {
            currentsp =+ spregenrate;
        }
    }
    public void useskill(int currentsp,int spcost){ //useskill takes the currentsp and subtracts the spcost from it
        currentsp =- spcost;
    }

}