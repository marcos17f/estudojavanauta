package associaçao;

public class Carro {
    //Atributto do tipo motor
private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public Carro(int Cilindradas){
        this.motor = new Motor(Cilindradas);
    }

    public void mostrarCilindradas(){
        System.out.println("O carro com motor de " + motor.getCilindradas() + " Cilindradas" );
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
