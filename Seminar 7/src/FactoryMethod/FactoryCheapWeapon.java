package FactoryMethod;

public class FactoryCheapWeapon implements IFactory{
    @Override
    public IWeapon create() {
        return new CheapWeapon();
    }
}
