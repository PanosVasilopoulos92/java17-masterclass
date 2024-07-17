package section13_nested_classes.practice_topic;

public class Enclosing {
    private static int staticData;
    private int nonStaticData;

    class NonStaticInner {
        private int innerData;

        public NonStaticInner(int innerData) {
            this.innerData = innerData;
        }

        public void accessOuterMembers() {
            System.out.println("Static field: " + staticData);
            System.out.println("non static field: " + nonStaticData);
        }

        @Override
        public String toString() {
            return "NonStaticInner{" +
                    "innerData=" + innerData +
                    '}';
        }
    }

    static class StaticNested {
        private static int nestedData;

        public StaticNested() {
        }

        public void accessOuterStaticMembers() {
            System.out.println(staticData);
        }


    }

    public Enclosing() {
        staticData++;
    }

    public Enclosing(int nonStaticData) {
        this.nonStaticData = nonStaticData;
        staticData++;
    }

    public static void staticMethod() {
        System.out.println(staticData);
    }

    public void nonStaticMethod() {
        System.out.println(nonStaticData);
    }

    @Override
    public String toString() {
        return "Enclosing{" +
                "nonStaticData=" + nonStaticData +
                '}';
    }
}
