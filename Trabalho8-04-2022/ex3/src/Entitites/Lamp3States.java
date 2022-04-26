package Entitites;

import Enum.LightIntentsityEnum;

public class Lamp3States extends Lamp {    
    public LightIntentsityEnum LightIntensity;

    public String setLightIntensity(double i) {

        if(i == 0) {
            LightIntensity = LightIntentsityEnum.getEnum(0);
            return LightIntensity.toString(); 
        }
        else if(i > 0 && i < 50) {
            LightIntensity = LightIntentsityEnum.getEnum(1);
            return LightIntensity.toString();
        }
        else if (i >= 50 && i <= 100) {
            LightIntensity = LightIntentsityEnum.getEnum(2);
            return LightIntensity.toString();
        }            
        
        return LightIntensity.toString();
    }

    public String checkState() {
        if(LightIntensity.getValue() == 0) 
            return"Luz apagada";
        
        else if (LightIntensity.getValue() > 0 && LightIntensity.getValue() <= 100) 
            return "Luz acesa";

        return "";
    }


    public String PrintMe() {
        return "Preço: " + Price + "\n" +
               "Tamanho: " + Size+ "\n" +
               "Tipo: " + LampType + "\n" +
               "Intensidade da luz: " + LightIntensity + "\n" +
               "Estado da luz: " + checkState();
    }
}
