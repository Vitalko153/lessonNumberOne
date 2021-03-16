public class Robot implements RunableJumpable{
    private String name;
    private int MAX_JUMP_HEIGHT = 5;
    private int MAX_RUN_LENGTH = 1000;

    Robot(String name){
        this.name = name;
    }


    public String run(int lengthRoad) {
        if(MAX_RUN_LENGTH >= lengthRoad){
            return (name + " пробежал " + lengthRoad + " метров.");
        }
        return (name + " не смог пробежать " + lengthRoad + " метров.");
    }


    public String jump(int heightWall) {
        if (MAX_JUMP_HEIGHT >= heightWall) {
            return (name + " прыгнул на " + heightWall + " метра.");
        }
        else {
            return (name + " не смог прыгнуть на " + heightWall + " метра.");
        }
    }
}
