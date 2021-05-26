package MayTS;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Building schoolBuilding = new Building();
        ArrayList<Window> windows = new ArrayList<Window>();
        for (int i = 0; i < 7; i++) {
            if (i % 2 == 0) {
                windows.add(new WoodWindow());
                windows.get(i).setWidth(109.98);
                windows.get(i).setHeight(156.89);
            } else {
                windows.add(new AluminumWindow());
                windows.get(i).setWidth(109.99);
                windows.get(i).setHeight(156.87);
            }
        }
        schoolBuilding.use(windows);
        schoolBuilding.showWindow();
    }
}