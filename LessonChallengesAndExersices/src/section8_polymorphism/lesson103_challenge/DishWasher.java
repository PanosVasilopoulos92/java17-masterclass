package section8_polymorphism.lesson103_challenge;

public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(){}

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean hasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }


    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Washing dishes");
        }
    }

    @Override
    public String toString() {
        return "DishWasher{" +
                "hasWorkToDo=" + hasWorkToDo +
                '}';
    }
}
