package AP3.ClassesUtilitarias;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("1ABC1","Iphone");
        SmartPhone s2 = new SmartPhone("2ABC2","Pixel");
        SmartPhone s3 = new SmartPhone("3ABC3","LG");

        List<SmartPhone> smartPhones = new ArrayList<>();
        smartPhones.add(s1);
        smartPhones.add(s3);
        smartPhones.add(s2);

        for (int i = 0; i < smartPhones.size(); i++) {
            System.out.println(smartPhones.get(i));
        }
        SmartPhone s4 = new SmartPhone("asdfj","POCO");
        System.out.println(smartPhones.contains(s2));

    }
}
