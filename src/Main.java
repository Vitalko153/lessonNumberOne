public class Main {

    public static void main(String arg[]) {

        RunableJumpable[] runableJumpables = {
                new Cat("Barsik"),
                new Man("Fedor"),
                new Robot("Bot")
        };

        Obstruction[] obstructions = {
                new Road(90),
                new Wall(1),
                new Road(280),
                new Wall(2),
                new Road(720),
                new Wall(3),
                new Road(1210),
        };


        for (RunableJumpable r : runableJumpables) {
            for (Obstruction o : obstructions){
               if (!o.readySetGo(r)){
                   break;
               }
            }

        }

    }
}