package duke.taskList;

import duke.Duke;
import duke.parser.Task;
import duke.storage.Storage;
import duke.DukeException;
import duke.parser.Todo;
import duke.parser.Event;
import duke.parser.Deadline;

import java.io.IOException;
import java.util.ArrayList;

public class TaskList {
    protected ArrayList<Task> list;

    public TaskList() {
        this.list = new ArrayList<>();
    }

    public TaskList(ArrayList<Task> list) throws DukeException {
        if (list.size() > 0) {
            this.list = list;
        } else {
            throw new DukeException("Empty");
        }
    }

    public ArrayList<Task> getList() {
        return list;
    }


//    public void add(String msg) {
//        try {
//            Task task = new Task(msg);
//            list.add(task);
//            Files.appendToFile(task.toString());
//            System.out.println(String.format("added: %s", msg));
//        } catch (IOException e) {
//            System.out.println("Unable to write the file");
//        }
//    }

    // msg[0] = event, msg[1] = description
    // throw exception when
    // the description is empty
//    public void addTodo(String[] msg) throws DukeException {
//        if(msg.length == 2 && !msg[1].trim().equals("")) {
//            try {
//                Task task = new Todo(msg[1]);
//                list.add(task);
//                Storage.appendToFile(String.format("T | 0 | %s\n",
//                        task.getDescription()));
//                //ui.addingMsg
//                System.out.println(String.format(
//                        "Got it. I\'ve added this task:\n  "
//                                + task + "\nNow you have %s tasks in the list", Task.getNoOfTask()));
//            } catch (IOException e) {
//                //error msg
//                System.out.println("Unable to write the file");
//            }
//        }else {
//            throw new DukeException("\u1F65 OOPS!!! The description of a todo cannot be empty.");
//        }
//    }

    // msg[0] = event, msg[1] = description
    // throw exception when
    // 1. description is empty
    // 2. timeDate leaved empty
//    public void addDeadline(String[] msg) throws DukeException {
//        if(msg.length > 1) {
//            String[] msgs = msg[1].split("/by");
//            //check is the description correct.
//            if(msgs.length == 2 && !msgs[1].equals(" ") && !msgs[0].equals("")) {
//                try {
//                    Task task = new Deadline(msgs[0], msgs[1]);
//                    Storage.appendToFile(
//                            String.format("D | 0 | %s | %s\n",
//                                task.getDescription(),
//                                task.getInformation()));
//                    list.add(task);
//                    //added msg
//                    System.out.println(String.format(
//                            "Got it. I\'ve added this task:\n  "
//                                    + task + "\nNow you have %s tasks in the list", Task.getNoOfTask()));
//                } catch (IOException e) {
//                    //error msg
//                    System.out.println("Unable to write the file");
//                }
//            }else {
//                throw new DukeException("\u1F65 OOPS!!! The format of the description of a deadline is wrong");
//
//            }
//        }else {
//            throw new DukeException("\u1F65 OOPS!!! The description of a deadline cannot be empty.");
//        }
//    }

    //msg[0] = event, msg[1] = description
    //throw exception when
    // throw exception when
    //    // 1. description is empty
    //    // 2. timeDate leaved empty
//    public void addEvent (String[] msg) throws DukeException {
//        if(msg.length > 1) {
//            String[] msgs = msg[1].split("/at");
//            if(msgs.length == 2 && !msgs[1].equals(" ") && !msgs[0].equals("")) {
//                try {
//                    Task task = new Event(msgs[0], msgs[1]);
//                    list.add(task);
//                    Storage.appendToFile(
//                            String.format("E | 0 | %s | %s\n",
//                                task.getDescription(),
//                                task.getInformation()));
//
//                    //add file msg
//                    System.out.println(String.format(
//                            "Got it. I\'ve added this task:\n  "
//                                    + task + "\nNow you have %s tasks in the list", Task.getNoOfTask()));
//                } catch (IOException e) {
//
//                    //error msg
//                    System.out.println("Unable to write the file");
//                }
//            }else {
//                throw new DukeException("\u1F65 OOPS!! The format of the description of a deadline is wrong.");
//            }
//        }else {
//            throw new DukeException("\u1F65 OOPS!! The description of a deadline cannot be empty.");
//        }
//    }

    //when the input is invalid
//    public void invalidInput() throws DukeException {
//        throw new DukeException("\u1F65 OOPS!! I\'m sorry, but I don\'t know what that means :-(");
//    }

    //msg[0] = done msg[1] = integer
    //throw exception when msg[1] is not an num
    //throw exception when msg[1] is out of list range
    //throw exception when the format is wrong
//    public void mark(String[] msg) throws DukeException {
//        if(msg.length == 2) {
//            try {
//                int index = Integer.parseInt(msg[1].trim());
//                if(index > list.size()) {
//                    throw new DukeException("\u1F65 OOPS! the Number you\'ve key in is to big");
//                } else if (index < 1) {
//                    throw new DukeException("OOPS!! The number should be larger than 0");
//                } else {
//                    try {
//                        Task tk = list.get(index - 1);
//                        tk.markAsDone();
//                        Storage.updateFile(list);
//
//                        //marked msg
//                        System.out.println(
//                                String.format("Nice! I've marked this task as done:\n"
//                                        + "  " + tk));
//                    } catch (IOException e) {
//                        //error msg
//                        System.out.println("Unable to write the file");
//                    }
//                }
//            } catch (NumberFormatException ex) {
//                throw new DukeException("\u1F65 OOPS! Invalid number as input");
//            }
//        } else {
//            throw new DukeException("\u1F65 OOPS!! The format of the input is wrong");
//        }
//    }

    //msg should only contain "list" and no other things
//    public void listing(String[] msg) throws DukeException {
//        if(msg.length == 1) {
//            System.out.println("Here are the tasks in your list:");
//            for (int i = 0; i < list.size(); i++) {
//                Task tk = list.get(i);
//                System.out.println(i + 1 + "." + tk);
//            }
//        } else {
//            throw new DukeException("\u1F65 OOPS!! I\'m sorry, but I don\'t know what that means :-(");
//        }
//    }

    //msg[0] = delete msg[1] = integer
    //throw exception when msg[1] is not an num
    //throw exception when msg[1] is out of list range
    //throw exception when the format is wrong
//    public void delete(String[] msg) throws DukeException {
//        if(msg.length == 2) {
//            try {
//                int index = Integer.parseInt(msg[1].trim());
//                if(index > list.size()) {
//                    throw new DukeException("\u1F65 OOPS! the Number you\'ve key in is to big");
//                } else if (index < 1) {
//                    throw new DukeException("OOPS!! The number should be larger than 0");
//                } else {
//                    try {
//                        Task tk = list.get(index - 1);
//                        list.remove(index - 1);
//                        Task.reduceByOne();
//                        Storage.updateFile(list);
//
//                        //removed msg
//
//                        System.out.println(String.format(
//                                "Noted. I\'ve removed this task: \n  "
//                                        + tk + "\nNow you have %d tasks in the list.", Task.getNoOfTask()));
//                    } catch (IOException e) {
//                        //error msg
//                        System.out.println("Unable to write the file");
//                    }
//                }
//            } catch (NumberFormatException ex) {
//                throw new DukeException("\u1F65 OOPS! Invalid number as input");
//            }
//        } else {
//            throw new DukeException("\u1F65 OOPS!! The format of the input is wrong");
//        }
//    }
}
