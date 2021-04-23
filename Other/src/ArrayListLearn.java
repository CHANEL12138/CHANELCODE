import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLearn {
    public static void Print(Object obj)
    {
        System.out.println(obj);
    }
    public static void main(String[] args) {
        ArrayList<String> CityList= new ArrayList<>();
        CityList.add("London");
        CityList.add("Beijing");
        CityList.add("ShangHai");
        CityList.add("Chongqing");
        Print(CityList.toString());
        Print(CityList.contains("Beijing"));
        Print(CityList.get(3));
        Print(CityList.isEmpty());
        Print(CityList.indexOf("London"));
        String[] str={"one","two","three"};
        ArrayList<String> list =new ArrayList<>(Arrays.asList(str));
        Print(list.toString());
        String[] str1=new String[list.size()];
        for(String i:str1)
        {
            Print(i);
        }
        list.toArray(str1);
        for(String i:str1)
        {
            Print(i);
        }
    }

}
