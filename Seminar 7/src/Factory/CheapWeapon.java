package Factory;

public class CheapWeapon implements IWeapon {
    @Override
    public void power() {
        System.out.println("this weapon has 0.1 power");
    }
}
