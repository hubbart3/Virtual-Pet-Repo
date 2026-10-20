/**
Class for defining a cat in a virtual pet simulator.
*/
public class Cat extends Pet {
	private int jumps;

	/**
	Constructor for Cat. Uses the Super constructor from Pet to set
	the name of the Cat
	@param name the name of the cat
	*/
    public Cat(String name) {
        super(name);
	jumps = 0;
    }

	/**
	Prints the name of the cat followed by "says: Meow!"
	*/
    public void meow() {
        System.out.println(getName() + " says: Meow!");
    }

	/**
	 Prints the name of the cat followed by "purrs happily!"
	 */
    public void purr() {
	System.out.println(getName() + " purrs happily!");
    }    

    /**
     Prints the name of cat followed by " jumps high into the air!"
     adds to jump.
     */
    public void jump() {
	System.out.println(getName() + " jumps high into the air!");
	jumps++;
    }
    /**
    Prints jump stats for cat
    */
    public void jumpStat() {
	System.out.println(getName() + " jumped " + jumps);
    }
}
