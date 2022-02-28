package HomeWork;

public class ROBOTS implements OBSTACLES {

    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    public ROBOTS(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " совершил удачный забег.");
        } else {
            System.out.println(type + " " + name + " совершил неудачный забег.");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " совершил удачный заплыв.");
        } else {
            System.out.println(type + " " + name + " совершил неудачный заплыв.");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " совершил удачный прыжок.");
        } else {
            System.out.println(type + " " + name + " совершил неудачный прыжжок.");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + onDistance);
    }
}
