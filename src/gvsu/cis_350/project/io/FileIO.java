package gvsu.cis_350.project.io;

import com.sun.istack.internal.logging.Logger;
import gvsu.cis_350.project.core.Player;

import java.io.*;
import java.util.Objects;
import java.util.logging.Level;

/**
 * A class used for the saving and loading of files to and from the game.
 *
 * @author Desmin Little
 */
public class FileIO {

    /**
     * The program's save path for data files.
     */
    private static final String SAVE_PATH = "./data/";

    private static Logger logger = Logger.getLogger(FileIO.class);

    /**
     * Serializes a Player's data.
     *
     * @param player The Player whose data we'll be saving.
     * @throws IOException
     */
    public static void savePlayerData(Player player) {
        logger.log(Level.INFO, "Saving data for user: " + player.getName());
        File dir = new File(SAVE_PATH);
        if (!dir.exists())
            dir.mkdir();
        try {
            FileOutputStream fO = new FileOutputStream(SAVE_PATH + player.getName() + ".mgd");

            DataOutputStream out = new DataOutputStream(fO);
            out.writeInt(player.getWins());
            out.close();
            fO.close();
        } catch (Exception e) {

        }
    }

    /**
     * Loads player data using the given name.
     *
     * @param name The name of the player we wish to load.
     * @return The Player with previously saved data, or if previous data
     * doesn't exist a new Player.
     */
    public static Player loadPlayerData(String name) {
        logger.log(Level.INFO, "Attempting to find user: " + name);
        Player newPlayer = new Player(name, 0);
        FileInputStream file;
        try {
            file = new FileInputStream(SAVE_PATH + name + ".mgd");
            if (Objects.nonNull(file)) {
                DataInputStream in = new DataInputStream(file);
                newPlayer.setWins(in.readInt());
                in.close();
                logger.log(Level.INFO, "User " + name + " found!");
            }
        } catch (IOException e) {
            logger.log(Level.INFO, "User not found, creating new user: " + name);
            return newPlayer;
        }
        try {
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newPlayer;
    }

}
