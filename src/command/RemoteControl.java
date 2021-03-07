package command;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RemoteControl {
    List<Command> onCommands;
    List<Command> offCommands;

    public RemoteControl() {
        int size = 7;
        onCommands = new ArrayList<>(size);
        offCommands = new ArrayList<>(size);

        Command noCommand = new NoCommand();
        for (int i = 0; i < size; i++) {
            onCommands.add(noCommand);
            offCommands.add(noCommand);
        }
    }

    public void setOnCommands(int slot, Command onCommand, Command offCommand) {
        onCommands.set(slot, onCommand);
        offCommands.set(slot, offCommand);
    }

    public void onButtonWasPushed(int slot) {
        onCommands.get(slot).execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands.get(slot).execute();
    }
}
