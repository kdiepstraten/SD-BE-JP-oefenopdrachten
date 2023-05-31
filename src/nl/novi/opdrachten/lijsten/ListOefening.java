package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.List;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        // Vraag -1: Maak een methode die als taak heeft om de list per regel uit te printen.
        printenList(clubNames);

        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...
        printenInhoud(clubNames);

        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
        checkClub(clubNames, "Cuddly Cannons");

        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.

        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");


        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");



    }
    public static void printenList(List<String> clubName){
        for(String name : clubName){
            System.out.println(name);
        }
    }
    public static void printenInhoud(List<String> clubname){
        for(int i = 0; i < clubname.size(); i++){
            System.out.println(i + " - " + clubname.get(i));
        }
    }
    public static void checkClub(List<String> clubName, String toAdd){
        if(!clubName.equals(toAdd)){
            clubName.add(toAdd);
            for(String name : clubName){
                System.out.println(name);
            }
        }
    }

}
