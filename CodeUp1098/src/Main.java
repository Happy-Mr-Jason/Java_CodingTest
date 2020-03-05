import java.util.*;

public class Main {
    public static void main(String[] args) {
        int panel_h = 0; //h
        int panel_w = 0; //w
        int stick_amount = 0; //n
        ArrayList<Stick> sticks = new ArrayList<Stick>();
        Scanner sc = new Scanner(System.in);
        panel_h = sc.nextInt();
        panel_w = sc.nextInt();
        stick_amount = sc.nextInt();
        int panel_result[][] = new int[panel_h][panel_w];
//        System.out.print("panel h : " + panel_h + " panel w : " + panel_w + " stick amount : " + stick_amount);

        for (int i = 0; i < stick_amount; i++) {
            int length = sc.nextInt();
            int layer = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            Stick stick = new Stick(length, layer, x, y);
//            System.out.println(stick);
            sticks.add(stick);
        }
        sc.close();
//        System.out.println("Stick Amount : " + sticks.size());

        for (int i = 0; i < sticks.size(); i++) {
            int s_length = sticks.get(i).getStick_length();
            int layer = sticks.get(i).getStick_layer();
            int x = sticks.get(i).getStart_x();
            int y = sticks.get(i).getStart_y();
//            System.out.println("Result : " + s_length + " " + layer + " " + x + " " + y);
            if (layer == 0) {
                for (int k = y; k < (y + s_length); k++) {
                    panel_result[x][k] = 1;
                }
            } else {
                for (int j = x; j < (x + s_length); j++) {
                    panel_result[j][y] = 1;
                }
            }
//            System.out.println("a Line Pasing End!!");
        }

//        System.out.println("Print Result!!");
        for (int i = 0; i < panel_h; i++) {
            for (int j = 0; j < panel_w; j++) {
                System.out.print(String.valueOf(panel_result[i][j]));
                if (j != panel_w - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class Stick {
    private int stick_length; //l
    private int stick_layer; //d 0:horizental 1:vertical
    private int point_x; //position x
    private int point_y; //position y
    private int start_x; //start position x
    private int start_y; //start position y

    public Stick(int stick_length, int stick_layer, int point_x, int point_y) {
        this.stick_length = stick_length;
        this.stick_layer = stick_layer;
        this.point_x = point_x;
        this.point_y = point_y;
        this.start_x = point_x - 1;
        this.start_y = point_y - 1;
    }

    public int getStart_x() {
        return start_x;
    }

    public int getStart_y() {
        return start_y;
    }

    public int getStick_length() {
        return stick_length;
    }

    public void setStick_length(int stick_length) {
        this.stick_length = stick_length;
    }

    public int getStick_layer() {
        return stick_layer;
    }

    public void setStick_layer(int stick_layer) {
        this.stick_layer = stick_layer;
    }

    public int getPoint_x() {
        return point_x;
    }

    public void setPoint_x(int point_x) {
        this.point_x = point_x;
    }

    public int getPoint_y() {
        return point_y;
    }

    public void setPoint_y(int point_y) {
        this.point_y = point_y;
    }

    @Override
    public String toString() {

        return stick_length + " " + stick_layer + " " + point_x + " " + point_y;
    }
}