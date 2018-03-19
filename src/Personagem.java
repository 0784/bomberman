
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Personagem extends Rectangle{
    public Personagem personagem;
    private int direita = 1;
    private int esquerda = 1;
    private int down = 1;
    private int up = 1;
    
    private int posicaoX = 100,posicaoY = 100;
    
    
   
    
    
    /**
     * 
     * @param posicaox seta a posição em relação ao eixo x.
     * @param posicaoy seta a posição em relação ao eixo y.
     * @param width é a largura do objeto.
     * @param height é a altura do objeto.
     */
    Personagem(int posicaox, int posicaoy, int width, int height) {
        //configurações
        this.setX(posicaox);
        this.setY(posicaoy);
        this.setWidth(width);
        this.setHeight(height);
        this.setFill(new ImagePattern(new Image("imagens/tras1.png")));
        
    }

    /**
     * 
     * @return retorna uma posiçãox.
     */
    
    public int getPosicaoX() {
        return posicaoX;
    }
    
    /**
     * 
     * @return retorna uma posição y.
     */
    

    public int getPosicaoY() {
        return posicaoY;
    }
    
    /**
    *
    * Esse método é responsável por realizar o movimento para a direita comparando as posições em x e setando 10 unidades
    * se verdadeiro a condição e seta também a imagem.
    */
    
    
    
    
        public void moverRight() {
            
            
        if (getX() < 750) {
            setX(getX()+10);
        switch (direita) {
            case 1:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/direita11.png")));
                break;
            case 2:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/direita12.png")));
                break;
            case 3:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/direita11.png")));
                break;
            case 4:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/direita13.png")));
                direita = 0;
                break;
        }//}
        
        direita++;
        }}
        
        
        /**
        *
        * Esse método é responsável por realizar o movimento para a esquerda comparando as posições em x e setando 10 unidades
        * a menos se verdadeiro a condição e seta também a imagem.
        */
        
        
        
        public void moverLeft(){
        if (getX() > 0) {
            setX(getX()-10);
        switch (esquerda) {
            case 1:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/esquerda11.png")));
                break;
            case 2:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/esquerda12.png")));
                break;
            case 3:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/esquerda11.png")));
                break;
            case 4:
                //this.setY(posicaoY);
                this.setFill(new ImagePattern(new Image("imagens/esquerda13.png")));
                esquerda = 0;
                break;
        }
        
        esquerda++;
    }}
        
        /**
        *
        * Esse método é responsável por realizar o movimento para baixo comparando as posições em y e setando 10 unidades
        * a menos se verdadeiro a condição e seta também a imagem.
        */
    
        
        
        public void moverDown() {
        if (getY() < 350) {
            setY(getY() + 10);
            switch (down){
             case 1:
                this.setFill(new ImagePattern(new Image("imagens/frente1.png")));
                break;
            case 2:

                this.setFill(new ImagePattern(new Image("imagens/frente2.png")));
                break;
            case 3:

                this.setFill(new ImagePattern(new Image("imagens/frente1.png")));
                break;
            case 4:

                this.setFill(new ImagePattern(new Image("imagens/frente3.png")));
                down = 0;
                break;
                  
        
       }
            down++;
    }}
        
        
        /**
        *
        * Esse método é responsável por realizar o movimento para cima comparando as posições em y e setando 10 unidades
        * a menos se verdadeiro a condição e seta também a imagem.
        */
    
    public void moverUp() {
    if (getY() < 360) {
        setY(getY() - 10);
            switch (up){
             case 1:
                this.setFill(new ImagePattern(new Image("imagens/tras1.png")));
                break;
            case 2:

                this.setFill(new ImagePattern(new Image("imagens/tras2.png")));
                break;
            case 3:

                this.setFill(new ImagePattern(new Image("imagens/tras1.png")));
                break;
            case 4:

                this.setFill(new ImagePattern(new Image("imagens/tras3.png")));
                up = 0;
                break;
                  
        
       }
            up++;
    }}



        
            
            
        }
