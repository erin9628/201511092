enum Shape {TRIANGLE, SQUARE}
Shape sel=Shape.TRIANGLE;
int size=100;
int sides;
double angle;
switch (sel) {
    case TRIANGLE:
        sides=3;
        angle=120;
        break;
    case SQUARE:
        sides=4;
        angle=90;
        break;
}

