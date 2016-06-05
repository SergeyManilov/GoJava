package manilov.goit.practical;

/**
 * Created by md093 on 05.06.16.
 */
public class GoJavaOnline {
    public static void main(String[] args){
       Jedi darth = new Jedi("FAQ",1,true);

        System.out.println(darth.getChildrenNumber());
        System.out.println(darth.isOnDarkSide());
        System.out.println(darth.getName());
    }
}
