package MayTF;

public class MovieStar extends Star implements Action{
    private String famousMovie;

    public MovieStar(String name, int age, char sex, String famousMovie) {
        super(name, age, sex);
        this.famousMovie = famousMovie;
    }

    public String getFamousMovie() {
        return famousMovie;
    }
    public void setFamousMovie(String famousMovie) {
        this.famousMovie = famousMovie;
    }

    @Override
    public void dance() {
        System.out.println("MovieStar:I Can Dance...");
    }

    @Override
    public void sing() {
        System.out.println("MovieStar:I Can Sing....");
    }

    @Override
    public void perform() {
        System.out.println("MovieStar:I Can perform...");
    }

    @Override
    public String toString() {
        return "name: "+getName()+"\n"+"age: "+getAge()+"\n"+
                "sex: "+getSex()+"\n+famous movie: "+famousMovie;
    }
}
