public class WaterMonster {

    private String name;
    private int powerLevel;
    private String color;
    private String email;

    public WaterMonster(String name, int powerLevel, String color, String email) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.color = color;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public int getPowerLevel() {
        return powerLevel;
    }
    public void setPowerLevel() {
        this.powerLevel = powerLevel;
    }
    public String getColor() {
        return color;
    }
    public void setColor() {
        this.color = color;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail() {
        this.email = email;
    }
}
