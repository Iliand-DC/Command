public class Main {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();
        Window window = new Window("Kitchen");
        WindowOpenCommand kitchenWindowOpen = new WindowOpenCommand(window);
        WindowCloseCommand kitchenWindowClose = new WindowCloseCommand(window);
        WindowVentilateCommand kitchenWindowVentilate = new WindowVentilateCommand(window);
        remoteControl.setCommand(0, kitchenWindowOpen, kitchenWindowClose);
        remoteControl.setCommand(1, kitchenWindowVentilate, kitchenWindowClose);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.redoButtonWasPushed();
    }
}
