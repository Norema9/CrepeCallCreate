import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class CreateGroup extends Group {
    Image backGroundImage = new Image("image_create\\backgroundCreate.png.jpg");
    ImageView backGroundImageView = new ImageView(backGroundImage);
    ArrayList<Ingredient> allFruits;
    ArrayList<Ingredient> allSauces;
    ArrayList<Ingredient> allToppings;

    public CreateGroup(){
        super();
        this.getChildren().add(backGroundImageView);

        // filling the list which contains all the fruits we have
        allFruits.add(new Ingredient("banana", "fileBanana"));
        allFruits.add(new Ingredient("strawberry", "fileStrawberry"));
        allFruits.add(new Ingredient("apple", "fileApple"));

        // filling the list which contains all the sauce we have
        allSauces.add(new Ingredient("chocolate", "fileChocolate"));
        allSauces.add(new Ingredient("chocolate", "fileChocolate"));
        allSauces.add(new Ingredient("chocolate", "fileChocolate"));

        // filling the list which contains all the toppings we have
        allToppings.add(new Ingredient(""))

    }

    public void startCreateGroup(){at.start();}
    AnimationTimer at = new AnimationTimer() {
        @Override
        public void handle(long l) {
            render(l);
        }
    };

    public void render(long l){
        backGroundImageView.setViewport(new Rectangle2D(0, 0, 400, 400));
    }
}
