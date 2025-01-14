package Week_3.ExceptionLesson;

public class ImmutableClass {

    private final int x; // once created cannot modified.
    private final int y;

    public ImmutableClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }

        if(o== null || getClass() != o.getClass()){
            return false;
        }

        ImmutableClass that = (ImmutableClass) o;
        return x == that.x && y == that.y;


    }

}
