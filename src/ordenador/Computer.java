package ordenador;
/**
 *
 * @author jalvarezbarciela
 */

public class Computer {
    private Mouse mouse=new Mouse();
    private Screen screen=new Screen();
    private CPU CPU=new CPU();
    /**
     * Builder with parameters
     * @param type 
     * @param brand
     * @param inches
     * @param speed
     * @param memory 
     */
    public Computer(String type,String brand,float inches,int speed,int memory){
        mouse=new Mouse(type);
        screen=new Screen(brand,inches);
        CPU=new CPU(speed,memory);
    }
    
    public Computer(){
        
    }
    /**
     * Method to set values
     * @param type 
     */
    public void setRato(String type){
        mouse=new Mouse(type);
    }
    /**
     * Method to set values
     * @param brand
     * @param inches 
     */
    public void setPantalla(String brand,float inches){
        screen=new Screen(brand,inches);
    }
    /**
     * Method to set values
     * @param speed
     * @param memory 
     */
    public void setCPU(int speed,int memory){
        CPU=new CPU(speed,memory);
    }
    /**
     * Method to get the values of mouse
     * @return mouse
     */
    public Mouse getMouse(){
        return mouse;
    }
    /**
     * Method to get the values of screen
     * @return screen
     */
    public Screen getScreen(){
        return screen;
    }
    /**
     * Method to get the values of CPU
     * @return CPU 
     */
    public CPU getCPU(){
        return CPU;
    }
    /**
     * Method to show the values
     * 
     */
    public void show(){
        System.out.println("Rato:"+mouse.getType()+"\nPantalla: \nMarca:"+screen.getBrand()+"\nPulgadas:"+screen.getInches()+"\nCPU:\nVelocidade:"+CPU.getSpeed()+"\nMemoria:"+CPU.getMemory());
    }
}
