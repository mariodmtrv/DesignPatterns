/**
 * Converts the interface of a class into another class a client expects.
 * Adapter lets classes work together that could not otherwise because of
 * incompatible interfaces
 * */
public class AdapterTest {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
	
		testDuck(mallard);
		testDuck(turkeyAdapter);
	}
	public static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
}
