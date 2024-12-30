package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return new ArrayList<>(Arrays.asList(
                new Excavator("Excavator-1", "green", 56.5),
                new Excavator("Excavator-2", "orange", 62.2),
                new Excavator("Excavator-3", "grey", 67.9)
        ));
    }
}
