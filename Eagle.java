public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        
        if(this.flying == false) {
            this.flying = true;
            System.out.printf("%s take off in the sky!!! %n", this.getName());
        }
    }
    
    @Override
    public int ascend(int meters){
        if(this.flying) {
            this.altitude += meters;
            System.out.printf("%s flies upward, the altitude is : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }
    @Override
    public int descend(int meters){
        if(this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward, the altitude is : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land(){
        if(this.altitude >1) {
            System.out.printf("%s is to high, it can't land!!!%n", this.getName());
        }
        else {System.out.printf("%s is landing....%n", this.getName());
              this.flying = false;          
        }
    }
    


}
