package MayTS;

import java.util.ArrayList;

public class Building {
    ArrayList<Window> windows = new ArrayList<>();
    final double width = 109.98;
    final double height = 156.98;
    public void use(ArrayList<Window> windowlist)
    {
        for(int i=0;i<windowlist.size();i++)
        {
            if(Math.abs(windowlist.get(i).getWidth()-width)<=1E-2&&
                Math.abs(windowlist.get(i).getHeight()-height)<=1E-1)
            {
                windows.add(windowlist.get(i));
            }
        }
    }
    public void showWindow()
    {
        for (int i = 0;i<windows.size();i++)
        {
            System.out.println("第"+(i+1)+"扇窗户是：" +windows.get(i).getMaterial()+
                    " 宽是："+windows.get(i).getWidth()+" 高是："+windows.get(i).getHeight());
        }

    }
}
