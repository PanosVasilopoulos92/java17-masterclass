package section8_polymorphism.lesson103_challenge;

public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(){}

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean hasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering food");
        }
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "hasWorkToDo=" + hasWorkToDo +
                '}';
    }
}
