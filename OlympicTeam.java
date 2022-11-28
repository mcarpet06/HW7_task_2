public class OlympicTeam implements InterfaceOlympicTeam {
    @SuppressWarnings("all")
    private String name;
    @SuppressWarnings("all")
    private int numOfAthletes;
    @SuppressWarnings("all")
    private int numOfGoldMedals;

    public OlympicTeam(String name, int numOfAthletes, int numOfGoldMedals) {
        this.name = name;
        this.numOfAthletes = numOfAthletes;
        this.numOfGoldMedals = numOfGoldMedals;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfAthletes() {
        return numOfAthletes;
    }

    @Override
    public int getNumberOfGoldMedals() {
        return numOfGoldMedals;
    }

    @Override
    public String toString(int depth) {
        return String.format("%s, Number of Athletes: %d, Number of Gold Medals: %d",
                        getName(),
                        getNumberOfAthletes(),
                        getNumberOfGoldMedals())
                .indent(depth * SPACING);
    }
}
