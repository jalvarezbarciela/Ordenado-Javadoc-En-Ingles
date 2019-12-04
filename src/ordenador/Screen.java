package ordenador;
/**
 *
 * @author jalvarezbarciela
 */
public class Screen {
    private String brand;
    private float inches;
    /**
     * Buider with parameters
     * @param brand This variable save the brand of the screen
     * @param inches This variable save the inches of the screen
     */
    public Screen(String brand, float inches){
        this.brand=brand;
        this.inches=inches;
        
    }
        public Screen(){
    }
    /**
     * Method to set the variable brand
     * @param brand This variable save the brand of the screen
     */
    public void setBrand(String brand){
        this.brand=brand;
    }
    /**
     * Method to set the variable inches
     * @param inches This variable save the inches of the screen
     */
    public void setInches(float inches){
        this.inches=inches;
    }
    /**
     * Method to get the value of the variable brand
     * @return brand This variable save the brand of the screen
     */
    public String getBrand(){
        return brand;
    }
    /**
     * Method to get the value of the variable inches
     * @return inches This variable save the inches of the screen
     */
    public float getInches(){
        return inches;
    }
}
