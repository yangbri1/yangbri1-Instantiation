
public class Lab {
    /**
     * Java relies very heavily on OOP, so all of our code will rely on Objects. Before we write our own objects,
     * let's first look into how we can leverage them in our code. Every test, for instance, has to first create an
     * object before it runs the code contained within. Let's do something similar here.
     *
     * Instantiate any object using the 'new' keyword.
     * It doesn't matter what type of object you use.
     * If you're not feeling creative, you can use the Object class.
     *
     * Example:
     *      Type reference = new Type();
     *      return reference;
     *
     * Note: Null is a special type which represents the absence of an object.
     *
     * @return any object.
     */
    public Object instantiateANewObject(){
        // instantiate/create a class in memory aka obj --- call constructor (indicator -> "new")
        // Aside: obj class could be of a different class file in same directory to this one
        Lab referenceVar= new Lab();

        // return the reference variable 
        // could use dot notation to access 'referenceVar' properties: 
        // instance variables (fields/states)
        // instance methods (behaviors)
        return referenceVar;
    }
}