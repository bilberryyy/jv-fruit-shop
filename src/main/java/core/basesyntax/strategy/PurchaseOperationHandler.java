package core.basesyntax.strategy;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;

public class PurchaseOperationHandler implements OperationHandler {
    @Override
    public void apply(FruitTransaction transaction) {
        String fruit = transaction.getFruit();
        int quantity = transaction.getQuantity();
        int current = Storage.fruits.getOrDefault(fruit,0);

        if (current < quantity) {
            throw new RuntimeException("Not enough " + fruit + " in stock to purchase " + quantity);
        }

        Storage.fruits.put(fruit, current - quantity);
    }
}
