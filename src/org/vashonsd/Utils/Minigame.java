package org.vashonsd.Utils;

/**
 * Created by andy on 5/2/18.
 */
public abstract class Minigame {
    protected String name;
    protected String description;
    protected String quitWord;

    public Minigame(String name, String description, String quitWord) {
        this.name = name;
        this.description = description;
        this.quitWord = quitWord;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getQuitWord() {
        return this.quitWord;
    }

    /**
     * This method will be called when the game is started.
     *
     * This method can be used just to return a welcome message,
     * or it could also be used to set up the starting state of a game.
     * If the game will ever restarting, consider creating a setUp()
     * method that can be reused.
     *
     * @return A String representing a greeting.
     */
    public abstract String start();

    /**
     * This method will be called while the game is in play.
     *
     * handle() is the sole public method that should be called during
     * game interactions.
     *
     * @param str The String representing input from the user.
     * @return The response to the user.
     */
    public abstract String handle(String str);

    /**
     * This method will be called with the user signals a quit.
     *
     * @return A String representing an exit message
     */
    public abstract String quit();
}
