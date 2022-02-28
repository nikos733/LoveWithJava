package HomeWork;

public abstract class BARRIER {
    public abstract void doIt(OBSTACLES OBSTACLES);
}

class WALL extends BARRIER {
    int height;

    public WALL(int height) {
        this.height = height;
    }

    @Override
    public void doIt(OBSTACLES OBSTACLES) {
        OBSTACLES.jump(height);
    }
}

class WATER extends BARRIER {
    int length;

    public WATER(int length) {
        this.length = length;
    }

    @Override
    public void doIt(OBSTACLES OBSTACLES) {
        OBSTACLES.swim(length);
    }
}

class CROSS extends BARRIER {
    int length;

    public CROSS(int length) {
        this.length = length;
    }

    @Override
    public void doIt(OBSTACLES OBSTACLES) {
        OBSTACLES.run(length);
    }
}

class MAINCROSS {
    public static void main(String[] args) {
        OBSTACLES[] OBSTACLES = {new MAN("Звездный Лорд"), new RPG24("Уорен"), new RPG25("Ронин")};
        BARRIER[] BARRIERS = {new CROSS(80), new WALL(5), new WATER(3)};

        for (OBSTACLES c : OBSTACLES) {
            for (BARRIER b : BARRIERS) {
                b.doIt(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
        for (OBSTACLES c : OBSTACLES) {
            c.info();
        }
    }
}