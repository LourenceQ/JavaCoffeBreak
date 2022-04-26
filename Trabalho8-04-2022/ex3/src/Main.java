import Entitites.Lamp3States;
import Enum.LampTypeEnum;
import Enum.LightIntentsityEnum;

class Main{
    public static void main(String[] args) {        

        Lamp3States l3 = new Lamp3States();
        l3.Price = 35.4;
        l3.Size = "Pequena";
        l3.LampType = LampTypeEnum.getEnum(2);
        l3.LightIntensity = LightIntentsityEnum.getEnum(2);

        System.out.println(l3.PrintMe());

    }
}