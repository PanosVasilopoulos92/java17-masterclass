package section11_abstraction.exercise47;

public abstract class ListItem {
    protected ListItem leftLink;
    protected ListItem rightLink;
    protected Object value;

    public ListItem(Object object){
        this.value = object;
    }

    public ListItem(ListItem leftLink, ListItem rightLink, Object value) {
        this.leftLink = leftLink;
        this.rightLink = rightLink;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    protected abstract ListItem next();
    protected abstract ListItem setNext(ListItem item);
    protected abstract ListItem previous();
    protected abstract ListItem setPrevious(ListItem item);
    public abstract int compareTo(ListItem object);

}
