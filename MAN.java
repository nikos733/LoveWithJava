package HomeWork;

public class MAN implements OBSTACLES {

    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean active;

    public MAN(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 30;
        this.maxSwimDistance = 200;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " совершил удачный забег.");
        } else {
            System.out.println(name + " совершил неудачный забег.");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(name + " совершил удачный заплыв.");
        } else {
            System.out.println(name + " совершил удачный заплыв.");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " совершил удачный прыжок.");
        } else {
            System.out.println(name + " совершил неудачный прыжок.");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);
    }
}
