
import java.util.LinkedList;

public class MazeSolver {
    static int[][] maze = {
            {1, 1, 1, 1, 0, 1, 1, 0, 1, 1},
            {1, 0, 1, 1, 0, 1, 1, 0, 1, 1},
            {0, 0, 0, 2, 0, 1, 1, 0, 0, 1},
            {1, 1, 0, 1, 0, 1, 1, 1, 1, 0},
            {1, 0, 1, 1, 1, 1, 1, 0, 1, 1},
            {0, 0, 0, 1, 0, 1, 1, 0, 1, 1}
    };

    static LinkedList<Position> path = new LinkedList<Position>();
    public static void main(String[] args) {
        Position p = new Position(4,8);
        path.push(p);

        while(true) {
            int y = path.peek().y;
            int x = path.peek().x;
            //Starting point
            maze[y][x] = 0;

            //down movement
            if (isValid(y+1, x)) {
                if (maze[y + 1][x] == 2) {
                    System.out.println("Moved down. yo won!!");
                    return;
                } else if (maze[y + 1][x] == 1) {
                    System.out.println("Moved down");
                    path.push(new Position(y + 1, x));
                    continue;
                }
            }

            //left movement
            if(isValid(y,x-1)) {
                if (maze[y][x - 1] == 2) {
                    System.out.println("Moved left. yo won!!");
                    return;
                } else if (maze[y][x - 1] == 1) {
                    System.out.println("Moved left");
                    path.push(new Position(y, x - 1));
                    continue;
                }
            }

            //up movement
            if(isValid(y-1, x)) {
                if (maze[y - 1][x] == 2) {
                    System.out.println("Moved up, yo won!!");
                    return;
                } else if (maze[y - 1][x] == 1) {
                    System.out.println("Moved up");
                    path.push(new Position(y - 1, x));
                    continue;
                }
            }

            //right
            if(isValid(y,x+1)) {
                if (maze[y][x + 1] == 2) {
                    System.out.println("Moved right. yo won!!");
                    return;
                } else if (maze[y][x + 1] == 1) {
                    System.out.println("Moved up");
                    path.push(new Position(y, x + 1));
                    continue;
                }
            }
            path.pop();
            System.out.println("moved back");
            if(path.size() <= 0){
                System.out.println("No path");
                return;
            }
        }
    }

    public static boolean isValid(int y, int x){
        if(y < 0 || y >= maze.length || x < 0 || x >= maze[y].length){
            return false;
        }
        return true;
    }
}
