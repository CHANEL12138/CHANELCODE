import Homework.Account;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(2,"Sarah");
        m1.put(3,"John");
        m1.put(1,"Jack");
        m1.put(5,"Rose");
        m1.put(6,"Rose");

        System.out.println(m1.containsValue("Jack"));
        Set<Integer> s = m1.keySet();
//        Iterator<Integer> it = s.iterator();
//        while(it.hasNext())
//        {
//            Integer in = it.next();
//            String s1 = m1.get(in);
//            System.out.println(in+s1);
//        }
//        for (Integer in : s) {
//            String s1 = m1.get(in);
//            System.out.println(in + s1);
//        }

        Map<Account , String> accountIntegerMap = new HashMap<>();
        Account a1 = new Account(339906,6000);
        Account a2 = new Account(339955,4500);
        accountIntegerMap.put(a1,"Chanel");
        accountIntegerMap.put(a2,"Michael");


        Account a3 = new Account(339906,6000);
        System.out.println(accountIntegerMap.containsKey(a3));

        System.out.println(a3.hashCode());
        System.out.println(a1.hashCode());


        Set<Map.Entry<Account,String>> q = accountIntegerMap.entrySet();
        a1.setId(36000);
//
        for (Map.Entry<Account, String> ss : q) {
            System.out.println(ss);
        }
//
        Iterator<Map.Entry<Account,String>> it1 = q.iterator();
        while(it1.hasNext())
        {
            Map.Entry<Account,String> ss = it1.next();
            System.out.println(ss);
        }

    }

}
