public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Magic magic= new Magic();
        Medic medic = new Medic();
        Hero hero[] = new Hero[]{warrior, magic, medic};
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility();
        }
    }
}