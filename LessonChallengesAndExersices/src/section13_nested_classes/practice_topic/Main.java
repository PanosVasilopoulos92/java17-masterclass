package section13_nested_classes.practice_topic;

public class Main {

    public static void main(String[] args) {
        Enclosing instanceOne = new Enclosing(20);
        System.out.println(instanceOne);
        Enclosing.staticMethod();

        Enclosing instanceThree = new Enclosing(220);
        System.out.println(instanceThree);
        Enclosing.staticMethod();

        Enclosing.NonStaticInner instanceTwo = instanceOne.new NonStaticInner(10);
        System.out.println(instanceTwo);
        instanceTwo.accessOuterMembers();

        Enclosing.StaticNested instanceFour = new Enclosing.StaticNested();
        instanceFour.accessOuterStaticMembers();


    }
}
