import java.util.ArrayList;
import java.util.List;

public class CompositeOlympicTeam implements InterfaceOlympicTeam {
    @SuppressWarnings("all")
    private String name;
    @SuppressWarnings("all")
    private List<InterfaceOlympicTeam> subs;

    public CompositeOlympicTeam(String name) {
        this.name = name;
        subs = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfAthletes() {
        int num = 0;
        for(InterfaceOlympicTeam sub : subs) {
            num += sub.getNumberOfAthletes();
        }
        return num;
    }

    @Override
    public int getNumberOfGoldMedals() {
        int num = 0;
        for(InterfaceOlympicTeam sub : subs) {
            num += sub.getNumberOfAthletes();
        }
        return num;
    }

    @Override
    public String toString(int depth) {
        StringBuilder compStr = new StringBuilder(getName().indent(depth * SPACING));

        for (InterfaceOlympicTeam sub : subs) {
            compStr.append(sub.toString(depth + 1));
        }

        return compStr.toString();
    }

    @SuppressWarnings("all")
    public boolean addOlympicTeam(InterfaceOlympicTeam team) {
        return subs.add(team);
    }

    @SuppressWarnings("unused")
    public boolean removeOlympicTeam(InterfaceOlympicTeam team) {
        return subs.remove(team);
    }

    @SuppressWarnings("unused")
    public List<InterfaceOlympicTeam> getSubTeams() {
        return subs;
    }
}
