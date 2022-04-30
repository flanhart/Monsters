public class LavaMonster {
    private String name;
    private int powerLevel;
    private String color;
    private String email;

    public LavaMonster() {
    }

   public LavaMonster(String name, int powerLevel, String color, String email) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.color = color;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


