package AbstractFactory;

public class Shop {
    IFactory factoryCategory;

    public Shop(IFactory factory){
        this.factoryCategory = factory;
    }
    public void createPackage(){
        ICostume costume = this.factoryCategory.createCostume();
        IWeapon weapon = this.factoryCategory.createWeapon();

        costume.protection();
        weapon.power();
    }
}
