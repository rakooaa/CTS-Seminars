package AbstractFactory;

public class LowBudgetFactory implements IFactory{
    @Override
    public ICostume createCostume() {
        return new CheapCostume();
    }

    @Override
    public IWeapon createWeapon() {
        return new CheapWeapon();
    }
}
