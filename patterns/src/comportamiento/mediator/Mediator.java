package comportamiento.mediator;

abstract public class Mediator {
    abstract void registra(Colleague colleague);
    abstract void reenvia(Colleague colleague);
}
