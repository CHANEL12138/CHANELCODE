package MayTS;

public class Line {
    InputScore one;
    DelScore two;
    ComputerAverage three;
    Line(){
        three=new ComputerAverage();
        two=new DelScore(three);
        one= new InputScore(two);
    }
    public void givePersonScore(){
        one.inputScore();
    }
}
