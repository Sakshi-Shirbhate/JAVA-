
public class Fruit {
	String name;
	String taste;
	String size;
	
	public void eat() {
		System.out.println("Fruits: ");
	}
	
	public static void main(String[] args)
	{
		Fruit f = new Fruit();
		f.eat();
		Apple a = new Apple();
		a.eat();
		Orange o = new Orange();
		o.eat();
	}
}

class Apple extends Fruit{
	Apple(){
		name="Apple";
		taste="Sweet";
	}
	@Override
	public void eat() {
		System.out.println("Taste of "+name+" is: "+taste);
	}
}

class Orange extends Fruit{
	Orange(){
		name="Orange";
		taste="Sweet-tert";
	}
	@Override
	public void eat() {
		System.out.println("Taste of "+name+" is: "+taste);
	}
}