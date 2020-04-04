class Puppy {
    int puppyAge;

    public Puppy(String name){
        // Same name function is the constructor
        // This constructor has one parameter, name 
        System.out.println("Name chosen is:\t"+name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        // int + String can happen
        System.out.println("Puppy's age is :"+ puppyAge);
        return puppyAge;
    }

    public static void main(String []args){
        // object creation
        Puppy myPuppy = new Puppy("Stacy");

        // call class method to wet puppy's age */
        myPuppy.setAge(20);
        
        // call other class method ot get puppy's age
        myPuppy.getAge();

        System.out.println("Variable value:\t"+myPuppy.puppyAge);
    }
}