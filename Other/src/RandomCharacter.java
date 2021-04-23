public class RandomCharacter {
    public static char GetRandomC(char a ,char b)
    {
        return (char)(b + Math.random()*(a-b+1));
    }
    public static char GetRandomDigit()
    {
        return GetRandomC('9','0');
    }
    public static char GetRandomUpperLetter()
    {
        return GetRandomC('Z','A');
    }
    public static char GetRandomLowerLetter()
    {
        return GetRandomC('z','a');
    }
    public static char GetRandom()
    {
        return GetRandomC('\uffff','\u0000');
    }
    public static void main(String[] args)
    {
        System.out.println(GetRandom());

    }
}
