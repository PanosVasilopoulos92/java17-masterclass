package section11_abstraction.exercise47;

import java.util.LinkedList;
import java.util.List;

public class SearchTree extends MyLinkedList implements NodeList {
    private ListItem root;

    private List<ListItem> list = new LinkedList<>();

    public SearchTree(ListItem root) {
        super(root);
    }

    public SearchTree(List<ListItem> list, ListItem root) {
        super(list, root);
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
         return super.addItem(item);
    }

    @Override
    public boolean removeItem(ListItem item) {
        return super.removeItem(item);
    }

    @Override
    public void traverse(ListItem item) {
        super.traverse(item);
    }
}
