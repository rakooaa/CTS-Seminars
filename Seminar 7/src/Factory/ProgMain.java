package Factory;

public class ProgMain {

    public static void main(String[] args) {
        IWeapon weapon; // hide this:  = new MagicWeapon();
        {
            try {
                weapon = FactoryWeapon.create(200);
                weapon.power();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
