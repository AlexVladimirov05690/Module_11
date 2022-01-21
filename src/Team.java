import java.util.Objects;

public class Team {
    private String name;
    private int points = 0, goalsOn = 0, goalsOff = 0;

    public Team(String name) {
        this.name = name;
    }

    public int getDiffGoals() {
        return diffGoals;
    }

    public void setDiffGoals() {
        this.diffGoals = goalsOn - goalsOff;
    }

    private int diffGoals;

    public void setPoints(int points) {
        this.points += points;
    }

    public void setGoalsOn(int goalsOn) {
        this.goalsOn += goalsOn;
    }

    public void setGoalsOff(int goalsOff) {
        this.goalsOff += goalsOff;
    }

    public int getPoints() {
        return points;
    }

    public int getGoalsOn() {
        return goalsOn;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", goalsOn=" + goalsOn +
                ", goalsOff=" + goalsOff +
                ", diffGoals=" + diffGoals +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return points == team.points && diffGoals == team.diffGoals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(points, diffGoals);
    }

    public int getGoalsOff() {
        return goalsOff;
    }

    public String getName() {
        return name;
    }
}
