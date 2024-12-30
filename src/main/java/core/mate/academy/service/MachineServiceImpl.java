package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
@SuppressWarnings("unchecked")
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<? extends T> type) {
        MachineProducer<? extends T> machineProducer = selectProducer(type);
        if (machineProducer != null) {
            return (List<T>) machineProducer.get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }

    private MachineProducer<? extends T> selectProducer(Class<? extends T> type) {
        if (type.equals(Bulldozer.class)) {
            return (MachineProducer<? extends T>) new BulldozerProducer();
        }
        if (type.equals(Excavator.class)) {
            return (MachineProducer<? extends T>) new ExcavatorProducer();
        }
        if (type.equals(Truck.class)) {
            return (MachineProducer<? extends T>) new TruckProducer();
        }
        return null;
    }
}
