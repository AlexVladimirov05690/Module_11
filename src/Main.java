import java.util.*;

public class Main {
    public static void main(String[] args) {
        CreateChampionship createChampionship = new CreateChampionship();
        createChampionship.addTeams();
        createChampionship.championship();
        for(int i = 1; i <= createChampionship.teams.size(); i++) {
            System.out.println(createChampionship.teams.get(i));
        }
    }
}
