public class WindowCloseCommand implements Command{
    Window window;
    public WindowCloseCommand(Window window){
        this.window = window;
    }
    public void execute(){
        window.close();
    }
}
