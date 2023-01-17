package comportamiento.mediator;

abstract public class Colleague {

    public Mediator mediator;
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void recibe();
    abstract void envia();
}
