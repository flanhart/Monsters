
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        int lavaMonsters = 100;
        int waterMonsters = 200;
        int cookieMonsters = 300;

        System.out.println(sumMonsters(lavaMonsters,cookieMonsters,waterMonsters));
        System.out.println();

        LavaMonster Forrest = new LavaMonster("Forrest", 100, "red", "Forrest@hotmail.com");
        System.out.println(Forrest.getName());
        System.out.println(Forrest.getPowerLevel());
        System.out.println(Forrest.getColor());
        System.out.println(Forrest.getEmail());
        System.out.println();

        WaterMonster Kennadee = new WaterMonster("Kennadee", 200, "blue", "Pumpkin@cute.com"   );
        System.out.println(Kennadee.getName());
        System.out.println(Kennadee.getPowerLevel());
        System.out.println(Kennadee.getColor());
        System.out.println(Kennadee.getEmail());
        System.out.println();

        CookieMonster Brenna = new CookieMonster("Brenna", 300, "Pink", "Beautiful@hot/smart.com");
        System.out.println(Brenna.getName());
        System.out.println(Brenna.getPowerLevel());
        System.out.println(Brenna.getColor());
        System.out.println(Brenna.getEmail());

    }

    public static int sumMonsters(int lavaMonsters, int waterMonsters, int cookieMonsters) {
        return lavaMonsters + waterMonsters + cookieMonsters;
    }
}



