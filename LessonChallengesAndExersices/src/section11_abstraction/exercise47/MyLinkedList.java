package section11_abstraction.exercise47;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList implements NodeList {

    private List<ListItem> list = new LinkedList<>();

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public MyLinkedList(List<ListItem> list, ListItem root) {
        this.list = list;
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (!list.contains(item)) {
            list.add(item);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (!list.contains(item)){
            return false;
        } else {
            list.remove(item);
            return true;
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (this.root == null){
            System.out.println("The list is empty");
        } else {
            for (var item : list){
                System.out.println(item);
            }
        }
    }
}
