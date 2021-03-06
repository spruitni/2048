package gvsu.cis_350.project.core;

import javax.swing.*;

/**
 * Represents a single card in the game. This card will have an associated match.
 *
 * @author Desmin Little
 */

public final class Card {

    /**
     * The file path to the game's resources.
     */
    private static final String IMG_PATH = "resources/";
    /**
     * Static and final because all cards will share the same back and blank image.
     */
    public static final ImageIcon BACK = new ImageIcon(IMG_PATH + "questionImg.png");
    public static final ImageIcon BLANK = new ImageIcon(IMG_PATH + "blankImg.png");
    /**
     * The specific {@link CardType} of this card.
     */
    private CardType cardType;
    /**
     * Tells us whether or not this card has been clicked.
     */
    private boolean clicked = false;

    /**
     * Default Card constructor. Builds a card with the given
     * CardType.
     *
     * @param type The CardType of this card.
     */
    public Card(CardType type) {
        this.cardType = type;
    }

    /**
     * Tells us whether or not this card has been clicked.
     */
    public boolean hasBeenClicked() {
        return clicked;
    }

    /**
     * Sets whether or not this card has been clicked.
     */
    public void setHasBeenClicked(boolean flag) {
        this.clicked = flag;
    }

    /**
     * Retrieves the {@link CardType} of this card.
     *
     * @return The {@link CardType} of this card.
     */
    public CardType getCardType() {
        return cardType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Card) {
            Card card = (Card) obj;
            return this.cardType == card.cardType;
        }
        return false;
    }

    /**
     * An enum containing all possible card types in the game. Each element
     * contains the face image for it's specific type.
     *
     * @author Desmin Little
     */
    public enum CardType {
        BANANA(new ImageIcon(IMG_PATH + "bananaImg.jpg")),
        ORANGE(new ImageIcon(IMG_PATH + "orangeImg.jpg")),
        RED_APPLE(new ImageIcon(IMG_PATH + "redAppleImg.jpg")),
        GREEN_APPLE(new ImageIcon(IMG_PATH + "greenAppleImg.png")),
        PINEAPPLE(new ImageIcon(IMG_PATH + "pineappleImg.png")),
        STRAWBERRY(new ImageIcon(IMG_PATH + "strawberryImg.png")),
        GRAPES(new ImageIcon(IMG_PATH + "grapesImg.jpg")),
        CHERRY(new ImageIcon(IMG_PATH + "cherryImg.png")),
        BROWN_HAT(new ImageIcon(IMG_PATH + "brownHatImg.png")),
        ORANGE_CAR(new ImageIcon(IMG_PATH + "carOrangeImg.png")),
        PURPLE_CAR(new ImageIcon(IMG_PATH + "carPurpleImg.png")),
        PENCIL(new ImageIcon(IMG_PATH + "pencilImg.png")),
        RED_HAT(new ImageIcon(IMG_PATH + "redHatImg.png")),
        WHITE_FLOWER(new ImageIcon(IMG_PATH + "whiteFlowerImg.jpg")),
        BIRD(new ImageIcon(IMG_PATH + "birdImg.jpg")),
        BUTTERFLY(new ImageIcon(IMG_PATH + "butterflyImg.jpg")),
        CAT(new ImageIcon(IMG_PATH + "catImg.png")),
        CHICKEN(new ImageIcon(IMG_PATH + "chickenImg.png")),
        COW(new ImageIcon(IMG_PATH + "cowImg.png")),
        DOG(new ImageIcon(IMG_PATH + "dogImg.png")),
        FISH(new ImageIcon(IMG_PATH + "fishImg.png")),
        GOAT(new ImageIcon(IMG_PATH + "goatImg.jpg")),
        GORILLA(new ImageIcon(IMG_PATH + "gorillaImg.jpg")),
        HORSE(new ImageIcon(IMG_PATH + "horseImg.png")),
        LADYBUG(new ImageIcon(IMG_PATH + "ladybugImg.png")),
        LION(new ImageIcon(IMG_PATH + "lionImg.png")),
        MONKEY(new ImageIcon(IMG_PATH + "monkeyImg.png")),
        PANDA(new ImageIcon(IMG_PATH + "pandaImg.png")),
        PIG(new ImageIcon(IMG_PATH + "pigImg.png")),
        TIGER(new ImageIcon(IMG_PATH + "tigerImg.png")),
        TURTLE(new ImageIcon(IMG_PATH + "turtleImg.jpg")),
        ZEBRA(new ImageIcon(IMG_PATH + "zebraImg.jpg"));

        /**
         * This cards face image.
         */
        private ImageIcon face;

        /**
         * The default constructor requiring an image, which will
         * be used as this card type's face.
         *
         * @param face The face image of this card type.
         */
        CardType(ImageIcon face) {
            this.face = face;
        }

        /**
         * Retrieves this card type's face.
         *
         * @return
         */
        public ImageIcon getFace() {
            return this.face;
        }
    }

}
