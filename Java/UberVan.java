package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{
    Map<String,Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatMaterials;
    private Integer passenger;
    
    public UberVan(String license, Account driver,Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatMaterials){
        super(license,driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterials = seatMaterials;
    }

    public UberVan(String license, Account driver){
        super(license,driver);
    }

    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Debes asignar 6 pasajeros");
        }
    }
  
}
