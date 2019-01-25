package lesson11;

public class SeasonDemo {


    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        SeasonDemo.printSeason(season);
        SeasonDemo.printAllSeasons();
        Season season2 = Season.valueOf("AUTUMN");
        SeasonDemo.printSeason(season2);
    }

    public static void printSeason(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("I like Summer");
                break;
            case AUTUMN:
                System.out.println("I like Autumn");
                break;
            case SPRING:
                System.out.println("I like Spring");
                break;
            case WINTER:
                System.out.println("I like Winter");
        }
    }

    public static void printAllSeasons() {
        Season[] seasons = Season.values();
        for (Season a : seasons) {
            System.out.println(a + " " + a.getTmp()+" "+a.getDescription());
        }
    }


}
