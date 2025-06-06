package creational.singleton_design_pattern.eager_initialization;

import creational.factory_method.Teacher;

public class MainClass {
	public static void main(String[] args) {
		SingletonClass singeltonObject = SingletonClass.getInstance();
		singeltonObject.simpleMethod();
		
		SingletonClass singeltonObject2 = SingletonClass.getInstance();
		singeltonObject2.simpleMethod();
		
		Teacher teacher = new Teacher();
		System.out.println(teacher);
		
		Teacher teacher2 = new Teacher();
		System.out.println(teacher2);
	}

}
