package creational.abstract_factory;

public class AbstractFactoryImpl {
    public static void main(String[] args) {
        AbstractFactoryProducer factoryProducer = new AbstractFactoryProducer();
        AbstractFactory factory = factoryProducer.getProfession(true);
        Profession profession = factory.getProfession("Engineer");
        profession.print();
    }
}
