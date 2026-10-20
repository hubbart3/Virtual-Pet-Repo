/**
Class for defining a dog in a virtual pet simulator.
*/
public class Dog extends Pet {
	/**
	Constructor for Dog. Uses the Super constructor from Pet to set
	the name of the Dog
	@param name the name of the dog
	*/
    public Dog(String name) {
        super(name);
    }

	/**
	Prints the name of the dog followed by "says: Woof!"
	*/
    public void bark() {
        System.out.println(getName() + " says: Woof!");
    }
    public void fetch() {
	System.out.println(getName() + " fetches the ball!");
    }
    public void petDog() {
	System.out.println(getName() + " loved you petting him!");
    }
    public void rollOver() {
	System.out.println(getName() + " rolled Over!");
    }
}
