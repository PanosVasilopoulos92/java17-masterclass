package section11_abstraction.exercise48;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>(100);
        list.add(toString());
        return list;
    }

    @Override
    public void read(List<String> list) {
        if (list == null) {
            System.out.println("List of player is empty");
            return;
        }

        for (var element : list) {
            String[] fields = element.split(",");
            System.out.printf("%s, %s,  %s,  %s",
                    fields[0], fields[1], fields[2], fields[3]);
        }

    }

    public void changeNameOfPlayer(String newName){
        this.name = newName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
