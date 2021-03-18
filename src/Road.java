public class Road implements Obstruction{
    public int lengthRoad;

    public Road(int lengthRoad) {
        this.lengthRoad = lengthRoad;
    }

    @Override
    public boolean readySetGo(RunableJumpable go) {
        return go.run(lengthRoad);
    }
}
