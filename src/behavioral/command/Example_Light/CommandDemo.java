package behavioral.command.Example_Light;

// client
public class CommandDemo {

    public static void main(String[] args) {
        Light light = new Light(); // receiver;
        Switch lightSwitcher = new Switch(); // invoker;

        Command onCommand = new OnCommand(light); // command;

        lightSwitcher.storeAndExecute(onCommand);
    }

}
