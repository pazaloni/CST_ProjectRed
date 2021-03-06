import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class paneTester extends Application
{

    public static void main(String[] args)
    {

        Application.launch(args);

    }

    /**
     * Starts the panes to test
     */
    @Override
    public void start(Stage stage) throws Exception
    {
        evolutionPane ep = new evolutionPane();
        String[] namesBrown = { "pikachu", "raichu" };
        Image[] imgBrown = { new Image("images/pikachu.png"),
                new Image("images/raichu.png") };

        String[] namesAqua = { "Squirtle", "Wartortle", "Blastoise" };
        Image[] imgAqua = { new Image("images/squirtle.png"),
                new Image("images/wartortle.png"),
                new Image("images/blastoise.png") };

        Pokemon brown = new Pokemon(namesBrown, imgBrown, 10, 0);
        Pokemon aqua = new Pokemon(namesAqua, imgAqua, 5, 0);

        for (int i = 0; i < 10; i++)
        {
            aqua.addEvolutionPoint();
            System.out.println("Adding evolution points: "
                    + brown.evolutionPoints);
        }
        System.out.println(aqua.evolutionPoints);

        // aqua.evolve();

        // Pane pane = ep.buildEvolutionPane(brown);

        Pane pane = ep.buildDevolutionPane(aqua);

        // Pane pane = ep.buildEvolutionPane(brown);

        // brown.evolve();
        // Pane pane = ep.buildDevolutionPane(brown);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

}
