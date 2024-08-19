package section11_abstraction.exercise48;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ISaveable playerOne = new Player("Panos", 100, 40);
        System.out.println(playerOne);

        List<String> playerList = playerOne.write();
//        List<String> playerList = null;
//        System.out.println(playerList);
        playerOne.read(playerList);

        if (playerOne instanceof Player player){
            player.changeNameOfPlayer("Efraim");
        }

        playerList = playerOne.write();
        playerOne.read(playerList);
    }
}
