package MeowOrDie;

import java.util.Scanner;

public class zeze {

    public static void Game() {
        Scanner scan = new Scanner(System.in);

        System.out.println("player 1 = X");
        System.out.println("player 2 = O");
        System.out.println();
        String field[][] = new String[3][3];
        for (int o = 0; o < 3; o++) {
            field[0][o] = (" [ ] ");
            System.out.print(field[0][o]);
        }
        System.out.println();
        for (int o = 0; o < 3; o++) {
            field[1][o] = (" [ ] ");
            System.out.print(field[1][o]);
        }
        System.out.println();
        for (int o = 0; o < 3; o++) {
            field[2][o] = (" [ ] ");
            System.out.print(field[2][o]);
        }
        int x = 1;
        int o = 0;
        String sep;
        int end = 0;
        int v = 0;
            while (end < 9) {
                if (v != 0) {
                    for (int i = 0; i < 3; i++) {
                        System.out.println();
                        for (o = 0; o < 3; o++) {
                            System.out.print(field[i][o]);
                        }
                    }
                }
                switch (sep = scan.next()) {
                    case "1": {
                        if (field[0][0] == (" [ ] ")) {
                            if (x == 1) {
                                field[0][0] = (" [X] ");
                                x--;
                                end++;

                                break;
                            } else {
                                field[0][0] = (" [O] ");
                                x++;
                                end++;
                                break;
                            }
                        } else {
                            System.out.println("Эта клетка занята, введите другую.");
                            break;
                        }
                    }
                    case "2": {
                        if (field[0][1] == (" [ ] ")) {
                            if (x == 1) {
                                field[0][1] = (" [X] ");
                                x--;
                                end++;
                                break;
                            } else {
                                field[0][1] = (" [O] ");
                                x++;
                                end++;
                                break;
                            }
                        } else {
                            System.out.println("Эта клетка занята, введите другую.");
                            break;
                        }
                    }
                    case "3": {
                        if (field[0][2] == (" [ ] ")) {
                            if (x == 1) {
                                field[0][2] = (" [X] ");
                                x--;
                                end++;
                                break;
                            } else {
                                field[0][2] = (" [O] ");
                                x++;
                                end++;
                                break;
                            }
                        } else {
                            System.out.println("Эта клетка занята, введите другую.");
                            break;
                        }
                    }
                    case "4": {
                        if (field[1][0] == (" [ ] ")) {
                            if (x == 1) {
                                field[1][0] = (" [X] ");
                                x--;
                                end++;
                                break;
                            } else {
                                field[1][0] = (" [O] ");
                                x++;
                                end++;
                                break;
                            }
                        } else {
                            System.out.println("Эта клетка занята, введите другую.");
                            break;
                        }
                    }
                    case "5": {
                        if (field[1][1] == (" [ ] ")) {
                            if (x == 1) {
                                field[1][1] = (" [X] ");
                                x--;
                                end++;
                                break;
                            } else {
                                field[1][1] = (" [O] ");
                                x++;
                                end++;
                                break;
                            }
                        } else {
                            System.out.println("Эта клетка занята, введите другую.");
                            break;
                        }
                    }
                    case "6": {
                        if (field[1][2] == (" [ ] ")) {
                            if (x == 1) {
                                field[1][2] = (" [X] ");
                                x--;
                                end++;
                                break;
                            } else {
                                field[1][2] = (" [O] ");
                                x++;
                                end++;
                                break;
                            }
                        } else {
                            System.out.println("Эта клетка занята, введите другую.");
                            break;
                        }
                    }
                    case "7": {
                        if (field[2][0] == (" [ ] ")) {
                            if (x == 1) {
                                field[2][0] = (" [X] ");
                                x--;
                                end++;
                                break;
                            } else {
                                field[2][0] = (" [O] ");
                                x++;
                                end++;
                                break;
                            }
                        } else {
                            System.out.println("Эта клетка занята, введите другую.");
                            break;
                        }
                    }
                    case "8": {
                        if (field[2][1] == (" [ ] ")) {
                            if (x == 1) {
                                field[2][1] = (" [X] ");
                                x--;
                                end++;
                                break;
                            } else {
                                field[2][1] = (" [O] ");
                                x++;
                                end++;
                                break;
                            }
                        } else {
                            System.out.println("Эта клетка занята, введите другую.");
                            break;
                        }
                    }
                    case "9": {
                        if (field[2][2] == (" [ ] ")) {
                            if (x == 1) {
                                field[2][2] = (" [X] ");
                                x--;
                                end++;
                                break;
                            } else {
                                field[2][2] = (" [O] ");
                                x++;
                                end++;
                                break;
                            }
                        } else {
                            System.out.println("Эта клетка занята, введите другую.");
                            break;
                        }
                    }
                    default:
                        System.out.println("недопустимая клетка");
                        break;
                }
                v++;
                for (int b = 0; b < 3; b++) {
                    if (((field[b][0]) == " [X] " && (field[b][1]) == " [X] " && (field[b][2]) == " [X] ") || ((field[0][b]) == " [X] " && (field[1][b]) == " [X] " && (field[2][b]) == " [X] ")) {
                        System.out.println("Победил игрок 1");
                        end = end + 10;
                    } else if (((field[b][0]) == " [O] " && (field[b][1]) == " [O] " && (field[b][2]) == " [O] ") || ((field[0][b]) == " [O] " && (field[1][b]) == " [O] " && (field[2][b]) == " [O] ")) {
                        System.out.println("Победил игрок 2");
                        end = end + 10;
                    }
                }
                if (((field[0][0]) == " [X] " && (field[1][1]) == " [X] " && (field[2][2]) == " [X] ") || ((field[0][2]) == " [X] " && (field[1][1]) == " [X] " && (field[2][0]) == " [X] ")) {
                    System.out.println("Победил игрок 1");
                    end = end + 10;
                } else if (((field[0][0]) == " [O] " && (field[1][1]) == " [O] " && (field[2][2]) == " [O] ") || ((field[0][2]) == " [O] " && (field[1][1]) == " [O] " && (field[2][0]) == " [O] ")) {
                    System.out.println("Победил игрок 2");
                    end = end + 10;
                }
            }
            for (int i = 0; i < 3; i++) {
                System.out.println();
                for (o = 0; o < 3; o++) {
                    System.out.print(field[i][o]);
                }
            }
            System.out.println("Game Over");
    }










    public static void main(String[] args) {

        Game();
    }
}
