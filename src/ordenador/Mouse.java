package ordenador;
/**
 *
 * @author jalvarezbarciela
 */
public class Mouse {
    private String type;
    /**
     * Constructor con parametros
     * @param type This variable save the type of the mouse
     */
    public Mouse(String type){
        this.type=type;
    }
    public Mouse(){
    
    }
    /**
     * Method to set the variable type
     * @param type This variable save the type of the mouse
     */
    public void setType(String type){
        this.type=type;
    }
    /**
     * Method to get the dates of the variable type
     * @return type This variable save the type of the mouse
     */
    public String getType(){
        return type;
    }
}
