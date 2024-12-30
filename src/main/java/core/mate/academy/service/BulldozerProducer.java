package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return new ArrayList<>(Arrays.asList(
                new Bulldozer("Bulldozer-1", "red", 4500),
                new Bulldozer("Bulldozer-2", "black", 4000),
                new Bulldozer("Bulldozer-3", "white", 3800)
        ));
    }
}
