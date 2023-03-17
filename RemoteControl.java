import java.util.Stack;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> undo = new Stack<Command>();
    Stack<Command> redo = new Stack<Command>();

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undo.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undo.push(offCommands[slot]);
    }

    public void undoButtonWasPushed() {
        if (!undo.empty()) {
            redo.push(undo.peek());
            undo.pop();
            undo.peek().execute();
        }
    }

    public void redoButtonWasPushed() {
        if (!redo.empty()) {
            undo.push(redo.peek());
            redo.peek().execute();
            redo.pop();
        }
    }
}
