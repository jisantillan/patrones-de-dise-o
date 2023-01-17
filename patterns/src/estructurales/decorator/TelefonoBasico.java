package estructurales.decorator;

public class TelefonoBasico implements Telefono{

    @Override
    public void crear() {
        System.out.println("Teléfono Básico:");
    }

    private void tengoGSM(){
        System.out.println("        ->Tengo GSM");
    }


    private void tengoSMS  (){
        System.out.println("        ->Tengo Sms");
    }
}
