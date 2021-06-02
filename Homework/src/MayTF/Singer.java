package MayTF;

public class Singer extends Star implements Action{

    private String famousSong;

    public Singer(String name, int age, char sex, String famousSong) {
        super(name, age, sex);
        this.famousSong = famousSong;
    }

    public String getFamousSong() {
        return famousSong;
    }
    public void setFamousSong(String famousSong) {
        this.famousSong = famousSong;
    }

    @Override
    public void dance() {
        System.out.println("Singer:I Can Dance...");
    }

    @Override
    public void sing() {
        System.out.println("Signer:I Can Sing....");
    }

    @Override
    public void perform() {
        System.out.println("Singer:I Can perform...");
    }

    @Override
    public String toString() {
        return  "name: "+getName()+"\n"+"age: "+getAge()+"\n"+
                "sex: "+getSex()+"\n+famous song: "+famousSong;
    }
}
