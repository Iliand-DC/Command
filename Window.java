public class Window {
    private String location;
    public Window(String location){
        this.location = location;
    }
    public void open(){
        System.out.println(location + " window is open");
    }
    public void close(){
        System.out.println(location + " window is close");
    }
    public void ventilate(){
        System.out.println(location + "window is ventilate");
    }
}
