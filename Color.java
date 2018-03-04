public class Color {
  private String name;
  private Integer timeOn;

    public Color(String name, Integer timeOn) {
        this.name = name;
        this.timeOn = timeOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTimeOn() {
        return timeOn;
    }

    public void setTimeOn(Integer timeOn) {
        this.timeOn = timeOn;
    }
}
