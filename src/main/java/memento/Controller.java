package memento;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history
    private List<IMemento> undontHistory; //undo history

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.undontHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory(history);
        model.setOption(optionNumber, choice);
        undontHistory.clear();
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory(history);
        model.setIsSelected(isSelected);
        undontHistory.clear();
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            saveToHistory(undontHistory);
            System.out.println("Memento found in history");
            IMemento previousState = history.remove(history.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void undoNot() {
        if (!undontHistory.isEmpty()) {
            IMemento previousState = undontHistory.removeLast();
            saveToHistory(history);
            model.restoreState(previousState);
            gui.updateGui();
        } else {
            System.out.println("No redos left...");
        }
    }

    private void saveToHistory(List<IMemento> history) {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }
}
