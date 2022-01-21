import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FillingTeams {
    List<String> teamsAboutUser = new ArrayList<>();

    @Override
    public String toString() {
        return "FillingTeams{" +
                "teamsAboutUser=" + teamsAboutUser +
                '}';
    }

    public void filling(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int numberTeams = 0;
        while (numberTeams < 4) {
            System.out.println("Enter a team name:");
            teamsAboutUser.add(scanner.nextLine());
            numberTeams += 1;
        }


    }
}
