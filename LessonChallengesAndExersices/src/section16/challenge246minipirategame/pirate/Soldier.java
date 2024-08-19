package section16.challenge246minipirategame.pirate;

public final class Soldier extends Combatant {

    public Soldier(String name, Weapon weapon) {
        super(name);
        setCurrentWeapon(weapon);
    }
}
