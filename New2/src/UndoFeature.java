//package Fifth_Review;
import java.util.LinkedList;
class State {
    String txt;

    State(String txt) {
        this.txt = txt;
    }

    String getTxt() {
        return txt;
    }
}
class TextEditor {
    String currText = "";
    LinkedList<State> undoStack = new LinkedList<>();
    LinkedList<State> redoStack = new LinkedList<>();

    public void type(String newTxt) {
        undoStack.push(new State(currText));
        currText = newTxt;
        redoStack.clear();
        System.out.println("text: " + currText);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            State prev = undoStack.pop();
            redoStack.push(new State(currText));
            currText = prev.getTxt();
            System.out.println("undo done.now current is: " + currText);
        } else {
            System.out.println("no undo possible.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            State next = redoStack.pop();
            undoStack.push(new State(currText));
            currText = next.getTxt();
            System.out.println("redo done.now current is: " + currText);
        } else {
            System.out.println("no redo possible.");
        }
    }

    public void show() {
        System.out.println("current: " + currText);
    }
}
	public class UndoFeature {
	    public static void main(String[] args) {
	        TextEditor ed = new TextEditor();
	        ed.type("now this is the fiest");
	        ed.type("hey");
	        ed.type("hi there kartikey");
	        ed.type("hi there,how are u?");
	        ed.show();
	        ed.undo();
	        ed.show();
	        ed.undo();
	        ed.show();
	        ed.undo();
	        ed.show();

	        ed.undo();
	        ed.show();
            ed.redo();
            ed.show();
	    }
	}


	// Scenario 3: Undo Feature in Text Editor

	// Use Case: Every edit is stored and can be undone step-by-step.

	// Why LinkedList? LIFO structure fits Stack backed by LinkedList.

	// OOP Concepts:

	// Encapsulation: Each change is encapsulated as a state.

	// Abstraction: Undo/redo methods simplify complexity.

	// Inheritance: State can be a base class for text/image editing.  
