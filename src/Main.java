public class Main {
    public static void main(String[] args) {
Magic magic= new Magic(350,25);
Wsrrior wsrrior = new Wsrrior(500,55);
Medic medic = new Medic(400,30);

String magical = magic.setSuperAbility("Фелетовая молния");
String medicol = medic.setSuperAbility("Лечить");
String wsrrior1 = wsrrior.setSuperAbility("Критический урон");
String Hero[]={magical,medicol,wsrrior1};
HavingSuperAbiliti[] havingSuperAbilitis = {magic,medic,wsrrior};
        for (int i = 0; i < Hero.length; i++) {
            havingSuperAbilitis[i].applySuperAbility(Hero[i]);

        }
    }
}