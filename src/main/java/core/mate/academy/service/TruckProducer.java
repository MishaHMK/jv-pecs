package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return new ArrayList<>(Arrays.asList(
                new Truck("Truck-1", "purple", 110),
                new Truck("Truck-2","white",120),
                new Truck("Truck-3","pink",100)
        ));
    }
}
