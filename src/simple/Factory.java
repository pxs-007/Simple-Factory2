package simple;

import java.util.Base64;

public class Factory {
    public Fruit createFruit(String kind){
        if(kind=="A")
            return new Apple();
        if(kind.equals("B"))
            return new Banana();
        return null;
    }
}
