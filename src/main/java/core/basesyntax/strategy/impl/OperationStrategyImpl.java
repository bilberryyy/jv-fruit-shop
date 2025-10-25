package core.basesyntax.strategy.impl;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.OperationHandler;
import core.basesyntax.strategy.OperationStrategy;
import java.util.Map;

public class OperationStrategyImpl implements OperationStrategy {
    private final Map<FruitTransaction.Operation, OperationHandler> handlers;

    public OperationStrategyImpl(Map<FruitTransaction.Operation, OperationHandler> handlers) {
        this.handlers = handlers;
    }

    @Override
    public void apply(FruitTransaction transaction) {
        OperationHandler handler = handlers.get(transaction.getOperation());
        if (handler == null) {
            throw new RuntimeException("No handler for operation: " + transaction.getOperation());
        }
        handler.apply(transaction);
    }
}
