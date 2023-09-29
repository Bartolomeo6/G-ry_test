package pl.zs10.test_gory;

import java.util.ArrayList;

public class MagazynPytań {
    public static ArrayList<Pytanie> utworzPytania() {
        ArrayList<Pytanie> pytania = new ArrayList<>();

        pytania.add(new Pytanie("Góra ze zdjęcia -> Giewont", true, "Spójrz w górę (Zakopane)", R.drawable.giew));

        pytania.add(new Pytanie("Czy na zdjęciu jest widoczny mnich?",true,"Na zdjęciu jest widoczny szczyt w pobliżu Morskiego Oka",R.drawable.mnich));

        pytania.add(new Pytanie("Czy na zdjęciu widać Tarnowskie Góry?",false,"Góry najbardziej wysunięte na wschód Polski",R.drawable.bieszcz));

        return pytania;
    }


}
