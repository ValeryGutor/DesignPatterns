package behavioral.command.example_Light;

// invoker;
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }

}
