package creational.singleton_design_pattern.eager_initialization;

public class SingletonClass {
	
	
	private static SingletonClass singletonInstance = new SingletonClass();

	// default provided constructor is public if not written explicitly
	private SingletonClass(){
		 
	 }

	//Get the only object available
	   public static SingletonClass getInstance(){
	      return singletonInstance;
	   }
	   
	   public void simpleMethod() {
		   System.out.println("hashcode of singelton object" + singletonInstance);
	   }
	   
}
