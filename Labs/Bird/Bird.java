public class Bird{
    
    private String name;
    private boolean fly;
    private boolean swim;

    public Bird(){
        name = "Bird";
        fly = true;
        swim = false;
    }
    
    public Bird(String name, boolean fly, boolean swim){
        this.name = name;
        this.fly = fly;
        this.swim = swim;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setFly(boolean fly){
        this.fly = fly;
    }

    public boolean canFly(){
        return fly;
    }
    
    public void setSwim(boolean fly){
        this.swim = swim;
    }

    public boolean canSwim(){
        return swim;
    }

    @Override
    public String toString(){
        String canFly = fly ? "can" : "cannot";
        String canSwim = swim ? "can" : "cannot ";
        return String.format("The %s %s fly and %s swim.\n", name, canFly, canSwim);
    }
    
}
