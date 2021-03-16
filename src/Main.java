public class Main {


    public static void main(String arg[]) {

        RunableJumpable[] runableJumpables = {
                new Cat("Barsik"),
                new Man("Fedor"),
                new Robot("Bot")
        };

        Wall[] arrWall = new Wall[3];
        arrWall[0] = new Wall(1);
        arrWall[1] = new Wall(2);
        arrWall[2] = new Wall(3);

        Road[] arrRoad = new Road[4];
        arrRoad[0] = new Road(90);
        arrRoad[1] = new Road(280);
        arrRoad[2] = new Road(720);
        arrRoad[3] = new Road(1210);


        for (RunableJumpable r : runableJumpables) {
            for (int x = 0; x < arrWall.length; x++) {
                System.out.println(r.jump(arrWall[x].heightWall));
                System.out.println(r.run(arrRoad[x].lengthRoad));
            }
        }

    }
}