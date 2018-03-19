
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * Essa classe é responsável por fazer o controle de todas as outras classes.
 * 
 */
public class Main extends Application {
    MediaPlayer mediaplayer;
    

    /**
     * Esse método é responsável por iniciar todas as ações portanto todas as classes e métodos deverão nele ser instânciadas.
     * o método recebe também todos os eventos de cada classe do pacote trazendo variáveis, métodos de outras classes mas sendo inicializadas
     * somente no método start.
     * on
     * @param primaryStage são cenas sendo chamadas de outras classes.
     */
    @Override
    public void start(Stage primaryStage) {
        Media musicFile = new Media("file:///C:/Users/carlos/Desktop/sprites/som1.mp3");//msc
        mediaplayer = new MediaPlayer(musicFile);///msc
        mediaplayer.setAutoPlay(true);//musica
        
        Pane root = new Pane();
        Menu telamenu = new Menu(root, 800, 400);
        primaryStage.setScene(telamenu);

        Pane root2 = new Pane();
        Fase1 fase1 = new Fase1(root2, 800, 400);
        Pane root3 = new Pane();
        Fase2 fase2 = new Fase2(root3, 800, 400);
        Pane root4 = new Pane();
        Perdeu perdeu = new Perdeu(root4, 800, 400);
        Pane root5 = new Pane();
        PrimeiraFase instru = new PrimeiraFase(root5,800,400);
        Pane root6 = new Pane();
        SegundaFase instru2 = new SegundaFase(root6,800,400);
        Pane root7 = new Pane();
        Ganhou ganhou = new Ganhou(root7,800,400);

        

        int StatusMorte = 0;

        telamenu.setOnKeyPressed((KeyEvent event) -> {

            if (event.getCode().equals(KeyCode.ENTER)) {
                fase1.resetaFase1();
                primaryStage.setScene(instru);
                Timeline time2 = new Timeline(new KeyFrame(Duration.seconds(2), y ->{
                  primaryStage.setScene(fase1);
                }));
                    time2.play();
                
            }
            if (event.getCode().equals(KeyCode.ESCAPE)) {
                primaryStage.close();
            }

        });

        fase2.setOnKeyPressed((KeyEvent event) -> {
            
            if(fase2.getInimigos().size() == 0){
                
                //musicafase2.stop();
                //musicag.play();
                primaryStage.setScene(ganhou);
                
                
                Timeline tempo = new Timeline(new KeyFrame(Duration.seconds(7), x -> {
                        primaryStage.setScene(telamenu);

                    }));
                    tempo.play();
                    //musicag.stop();
                    //musicafundo.play();
                    
                    

            
            }
            
            
            if (event.getCode().equals(KeyCode.D)) {
                if (!fase2.obstaculos()) {
                    fase2.perso.moverRight();
                    fase2.atropelamento();

                } else {
                    //musicafase2.stop();
                    //perdeum.play();
                    primaryStage.setScene(perdeu);
                    
                    Timeline tempo = new Timeline(new KeyFrame(Duration.seconds(5), x -> {
                        //perdeum.stop();
                        //musicafundo.play();
                        primaryStage.setScene(telamenu);

                    }));
                    tempo.play();

                }

            }

            if (event.getCode().equals(KeyCode.A)) {
                if (!fase2.obstaculos()) {
                    fase2.perso.moverLeft();
                    fase2.atropelamento();

                } else {
                    primaryStage.setScene(perdeu);
                    Timeline tempo = new Timeline(new KeyFrame(Duration.seconds(5), x -> {
                        primaryStage.setScene(telamenu);

                    }));
                    tempo.play();

                }

            }
            if (event.getCode().equals(KeyCode.W)) {
                if (!fase2.obstaculos()) {
                    fase2.perso.moverUp();
                    fase2.atropelamento();
                } else {
                    primaryStage.setScene(perdeu);
                    Timeline tempo = new Timeline(new KeyFrame(Duration.seconds(5), x -> {
                        primaryStage.setScene(telamenu);

                    }));
                    tempo.play();

                }

            }

            if (event.getCode().equals(KeyCode.S)) {
                if (!fase2.obstaculos()) {
                    fase2.perso.moverDown();
                    fase2.atropelamento();
                } else {
                    primaryStage.setScene(perdeu);
                    Timeline tempo = new Timeline(new KeyFrame(Duration.seconds(5), x -> {
                        primaryStage.setScene(telamenu);

                    }));
                    tempo.play();

                }
            }

        });

        fase1.setOnKeyPressed((KeyEvent event) -> {
             if(fase1.getInimigos().size() == 0){
               fase2.resetaFase2();
               primaryStage.setScene(instru2);
               Timeline time = new Timeline(new KeyFrame(Duration.seconds(2), y ->{
                  primaryStage.setScene(fase2);
                  //musicafundo.stop();
                  //musicafase2.play();
               
               }));
               time.play();
             }

            

            if (event.getCode().equals(KeyCode.D)) {
                fase1.andar();
                fase1.perso.moverRight();
                fase1.matar();

            }

            if (event.getCode().equals(KeyCode.A)) {
                fase1.andar();
                fase1.perso.moverLeft();
                fase1.matar();

            }
            if (event.getCode().equals(KeyCode.W)) {
                fase1.andar();
                fase1.perso.moverUp();
                fase1.matar();

            }

            if (event.getCode().equals(KeyCode.S)) {
                fase1.andar();
                fase1.perso.moverDown();
                fase1.matar();
            }

        });

        primaryStage.setTitle("Bomberman");
        primaryStage.show();
    }

   /**
    * esse método é responsável por designar o main da aplicação sendo assim uma classe principal.
    * @param args 
    */

    public static void main(String[] args) {
        launch(args);
    }
}
