package domain.bridge.strategy;

import domain.LadderBridge;
import domain.bridge.BridgeGenerator;

import java.util.ArrayList;
import java.util.List;

public class BridgeGeneratorStub implements BridgeGenerator {
    private List<LadderBridge> bridges;

    public void setBridges(List<LadderBridge> bridges) {
        this.bridges = bridges;
    }

    public BridgeGeneratorStub() {
        this.bridges = new ArrayList<>();
    }

    @Override
    public List<LadderBridge> generate(int count) {
        return bridges;
    }
}
