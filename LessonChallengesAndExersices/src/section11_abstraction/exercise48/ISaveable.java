package section11_abstraction.exercise48;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> list);
}
