package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
public class Controller {


    @FXML
    public Button Boton;
    @FXML
    public Button BotonEliminar;
    @FXML
    public GridPane fondo;

    @FXML
    public Button pok1Fondo;
    @FXML
    public Label pok1Nombre;
    @FXML
    public Label pok1Nivel;
    @FXML
    public Label pok1Vida;


    @FXML
    public Button pok2Fondo;
    @FXML
    public Label pok2Nombre;
    @FXML
    public Label pok2Nivel;
    @FXML
    public Label pok2Vida;


    @FXML
    public Button pok3Fondo;
    @FXML
    public Label pok3Nombre;
    @FXML
    public Label pok3Nivel;
    @FXML
    public Label pok3Vida;


    @FXML
    public Button pok4Fondo;
    @FXML
    public Label pok4Nombre;
    @FXML
    public Label pok4Nivel;
    @FXML
    public Label pok4Vida;


    @FXML
    public Button pok5Fondo;
    @FXML
    public Label pok5Nombre;
    @FXML
    public Label pok5Nivel;
    @FXML
    public Label pok5Vida;


    @FXML
    public Button pok6Fondo;
    @FXML
    public Label pok6Nombre;
    @FXML
    public Label pok6Nivel;
    @FXML
    public Label pok6Vida;


    @FXML
    public void initialize() {

        //inicializamos cada pokemon con sus datos que queremos que tengan
        pokemonData pokemon1= new pokemonData("Sirenita","Nv. 14","148/149");
        pokemonData pokemon2= new pokemonData("Pikachutu","Nv. 23","204/205");
        pokemonData pokemon3= new pokemonData("Fueguito","Nv. 54","475/840");
        pokemonData pokemon4= new pokemonData("Mariposon","Nv. 65","437/875");
        pokemonData pokemon5= new pokemonData("Oruga Fea","Nv. 5","657/764");
        pokemonData pokemon6= new pokemonData("Caparazon","Nv. 76","6/785");


        //ponemos los nombres, niveles y vidas de cada pokemon.
        pok1Nombre.setText(pokemon1.nombrePokemon);
        pok1Nivel.setText(pokemon1.nivelPokemon);
        pok1Vida.setText(pokemon1.vidaPokemon);

        pok2Nombre.setText(pokemon2.nombrePokemon);
        pok2Nivel.setText(pokemon2.nivelPokemon);
        pok2Vida.setText(pokemon2.vidaPokemon);

        pok3Nombre.setText(pokemon3.nombrePokemon);
        pok3Nivel.setText(pokemon3.nivelPokemon);
        pok3Vida.setText(pokemon3.vidaPokemon);

        pok4Nombre.setText(pokemon4.nombrePokemon);
        pok4Nivel.setText(pokemon4.nivelPokemon);
        pok4Vida.setText(pokemon4.vidaPokemon);

        pok5Nombre.setText(pokemon5.nombrePokemon);
        pok5Nivel.setText(pokemon5.nivelPokemon);
        pok5Vida.setText(pokemon5.vidaPokemon);

        pok6Nombre.setText(pokemon6.nombrePokemon);
        pok6Nivel.setText(pokemon6.nivelPokemon);
        pok6Vida.setText(pokemon6.vidaPokemon);
    }
    @FXML
    public void dropSeleccion(){
        pok1Fondo.setStyle(" -fx-border-width: 5;-fx-border-color: red; -fx-background-color:white;");
        pok1Nombre.setTextFill(Color.WHITE);
        pok1Nivel.setTextFill(Color.WHITE);
        pok1Vida.setTextFill(Color.WHITE);

        pok2Fondo.setStyle(" -fx-border-width: 5;-fx-border-color: red; -fx-background-color:white;");
        pok2Nombre.setTextFill(Color.WHITE);
        pok2Nivel.setTextFill(Color.WHITE);
        pok2Vida.setTextFill(Color.WHITE);

        pok3Fondo.setStyle(" -fx-border-width: 5;-fx-border-color: red; -fx-background-color:white;");
        pok3Nombre.setTextFill(Color.WHITE);
        pok3Nivel.setTextFill(Color.WHITE);
        pok3Vida.setTextFill(Color.WHITE);

        pok4Fondo.setStyle(" -fx-border-width: 5;-fx-border-color: red; -fx-background-color:white;");
        pok4Nombre.setTextFill(Color.WHITE);
        pok4Nivel.setTextFill(Color.WHITE);
        pok4Vida.setTextFill(Color.WHITE);

        pok5Fondo.setStyle(" -fx-border-width: 5;-fx-border-color: red; -fx-background-color:white;");
        pok5Nombre.setTextFill(Color.WHITE);
        pok5Nivel.setTextFill(Color.WHITE);
        pok5Vida.setTextFill(Color.WHITE);

        pok6Fondo.setStyle(" -fx-border-width: 5;-fx-border-color: red; -fx-background-color:white;");
        pok6Nombre.setTextFill(Color.WHITE);
        pok6Nivel.setTextFill(Color.WHITE);
        pok6Vida.setTextFill(Color.WHITE);
        fondo.setStyle("-fx-background-color:#B2A5B9;");
    }
    @FXML
    public void elijoPokemon(Button ejemplo,Label ejemplo1,Label ejemplo2,Label ejemplo3){
        dropSeleccion();
        ejemplo.setStyle("-fx-border-color: white; -fx-background-color:#D7D7D7; -fx-border-width: 5;");
        ejemplo1.setTextFill(Color.rgb(0, 126, 213));
        ejemplo2.setTextFill(Color.rgb(0, 126, 213));
        ejemplo3.setTextFill(Color.rgb(0, 126, 213));
        Boton.setDisable(false);
    }
    @FXML
    public void clickOnSalir(ActionEvent event){
        fondo.setStyle("-fx-background-color:grey;");
    }
    @FXML
    public void clickOnDropPoke(ActionEvent event){
        dropSeleccion();
        Boton.setDisable(true);
    }

    @FXML
    public void clickOnPokemon1(ActionEvent event){
        elijoPokemon(pok1Fondo,pok1Nombre,pok1Nivel,pok1Vida);
    }
    @FXML
    public void clickOnPokemon2(ActionEvent event){
        elijoPokemon(pok2Fondo,pok2Nombre,pok2Nivel,pok2Vida);
    }
    @FXML
    public void clickOnPokemon3(ActionEvent event){
        elijoPokemon(pok3Fondo,pok3Nombre,pok3Nivel,pok3Vida);
    }
    @FXML
    public void clickOnPokemon4(ActionEvent event){
        elijoPokemon(pok4Fondo,pok4Nombre,pok4Nivel,pok4Vida);
    }
    @FXML
    public void clickOnPokemon5(ActionEvent event){
        elijoPokemon(pok5Fondo,pok5Nombre,pok5Nivel,pok5Vida);
    }
    @FXML
    public void clickOnPokemon6(ActionEvent event){
        elijoPokemon(pok6Fondo,pok6Nombre,pok6Nivel,pok6Vida);
    }
}