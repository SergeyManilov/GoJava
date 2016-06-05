package manilov.goit.practical;

/**
 * Created by md093 on 05.06.16.
 */
public class Jedi {
    private String name;
    private int childrenNumber;
    private boolean isOnDarkSide;

    Jedi (String name, int childrenNumber, boolean isOnDarkSide){
        this.name = name;
        this.childrenNumber = childrenNumber;
        this.isOnDarkSide = isOnDarkSide;
    }
    public String getName(){
        return this.name;
    }

    public int getChildrenNumber() {
        return childrenNumber;
    }

    public boolean isOnDarkSide() {
        return isOnDarkSide;
    }
}

