package taak1;

public class Musician {

    public void play() {
        Instrument instrument = new Instrument();
        instrument.makeNoise();
    }
    public class Instrument {
        public void makeNoise() {
            System.out.println("Een stukje tekst");
        }
    }
}
