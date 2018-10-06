package opdracht2;

public class HorrorShow {
    public static void main(String[] args) {
        class Vampire implements Monster {
            public void Vampire(){}
            @Override
            public void menace() {
                System.out.println("I'll drink your blood!");
            }
        }

        class Werewolf implements DangerousMonster {
            public void Werewolf(){}
            @Override
            public void destroy(Monster monster) {
                menace();
                System.out.println("Big fight... " + this.getClass() + " killed one! " + monster.getClass());
            }

            @Override
            public void menace() {
                System.out.println("I'll destroy you!");
            }
        }
        Werewolf werewolf = new Werewolf();
        Vampire vampire = new Vampire();
        werewolf.destroy(vampire);
        vampire.menace();
    }
}
