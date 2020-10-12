class Employee{
    String name,city;
    int age;
    public static void display(String name,String city,int age) {
        System.out.println("\nThe name is "+name);
        System.out.println("The age is "+age);
        System.out.println("The city is "+city);
    }
}
class Day2Q1{
    public static void main(String args[]) {
        Employee e1=new Employee();
        e1.display("Saurabh", "Chennai", 25);
        Employee e2=new Employee();
        e2.display("Guddu Pandit", "Mirzapur", 28);
    }
}