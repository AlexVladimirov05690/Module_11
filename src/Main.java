import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateChampionship createChampionship = new CreateChampionship();
        createChampionship.addTeams();
        createChampionship.championship();
        List<Team> teamList = new ArrayList<>(createChampionship.teams.values());
        for(int i = 0; i < teamList.size(); i++) {
            System.out.println(teamList.get(i).toString());
        }
    }
}
