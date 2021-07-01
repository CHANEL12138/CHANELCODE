package JuneNi;

public class Goods {
    private boolean isDanger;
    private String name;

    public Goods(String name) {
        this.name = name;
    }
    public boolean isDanger() {
        return isDanger;
    }
    public void setIsDanger(boolean isDanger) {
        this.isDanger = isDanger;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}