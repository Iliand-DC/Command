public class WindowVentilateCommand implements Command{
    Window window;
    int prevStatus;
    public WindowVentilateCommand(Window window){
        this.window = window;
    }
    public void execute(){
        window.ventilate();
    }
}
