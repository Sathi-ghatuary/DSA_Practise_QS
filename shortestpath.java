public class shortestpath {
    public static float path(String pt) {
        int X = 0, Y = 0;
        for (int i = 0; i < pt.length(); i++) {
            char dir = pt.charAt(i);
            if (dir == 'S') {
                Y--;
            } else if (dir == 'N') {
                Y++;
            } else if (dir == 'E') {
                X++;
            } else {
                X--;
            }

        }
        int X2 = X * X;
        int Y2 = Y * Y;

        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String pt = "WNEENESENNN";
        System.out.print(path(pt));
    }
}
