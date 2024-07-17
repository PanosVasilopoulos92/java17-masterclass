package section12_generics.lesson167_challenge;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends IMappable> {
    private List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<T>(List.of(layerElements));
    }

    public void addElement(T element) {
        layerElements.add(element);
    }

    public void addElements(T... elements) {
        layerElements.addAll(List.of(elements));
    }

    public void renderLayer() {
        for (T element : layerElements){
            element.render();
        }
    }
}
