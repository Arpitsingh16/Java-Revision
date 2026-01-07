public class methodSimple {
    private int id;
    private String name;


    void isRunning(){
        System.out.println("Help i'm running");
    }

    public String getName(int id, String name){
        this.id = id;
        System.out.print("Name is " + name + " id is " + id);
        return "";
    }
    public static void main(String[] args) {
        methodSimple ms = new methodSimple();
        ms.isRunning();
        ms.getName(200, "Arpit");
    }
    
}
