package Task3;

import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        Player player = new Player();
        System.out.print("This is a player, you can play, recording, pause or stop music:\n" +
                "Enter command for player \n" +
                "  > - play \n" +
                " => - pause \n " +
                " +> - recording \n" +
                " || - stop ");

        Scanner input = new Scanner(System.in);
        String command = input.next();
        while (!command.equals("||")) {
             usePlayer(command,player);
             command = input.next();
        }
        player.stop();
        input.close();
    }

    private static void usePlayer(String command, Player player) {

            switch (command){
                case ">": player.play(); break;
                case "=>": player.pause();break;
                case  "+>": player.record();break;
                default:
                    System.out.println("bye bye");
            }
    }
}
