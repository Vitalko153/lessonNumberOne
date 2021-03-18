public class Man implements RunableJumpable{
    private String name;
    private int MAX_JUMP_HEIGHT = 2;
    private int MAX_RUN_LENGTH = 500;

    Man(String name) {
        this.name = name;
    }

    @Override
    public boolean run(int lengthRoad) {
        if(MAX_RUN_LENGTH >= lengthRoad){
            System.out.println(name + " пробежал " + lengthRoad + " метров.");
            return true;
        }
        System.out.println(name + " не смог пробежать " + lengthRoad + " метров.");
        return false;
    }

    @Override
    public boolean jump(int heightWall) {
        if (MAX_JUMP_HEIGHT >= heightWall) {
            System.out.println(name + " прыгнул на " + heightWall + " метра.");
            return true;
        }
        else {
            System.out.println(name + " не смог прыгнуть на " + heightWall + " метра.");
            return false;
        }
    }
}
