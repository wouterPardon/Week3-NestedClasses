package taak1;

public class MuscicienApp {
    public static void main(String[] args) {
        Musician musician = new Musician();
        musician.play();
        Musician.Instrument instrument = musician.new Instrument();
        instrument.makeNoise();
    }
}
