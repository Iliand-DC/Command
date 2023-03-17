public class WindowOpenCommand implements Command{
    Window window;
    public WindowOpenCommand(Window window){
        this.window = window;
    }
    public void execute(){
        window.open();
    }
}
