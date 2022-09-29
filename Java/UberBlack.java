package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car {
    Map<String,Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatMaterials;
    
    public UberBlack(String license, Account driver,Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatMaterials){
        super(license,driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterials = seatMaterials;
    }
}
