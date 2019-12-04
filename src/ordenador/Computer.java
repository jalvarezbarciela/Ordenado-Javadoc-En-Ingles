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
     * @param type This variable save the type of the mouse
     * @param brand This variable save the brand of the screen
     * @param inches This variable save the inches of the screen
     * @param speed This variable save the speed of the CPU
     * @param memory This variable save the memory of the CPU
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
     * @param type This variable save the type of the mouse
     */
    public void setRato(String type){
        mouse=new Mouse(type);
    }
    /**
     * Method to set values
     * @param brand This variable save the brand of the screen
     * @param inches This variable save the inches of the screen
     */
    public void setPantalla(String brand,float inches){
        screen=new Screen(brand,inches);
    }
    /**
     * Method to set values
     * @param speed This variable save the speed of the CPU
     * @param memory This variable save the memory of the CPU
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
