import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class DiceViewTest extends Application
{
GameBoard board;
    public static void main(String[] args)
    {
        Application.launch(args);

    }
    private Button roll = new Button("Roll");
    @Override
    public void start(Stage stage) throws Exception
    {
    	board = new GameBoard();
    	
    	
      roll.setOnAction(new EventHandler<ActionEvent>()
      {

  @Override
  public void handle(ActionEvent ae) {
      //dieOne = new Thread();
	  	  roll.setDisable(true);

          System.out.println("It worked");
          //die.startBattleRolling();
          board.rollDie();
      

      //dieOne.start();

  }

      });
        VBox main = new VBox();
        
        
        DieView view = new DieView();
        
         
        
        
        main.getChildren().addAll(board.die1, roll);
        
        
        //Die die = new Die(view);
        
        //addHandler(die);
        
        Scene scn = new Scene(main);
        stage.setScene(scn);
        stage.show();
        
    }
    
//    public void addHandler(Die die)
//    {
//        System.out.println("it made handler");
//        roll.setOnAction(new EventHandler<ActionEvent>()
//                {
//
//            @Override
//            public void handle(ActionEvent ae) {
//                //dieOne = new Thread();
//
//                    System.out.println("It worked");
//                    //die.startBattleRolling();
//                    die.startMoveRolling();
//
//                //dieOne.start();
//
//            }
//
//                });
//    }

}
