package com.beering.beerig_app;

/**
 * @author Brady Murphy
 * @version July 13 2018
 *
 * This class represents a Drink on the list.
 * It contains the drink name, description, and specific
 * ASCII character that is used to send over UART to arduino
 */
public final class Drink {
    /**
     * instance variables used to define a Drink
     */
    private final String drinkName; // name of drink
    private final String description; // describes the drink
    private final String uartCom; // this will be sent to the arduino
    private String recipe; // ingredients for each drink
    private long pourTime; // time of each pour
    private StringBuilder builder = new StringBuilder(); //needed to append ingredients

    /**
     * constructor to create a drink object
     * @param name of drink
     * @param desc description of the drink and contents
     * @param uart character value which will define the drink
     */
    public Drink(String name, long time, String desc, String uart, String... recipe) {
        this.drinkName = name;
        this.description = desc;
        this.uartCom = uart;
        this.pourTime = time;
        builder.append("Ingredients: ");
        for(String ingred: recipe){
            builder.append("\n- " + ingred);
        }
        this.recipe = builder.toString();
    }

    /**
     * gets the drink name
     *
     * @return String object contianing drink name
     */
    public String getDrinkName() {
        return drinkName;
    }

    /**
     * gets the description of the drink
     *
     * @return a String obj contianing the drink description
     */
    public String getDescription() {
        return description;
    }

    /**
     * gets the character to be sent over UART
     *
     * @return String value to be sent over UART
     */
    public String getUartCom() {
        return uartCom;
    }

    /**
     * gets ingredients for drink
     *
     * used to display in dialog for users to see
     *
     * @return a String array of each ingredient
     */
    public String getRecipe(){
        return recipe;
    }

    /**
     * returns the time it takes to pour the drink
     * in milliseconds
     *
     * @return long value representing time
     */
    public long getPourTime(){
        return this.pourTime;
    }

}
