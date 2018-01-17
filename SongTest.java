import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class SongTest {

    public static void main (String args[]){

        Singer frank = new Singer("Frank Sinatra");
        Singer wham = new Singer("Wham!");
        Singer mariah = new Singer("Mariah Carey");
        Singer chris = new Singer("Chris Rea");
        Singer sia = new Singer("Sia");

        new Song ("All I Want for Christmas Is You", mariah,"https://www.youtube.com/watch?v=yXQViqx6GMY" );
        new Song ("White Christmas",frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA" );
        new Song ("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI" );
        new Song ("Driving home for christmas",chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
        new Song ("Santa's Coming For Us",sia, "https://www.youtube.com/watch?v=V3EYjVPRClU" );
        new Song ("Let It Snow! Let It Snow! Let It Snow!",frank, "https://www.youtube.com/watch?v=vGRC2LYmHfU" );

        while (true) {
            System.out.println("*********** Welcome to our DMST Christmas Music Application ***********");
            System.out.println("Menu:");
            System.out.println("Type 1 to display singers' list");
            System.out.println("Type 2 to display Frank's Sinatra available songs");
            System.out.println("\t Type here:");
            Scanner scanner = new Scanner(System.in);
            try {
                int x = scanner.nextInt();

                if (x == 1) {
                    System.out.println("** Display Singer's List **");
                    int i = 0;
                    while (Singer.singers[i] != null) {
                        System.out.println("- Singer " + Singer.singers[i].toString());
                        i++;
                    }
                }
                else if (x == 2) {
                    ArrayList<Song> songsFound = new ArrayList<Song>();
                    int i = 0;
                    while (Song.songs[i] != null) {
                        if (Song.songs[i].getSinger().getName() == frank.getName()) {
                            songsFound.add(Song.songs[i]);
                        }
                        i++;
                    }
                    System.out.println("** Display Frank's Sinatra Song List **");
                    System.out.println(songsFound.size() + " songs were found:");
                    for (Song song : songsFound) {
                        System.out.println("Title: "+song.getTitle()+" , url to listen: "+song.getUrl());
                    }
                }
                else {
                    System.out.println("Error!!! You did not type 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error!!! You did not type 1 or 2.");
            }
            System.out.println("**************************************************");
            System.out.println("\n\n\n");
        }

    }
}
