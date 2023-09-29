// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic();
        Warior warior = new Warior();
        Magic magic = new Magic();

        Hero[] heroes = {medic,warior,magic};
        String[] shax = {" лечение" ,"экстра защита", "магия"};
        
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility(shax[i]);
        }
    }
    }
