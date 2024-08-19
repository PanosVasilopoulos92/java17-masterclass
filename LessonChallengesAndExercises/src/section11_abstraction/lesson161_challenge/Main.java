package section11_abstraction.lesson161_challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>(100);

        mappables.add(new Building("Athens University of Economics", UsageType.UNIVERSITY));
        mappables.add(new Building("O.A.K.A.", UsageType.SPORTS));
        mappables.add(new Building("My house", UsageType.RESIDENTIAL));

        for (var m : mappables){
            Mappable.mapIt(m);
        }

    }
}
