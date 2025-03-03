package abstract_factory.pattern;

public class AbstractFactoryImpl {
    public static void main(String[] args) {
        AbstractFactoryProducer factoryProducer = new AbstractFactoryProducer();
        AbstractFactory factory = factoryProducer.getProfession(true);
        Profession profession = factory.getProfession("Engineer");
        profession.print();
    }
}
