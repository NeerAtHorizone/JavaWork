//  THIS PROGRAM USED TO SELECT PLAYER RANDOMLY FOR GAME LIKE TRUT'N'DARE

import java.util.Scanner;

import javax.sound.midi.Soundbank;

class playrs {
    static String name() {
        Scanner input = new Scanner(System.in);

        String playerName = input.nextLine();

        return playerName;
    }

    static int Continue() {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        return number;
    }
}

public class yourTurn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n\t\t----LET'S--STRART----\n\t\t THE THRUTH OR DARE\n\n");

        boolean play = true;

        System.out.print("\n\nENTER NO. OF PLAYERS : ");
        byte num = input.nextByte();
        if(num == 0 || num == 1)
        {
            System.out.println("\n\n\t\t!!!DON'T PLAY WITH GHOST, HAVE SOME ALIVE HUMANE FRIENDS!!!\n");
            return;
        }

        String names[] = new String[num];
        System.out.println("\n\t\tENTER PLAYER'S NAME");

        for (int i = 0; i < num; i++) {
            System.out.print(i + 1 + ". ");
            names[i] = playrs.name();
        }
        while (play) {
            byte selectRandom = (byte) (Math.random() * 10);

            while (selectRandom > num) {
                selectRandom = (byte) (Math.random() * 10);
            }
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace(); // printStackTrace displays information about the
                                         // exception that occured, it prints a detailed
                                         // textual representation of the stack trace to the
                                         // consoel or another specified output stream.

                }
                System.out.println(".");
            }
            System.out.println("\n\t\tRUKO JARA - SABAR KARO\n");
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(".");

            }
            System.out.println("\n\t\t : \t" + (names[selectRandom]) + "\n\n\t\tTruth Or Dare ??    ^_~\n\n");

           
                try {
                    Thread.sleep(10000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("\n");

            

            System.out.println("\n\tContinue? -> 0\t End? - any number\n\n");

            int check = playrs.Continue();
            if (check == 0) {
                play = true;
            } else {
                play = false;
            }

        }

        System.out.println("\n\t\t----GAME--OVER----\n");
    }

}
