public class Medic extends Hero{
    public Medic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void applySuperAbility(String superAbility) {
        System.out.println("Медик применил способность: "+superAbility);
    }
}
