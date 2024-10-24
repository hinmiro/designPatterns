package memento;

import javafx.scene.control.ListCell;

public class MementoListCell extends ListCell<IMemento> {

    @Override
    protected void updateItem(IMemento item, boolean empty) {
        super.updateItem(item, empty);
        if (empty || item == null) {
            setText(null);
        } else {
            setText(item.toString());
        }
    }

    public IMemento getItems() {
        return getItem();
    }
}
