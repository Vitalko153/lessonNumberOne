public class Wall implements Obstruction{
    public int heightWall;

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    @Override
    public boolean readySetGo(RunableJumpable go) {
        return go.jump(heightWall);
    }
}
