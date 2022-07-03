package exercicio;

public class ArCondicionado {

    private String modelo;
    private int temperatura;
    private int velocidade;
    private boolean estaLigado;

    private boolean estaOscilando;
    private int timer;


    public ArCondicionado(){}


    public ArCondicionado(String modelo, int temperatura){
        this.modelo = modelo;
        this.temperatura = temperatura;
    }

    public ArCondicionado(String modelo, int temperatura, int velocidade, boolean estaLigado, boolean estaOscilando, int timer) {
        this.modelo = modelo;
        this.temperatura = temperatura;
        this.velocidade = velocidade;
        this.estaLigado = estaLigado;
        this.estaOscilando = estaOscilando;
        this.timer = timer;
    }

    public void ligar(){
        estaLigado = true;
    }

    public void desligar(){
        estaLigado = false;
    }

    public void aumentaTemperatura(){
        temperatura = temperatura +2;
    }

    public void diminuiTemperatura(){
        temperatura = temperatura -2;
    }

    public void ligaOscilacao(){
        estaOscilando = true;
    }

    public void desligaOscilacao(){
        estaOscilando = false;
    }

    public void ligaTimer(int tempo){
        timer = tempo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public boolean isEstaOscilando() {
        return estaOscilando;
    }

    public void setEstaOscilando(boolean estaOscilando) {
        this.estaOscilando = estaOscilando;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
}
