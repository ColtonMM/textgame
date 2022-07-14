import java.util.*;

class main{
    public static void main(String[] args)
    {
        String name;
        String race;
        
        Scanner userinp = new Scanner(System.in);

        System.out.println("Enter Character Name: ");
        name = userinp.nextLine();
        System.out.println("Enter player race (elf, dwarf, half-giant, gnome, or human):");
        race = userinp.nextLine();
        
        player newplayer = new player(name,race);
    }
}
