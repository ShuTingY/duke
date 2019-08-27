import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Duke {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Listing list = new Listing();

        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        Message.greeting();
        try {
            Files.printFileContents();

            while (true) {
                try {
                    String[] msg = sc.nextLine().trim().split(" ", 2);
                    if (msg[0].equals("bye")) {
                        Message.leavingMsg();
                        break;
                    } else if (msg[0].equals("list")) {
                        list.listing(msg);
                    } else if (msg[0].equals("done")) {
                        list.mark(msg);
                    } else if (msg[0].equals("todo")) {
                        list.addTodo(msg);
                    } else if (msg[0].equals("deadline")) {
                        list.addDeadline(msg);
                    } else if (msg[0].equals("event")) {
                        list.addEvent(msg);
                    } else if (msg[0].equals("delete")) {
                        list.delete(msg);
                    } else {
                        list.invalidInput();
                    }
                } catch (DukeException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
                    System.out.println("../data/duke.txt does not exist!");
        }
    }

}
