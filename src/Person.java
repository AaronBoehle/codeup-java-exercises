class Person {
    public static void main(String[] args) {
        Person person1 = new Person ("Aaron");
        Person person2 = new Person ("Aaron");
        Person person3 = new Person ("Chris");
        System.out.println("We have indexed " + getNumberOfPersons() + " individual persons.");

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }

    public String name;
    private static int numberOfPersons = 0;

// CONSTRUCTOR

    public Person (String name) {
        this.name = name;
        numberOfPersons ++;
    }
    public static int getNumberOfPersons(){
        return numberOfPersons;
    }

    public String getName (){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello, " + name + "!");
    }






}