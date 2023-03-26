package marc21;

public class NemTamogatottJatek extends Exception {

    // deafult es parameteres konstruktorok?

    @Override
    public void printStackTrace() {
        System.out.println("Ez a jatek nem tamogatott ezen a konzolon!");;
    }
}
