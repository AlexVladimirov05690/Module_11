import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class CreateChampionship {
    HashMap<Integer, Team> teams = new HashMap<>();
    teams.put(1, new Team());

    @Override
    public String toString() {
        return "CreateChampionship{" +
                "teams=" + teams +
                ", n=" + n +
                '}';
    }

    public String game(Team team1, Team team2) {
        Random random = new Random();
        int goal1 = random.nextInt(5);
        int goal2 = random.nextInt(5);
        team1.setGoalsOff(goal2);
        team1.setGoalsOn(goal1);
        team1.setDiffGoals();
        team2.setGoalsOff(goal1);
        team2.setGoalsOn(goal2);
        team2.setDiffGoals();
        if (goal1 > goal2) {
            team1.setPoints(3);
            return (team1.getName() + " WIN " + team2.getName() + " - " + goal1 + " : " + goal2);
        } else if (goal1 < goal2) {
            team2.setPoints(3);
            return (team1.getName() + " LOSE " + team2.getName() + " - " + goal1 + " : " + goal2);
        } else {
            team1.setPoints(1);
            team2.setPoints(1);
            return (team1.getName() + " DRAW " + team2.getName() + " - " + goal1 + " : " + goal2);

        }
    }
}
