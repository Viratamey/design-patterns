package creational.abstract_factory;

import java.util.Optional;

public class FactoryPatternMainClass {
	
	public static void main(String[] args) {
		Optional<String> vehicle = Optional.of("car");
		vehicle = Optional.ofNullable(null);
		System.out.println(""+vehicle.map(s -> "This is " + s + "!").orElse("this is not car!"));
		
		
	}

}
