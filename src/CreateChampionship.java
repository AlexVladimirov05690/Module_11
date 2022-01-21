import java.util.*;

public class CreateChampionship {
    HashMap<Integer, Team> teams = new HashMap<>();

    public void addTeams() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a team name:");
        int number = 1;
        while (number <= 4) {
            teams.put(number, new Team(scanner.nextLine()));
            number += 1;
        }

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
    public void championship() {
        System.out.println("Tour #1");
        System.out.println(game(teams.get(1), teams.get(2)));
        System.out.println(game(teams.get(3), teams.get(4)));
        System.out.println("Tour #2");
        System.out.println(game(teams.get(4), teams.get(1)));
        System.out.println(game(teams.get(2), teams.get(3)));
        System.out.println("Tour #3");
        System.out.println(game(teams.get(1), teams.get(3)));
        System.out.println(game(teams.get(2), teams.get(4)));
        System.out.println("Tour #4");
        System.out.println(game(teams.get(3), teams.get(1)));
        System.out.println(game(teams.get(4), teams.get(2)));
        System.out.println("Tour #5");
        System.out.println(game(teams.get(1), teams.get(4)));
        System.out.println(game(teams.get(3), teams.get(2)));
        System.out.println("Tour #6");
        System.out.println(game(teams.get(2), teams.get(1)));
        System.out.println(game(teams.get(4), teams.get(3)));
    }

    public void result(){
        Set<Team> resultTable = new TreeSet<Team>((Collection<? extends Team>) teams);
        System.out.println(resultTable);

    }

    @Override
    public String toString() {
        return "Off";
    }
}
