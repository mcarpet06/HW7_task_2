public class Client {
    public static void main(String[] args) {
        // a
        System.out.println("- - - = = =  TASK A  = = = - - -");
        InterfaceOlympicTeam germanyMen = initGermanyMen();
        System.out.println(germanyMen.toString(0));

        // b
        System.out.println("- - - = = =  TASK B  = = = - - -");
        InterfaceOlympicTeam germany = initGermany();
        System.out.println(germany.toString(0));

        // c
        System.out.println("- - - = = =  TASK C  = = = - - -");
        InterfaceOlympicTeam asia = initAsia();
        System.out.println(asia.toString(0));

        // d
        System.out.println("- - - = = =  TASK D  = = = - - -");
        InterfaceOlympicTeam olympicTeams = init();
        System.out.println(olympicTeams.toString(0));
    }

    public static InterfaceOlympicTeam init() {
        CompositeOlympicTeam olympicTeams = new CompositeOlympicTeam("Olympic Teams");

        olympicTeams.addOlympicTeam(initAsia());
        olympicTeams.addOlympicTeam(new CompositeOlympicTeam("Africa Team"));
        olympicTeams.addOlympicTeam(initEurope());
        olympicTeams.addOlympicTeam(new CompositeOlympicTeam("South America Team"));

        return olympicTeams;
    }

    private static InterfaceOlympicTeam initGermanyMen() {
        CompositeOlympicTeam germanyMenOlympicTeam = new CompositeOlympicTeam("Men's Team");
        InterfaceOlympicTeam tableTennis = new OlympicTeam("Table Tennis", 2, 1);
        germanyMenOlympicTeam.addOlympicTeam(tableTennis);
        InterfaceOlympicTeam football = new OlympicTeam("Football", 21, 4);
        germanyMenOlympicTeam.addOlympicTeam(football);

        return germanyMenOlympicTeam;
    }

    private static InterfaceOlympicTeam initGermany() {
        CompositeOlympicTeam germanyOlympicTeam = new CompositeOlympicTeam("Germany Team");

        CompositeOlympicTeam germanyWomenOlympicTeam = new CompositeOlympicTeam("Women's Team");
        InterfaceOlympicTeam cycling = new OlympicTeam("Cycling", 5, 3);
        germanyWomenOlympicTeam.addOlympicTeam(cycling);
        InterfaceOlympicTeam tennis = new OlympicTeam("Tennis", 3, 1);
        germanyWomenOlympicTeam.addOlympicTeam(tennis);
        germanyOlympicTeam.addOlympicTeam(germanyWomenOlympicTeam);

        germanyOlympicTeam.addOlympicTeam(initGermanyMen());

        return germanyOlympicTeam;
    }

    private static InterfaceOlympicTeam initEurope() {
        CompositeOlympicTeam europeOlympicTeam = new CompositeOlympicTeam("Europe Team");

        // GERMANY
        europeOlympicTeam.addOlympicTeam(initGermany());

        // ITALY
        CompositeOlympicTeam italyOlympicTeam = new CompositeOlympicTeam("Italy Team");

        CompositeOlympicTeam italyWomenOlympicTeam = new CompositeOlympicTeam("Women's Team");
        InterfaceOlympicTeam alpineSky = new OlympicTeam("Alpine Sky", 6, 1);
        italyWomenOlympicTeam.addOlympicTeam(alpineSky);
        italyOlympicTeam.addOlympicTeam(italyWomenOlympicTeam);

        CompositeOlympicTeam italyMenOlympicTeam = new CompositeOlympicTeam("Men's Team");
        InterfaceOlympicTeam football2 = new OlympicTeam("Football", 21, 3);
        italyMenOlympicTeam.addOlympicTeam(football2);
        InterfaceOlympicTeam swimmingTeam = new OlympicTeam("Swimming Team", 7, 2);
        italyMenOlympicTeam.addOlympicTeam(swimmingTeam);
        italyOlympicTeam.addOlympicTeam(italyMenOlympicTeam);

        europeOlympicTeam.addOlympicTeam(italyOlympicTeam);


        return europeOlympicTeam;
    }

    private static InterfaceOlympicTeam initAsia() {
        CompositeOlympicTeam asiaOlympicTeam = new CompositeOlympicTeam("Asia Team");

        // CHINA
        CompositeOlympicTeam chinaOlympicTeam = new CompositeOlympicTeam("China Team");

        CompositeOlympicTeam chinaWomenOlympicTeam = new CompositeOlympicTeam("Women's Team");
        InterfaceOlympicTeam taekwondo = new OlympicTeam("Taekwondo", 4, 1);
        chinaWomenOlympicTeam.addOlympicTeam(taekwondo);
        InterfaceOlympicTeam waterPolo = new OlympicTeam("Water polo", 9, 4);
        chinaWomenOlympicTeam.addOlympicTeam(waterPolo);
        InterfaceOlympicTeam artisticGymnasts = new OlympicTeam("Artistic Gymnasts", 6, 2);
        chinaWomenOlympicTeam.addOlympicTeam(artisticGymnasts);
        chinaOlympicTeam.addOlympicTeam(chinaWomenOlympicTeam);

        CompositeOlympicTeam chinaMenOlympicTeam = new CompositeOlympicTeam("Men's Team");
        InterfaceOlympicTeam shooting = new OlympicTeam("Shooting", 5, 2);
        chinaMenOlympicTeam.addOlympicTeam(shooting);
        chinaOlympicTeam.addOlympicTeam(chinaMenOlympicTeam);

        asiaOlympicTeam.addOlympicTeam(chinaOlympicTeam);


        // AFGHANISTAN
        InterfaceOlympicTeam afghanistanOlympicTeam = new CompositeOlympicTeam("Afghanistan Team");

        asiaOlympicTeam.addOlympicTeam(afghanistanOlympicTeam);

        return  asiaOlympicTeam;
    }
}