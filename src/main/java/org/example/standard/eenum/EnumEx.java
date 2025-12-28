package org.example.standard.eenum;

public class EnumEx {

    enum Direction { EAST, WEST, SOUTH, NORTH }

    enum STATUS {

        NOT_FOUND(400),
        UNAUTHORIZED(401)
        ;

        private final int code;

        STATUS(int code) {
            this.code = code;
        }

        int getCode () {
            return this.code;
        }
    }

    public static void main(String[] args) {
        Direction direction = Direction.NORTH;

        String name = direction.name();
        System.out.println(name); // NORTH

        int ordinal = direction.ordinal();
        System.out.println(ordinal); // 3

        String string = direction.toString();
        System.out.println(string); // NORTH

        Direction directionByString = Direction.valueOf("NORTH");
        System.out.println(directionByString.name()); // NORTH

        Direction[] values = Direction.values();
        for (Direction value : values) {
            System.out.print(value.name() + " "); // EAST WEST SOUTH NORTH
        }
        System.out.println();

        printDir(direction);

        System.out.println(direction == directionByString); // true

        STATUS notFound = STATUS.NOT_FOUND;
        System.out.println(notFound); // NOT_FOUND
        System.out.println(notFound.name()); // NOT_FOUND
        System.out.println(notFound.getCode()); // 400



    }

    static void printDir(Direction direction) {
        switch (direction) {
            case EAST -> System.out.println("동");
            case WEST -> System.out.println("서");
            case SOUTH -> System.out.println("남");
            case NORTH -> System.out.println("북");
        }
    }

}
