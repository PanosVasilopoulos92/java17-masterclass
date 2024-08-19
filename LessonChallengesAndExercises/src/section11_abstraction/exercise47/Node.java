package section11_abstraction.exercise47;

public class Node extends ListItem {


    public Node(Object object) {
        super(object);
    }

    public Node(ListItem leftLink, ListItem rightLink, Object value) {
        super(leftLink, rightLink, value);
    }

    @Override
    protected ListItem next() {
        return rightLink;
    }

    @Override
    protected ListItem setNext(ListItem item) {
        rightLink = item;
        return rightLink;
    }

    @Override
    protected ListItem previous() {
        return leftLink;
    }

    @Override
    protected ListItem setPrevious(ListItem item) {
        leftLink = item;
        return leftLink;
    }

    @Override
    public int compareTo(ListItem object) {
        if (object.getValue().equals(this.getValue())) {
            return 0;
        }
        return -1;
    }
}
