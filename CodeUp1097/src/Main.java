import java.util.*;

public class Main {
    public static void main(String[] args) {
        int go_panel[][] = new int[20][20];
        int pointAmount = 0;
        ArrayList<ReversePoint> points = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < go_panel.length; i++) {
            for (int j = 1; j < go_panel[i].length; j++) {
                go_panel[i][j] = sc.nextInt();
            }
        }
        pointAmount = sc.nextInt();
        for (int i = 0; i < pointAmount; i++) {
            int point_x = sc.nextInt();
            int point_y = sc.nextInt();
            ReversePoint point = new ReversePoint(point_x, point_y);
            points.add(point);
        }

        for (int i = 0; i < points.size(); i++) {
            int point_x = points.get(i).getX();
            int point_y = points.get(i).getY();
            for (int k = 1; k < go_panel.length; k++) {
                if (go_panel[k][point_y] == 0) {
                    go_panel[k][point_y] = 1;
                } else {
                    go_panel[k][point_y] = 0;
                }
                if (k == point_x) {
                    for (int j = 1; j < go_panel[k].length; j++) {

                        if (go_panel[k][j] == 0) {
                            go_panel[k][j] = 1;
                        } else {
                            go_panel[k][j] = 0;
                        }
                    }

                }
            }
        }
        for (int i = 1; i < go_panel.length; i++) {
            for (int j = 1; j < go_panel[i].length; j++) {
                System.out.print(go_panel[i][j]);
                if(j != go_panel[i].length){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class ReversePoint {
    private int x;
    private int y;

    public ReversePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
